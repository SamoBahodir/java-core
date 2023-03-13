package com.example.demo.calculator;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorUtil {
    public List<CalculatorResponse> oddiy(double balance,
                                          double moon,
                                          double percentage,
                                          double insuranceCosts,
                                          double notaryExpenses,
                                          double anotherExpenses) {
        List<CalculatorResponse> responses = new ArrayList<>();
        double asosiyQarz;
        double sum;
        double percentage1 = percentage / 1000;
        double oylikKridit = balance / moon;
        for (int i = 0; i < moon; i++) {
            CalculatorResponse response = new CalculatorResponse();
            sum = balance * percentage1;
            System.out.println(asosiyQarz = oylikKridit + sum);
            response.setTotalMonthlyPayment(asosiyQarz = oylikKridit + sum);
            response.setBalance(balance);
            response.setPercentage(sum);
            asosiyQarz = oylikKridit;
            response.setPrincipalDebt(asosiyQarz);
            balance = balance - oylikKridit;
            response.setAnotherExpenses(anotherExpenses);
            response.setCommissionFee(notaryExpenses);
            response.setPersonalExpenses(insuranceCosts);
            response.setMoon(i + 1);
            responses.add(response);
        }
        return responses;
    }

    public List<CalculatorResponse> annuitet(double balance,
                                             double moon,
                                             double percentage,
                                             double insuranceCosts,
                                             double notaryExpenses,
                                             double anotherExpenses) {
        double balanse1 = balance*percentage/moon*Math.pow(1+percentage/moon,moon);
        int i=0;
        List<CalculatorResponse> responses = new ArrayList<>();
        while (balance > 0) {
            CalculatorResponse response = new CalculatorResponse();
            double p=balance*percentage/1000;
            response.setTotalMonthlyPayment(balanse1);
            response.setBalance(balance-p);
            response.setMoon(i++);
            responses.add(response);
        }
        return responses;
    }

    public double sum(double balance, double percentage, double moon) {
        double i = percentage / 100 / moon;
        System.out.println(i);
        double d1 = i * Math.pow(1 + i, moon);
        System.out.println(d1);
        double d2 = Math.pow(1 + i, moon) - 1;
        System.out.println(d2);
        System.out.println(balance * d1 / d2);
        return balance * d1 / d2;
    }
}
