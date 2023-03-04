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
        double oylikKridit = balance / moon;
        for (int i = 0; i < moon; i++) {
            CalculatorResponse response = new CalculatorResponse();
            sum = balance * percentage;
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
        List<CalculatorResponse> responses = new ArrayList<>();
        double asosiyQarz;
        double sum;
        double oylikKridit = balance / moon;
        for (int i = 0; i < moon; i++) {
            CalculatorResponse response = new CalculatorResponse();
            sum = balance * percentage;
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
}
