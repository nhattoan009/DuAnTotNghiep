/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;

public class MoneyCurrency {

    private static final Currency vnd = Currency.getInstance("VND");
    private static final RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;

    private final BigDecimal amount;
    private final Currency currency;   

    public static MoneyCurrency dollars(BigDecimal amount) {
        return new MoneyCurrency(amount, vnd);
    }

    MoneyCurrency(BigDecimal amount, Currency currency) {
        this(amount, currency, DEFAULT_ROUNDING);
    }

    MoneyCurrency(BigDecimal amount, Currency currency, RoundingMode rounding) {
        this.currency = currency;      
        this.amount = amount.setScale(currency.getDefaultFractionDigits(), rounding);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return getCurrency().getSymbol() + " " + getAmount();
    }

    public String toString(Locale locale) {
        return getCurrency().getSymbol(locale) + " " + getAmount();
    }   
}