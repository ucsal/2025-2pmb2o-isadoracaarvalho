package br.com.mariojp.solid.ocp;

public class RegularClass implements DiscountPolicy {
    public double apply(double amount) { return amount * 0.95; }
}
