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
        double i = percentage / moon / 100;
        double d = i * Math.pow(1 + i, moon);
        double d1 = Math.pow(1 + i, moon) - 1;
        double m = balance * d / d1;
        List<CalculatorResponse> responses = new ArrayList<>();
        for (int j = 0; j < moon; j++) {
            CalculatorResponse response = new CalculatorResponse();
            double percentage1 = balance * percentage / 1000;
            response.setBalance(balance);
            double a = (m - percentage1);
            response.setPrincipalDebt(Math.round(a/1.00));
            response.setPercentage(percentage1);
            response.setTotalMonthlyPayment(m);
            response.setAnotherExpenses(anotherExpenses);
            response.setCommissionFee(notaryExpenses);
            response.setPersonalExpenses(insuranceCosts);
            response.setMoon(j + 1);
            balance = balance - (m - percentage1);
            responses.add(response);
        }
        return responses;
    }
}
