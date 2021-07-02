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
        int ctr = 0;
        for (var employee : employees) {
            if (employee.isManager()){
                ctr++;
            }
        }
        return ctr;
    }

    public void CalculateExpenses(){
        double totalSalaryExpenses = 0;
        double totalBookExpense = 0;
        double managerBonus = 0;

        for(var employee : employees){
            double currentSalary = employee.getSalary();
            totalSalaryExpenses += currentSalary;
        }
        double win = 0;
        for(var edition : editions){
            double currentBook = edition.sumTotalExpenses();
            currentBook += totalBookExpense;
            double currentWin = edition.sellingPrice();
            currentWin += win;
        }


        double totalExpenses =  totalBookExpense + totalSalaryExpenses;
        double sum = win - totalExpenses;

        if ( sum > 0) {
            var managerBonusDivide = sum / managerCount();
            var printManagerBonus = String.format("Managers should receive %.2f each", managerBonusDivide);
            System.out.println(printManagerBonus);
        }
        var PrintRegular = String.format("Salary expenses are :  %.2f", totalSalaryExpenses);
        System.out.println(PrintRegular);
    }
}
