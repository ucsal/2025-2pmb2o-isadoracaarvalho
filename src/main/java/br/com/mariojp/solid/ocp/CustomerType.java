package br.com.mariojp.solid.ocp;
public enum CustomerType {

    REGULAR( new RegularClass() ),
    PREMIUM( new PremiumClass() ),
    PARTNER( new PartnerClass() );

    private DiscountPolicy discountPolicy;

    CustomerType(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double apply(double amount) {
        return discountPolicy.apply(amount);
    }
}
