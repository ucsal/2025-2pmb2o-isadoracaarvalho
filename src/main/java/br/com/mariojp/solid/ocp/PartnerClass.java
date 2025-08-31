package br.com.mariojp.solid.ocp;

public class PartnerClass implements DiscountPolicy {
    public double apply(double amount) {
        return amount * 0.88;
    }
}
