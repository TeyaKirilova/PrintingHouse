package com.company.utils;

import com.company.accounting.Accounting;
import com.company.printinghouse.Edition;
import com.company.printinghouse.Employee;

import java.io.*;
import java.util.List;

public class PrintData extends Accounting {

    public PrintData(List<Edition> editions, List<Employee> employees) {
        super(editions, employees);
    }

    public void printData() {
        var managers =
                String.format("The company has %d managers %n", managerCount());

        var expensePrint =
                String.format("Total expenses for money and books are: %.2f%n", calculateExpenses());

        var profitPrint =
                String.format("The profit for the company is: %.2f%n", getProfit());

        var managerProfit =
                String.format("Each manager should receive %.2f above their fixed salary%n", getRemainingMoney());

        System.out.println(managers);
        System.out.println(expensePrint);
        System.out.println(profitPrint);
        System.out.println(managerProfit);
    }

    public void printToFile() throws IOException {

        try(FileWriter writer = new FileWriter("output.txt")) {
            writer.write(
                    String.format("The company has %d managers %n", managerCount()));
            writer.write(
                    String.format("Total expenses for money and books are: %.2f%n", calculateExpenses()));
            writer.write(
                    String.format("The profit for the company is: %.2f%n", getProfit()));
            writer.write(
                    String.format("Each manager should receive %.2f above their fixed salary%n", getRemainingMoney()));

        }
        catch(IOException e){
            System.out.println("Something went wrong.");
        }
    }
}
