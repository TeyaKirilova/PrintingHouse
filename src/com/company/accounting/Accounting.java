package com.company.accounting;

import com.company.printinghouse.Edition;
import com.company.printinghouse.Employee;
import java.util.List;

public class Accounting {
    private final List<Edition> editions;
    private final List<Employee> employees;

    public Accounting(List<Edition> editions, List<Employee> employees) {

        this.editions = editions;
        this.employees = employees;

    }

    public int managerCount() {
        int ctr = 0;
        for (var employee : employees) {
            if (employee.isManager()){
                ctr++;
            }
        }
        return ctr;
    }

    public double calculateExpenses(){
        double totalSalaryExpenses = 0;
        double totalBookExpense = 0;

        for (var employee : employees) {
            double currentSalary = employee.getSalary();
            totalSalaryExpenses += currentSalary;
        }

        for (var edition : editions) {
            double currentBookPrice = edition.sumTotalExpenses();
            totalBookExpense += currentBookPrice;
        }

        double totalExpenses;
        totalExpenses = totalBookExpense + totalSalaryExpenses;

        return totalExpenses;
    }

    public double getProfit() {
        double profit = 0;

        for (var edt : editions) {
            var current = edt.sellingPrice();
            profit += current;
        }

        return profit;
    }

    public double getRemainingMoney() {
        double sum = getProfit() - calculateExpenses();

        if ( sum > 0) {
            return sum / managerCount();
        }

        return 0;
    }
}
