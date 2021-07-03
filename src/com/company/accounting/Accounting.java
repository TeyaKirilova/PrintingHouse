package com.company.accounting;

import com.company.printinghouse.Edition;
import com.company.printinghouse.Employee;
import java.util.List;

public class Accounting {
    private List<Edition> editions;
    private List<Employee> employees;

    public Accounting(List<Edition> editions, List<Employee> employees) {

        this.editions = editions;
        this.employees = employees;
    }

    public List<Edition> getEdition() {
        return editions;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int managerCount() {
        int ctr = 0; // count managers
        for (var employee : employees) {
            if (employee.isManager()){
                ctr++; // we use helper func to find all managers in the list, when we find one, we
                // increment the counter end return it
            }
        }
        return ctr;
    }

    public double calculateExpenses(){
        double totalSalaryExpenses = 0;
        double totalBookExpense = 0;

        for (var employee : employees) {
            double currentSalary = employee.getSalary(); //for each iteration we get the
            totalSalaryExpenses += currentSalary; // salary and sum it
        }

        for (var edition : editions) {
            double currentBookPrice = edition.sumTotalExpenses();
            totalBookExpense += currentBookPrice; // sum total expenses for books in the list
        }

        double totalExpenses; // expenses for books + salary
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

    public void getRemainingMoney() {
        double sum = getProfit() - calculateExpenses(); //helper var to get the diff between the income and outcome

        if ( sum > 0) { // if we have diff, greater than 0, we divide it between the managers
            var managerBonusDivide = sum / managerCount();
            var printManagerBonus = String.format("Managers should receive %.2f each", managerBonusDivide);
            System.out.println(printManagerBonus);
        }
    }
}
