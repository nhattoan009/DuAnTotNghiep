/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author huynh
 */
public class bigDecimal {

    public static String formatCurrency(double value) {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(5);
        format.setRoundingMode(RoundingMode.HALF_EVEN);
        return format.format(value);
    }

    public static void main(String[] args) {
//        BigDecimal bigDecimal = new BigDecimal(22.121455);
//        System.out.println("bigDecimal = " + formatCurrency(bigDecimal.doubleValue()));

        BigDecimal modelVal = new BigDecimal("300000");
        BigDecimal displayVal = modelVal.setScale(2, RoundingMode.HALF_EVEN);

        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
//        format.setMinimumFractionDigits(1);
//        format.setMaximumFractionDigits(2);
        System.out.println(format.format(displayVal));

//        MoneyCurrency price = MoneyCurrency.dollars(bigDecimal);
//        System.out.println(price);
        int dntt = 5;
        BigDecimal gia = new BigDecimal(5000);
        BigDecimal g = gia.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(g.multiply(new BigDecimal(dntt)));
    }
}
