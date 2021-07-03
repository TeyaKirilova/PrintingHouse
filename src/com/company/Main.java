package com.company;

import com.company.accounting.Accounting;
import com.company.enums.Color;
import com.company.enums.EmployeeType;
import com.company.enums.PageSize;
import com.company.enums.PaperType;
import com.company.machines.Machine;
import com.company.printinghouse.Edition;
import com.company.printinghouse.Employee;
import com.company.printinghouse.PrintingHouse;
import com.company.utils.PrintData;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Edition> editions = new ArrayList<>();
        editions.add(new Edition(5, "Fashion",PageSize.A4,PaperType.GLOSSY,268));
        editions.add(new Edition(14,"Dragons",PageSize.A3,PaperType.NEWSPAPER,510));
        editions.add(new Edition(7,"Counting",PageSize.A1,PaperType.STANDARD,156));
        editions.add(new Edition(25,"Paints",PageSize.A2,PaperType.GLOSSY,188));
        editions.add(new Edition(9,"Code",PageSize.A5,PaperType.NEWSPAPER,406));
        editions.add(new Edition(30,"Gardening",PageSize.A5,PaperType.GLOSSY,216));
        editions.add(new Edition(16,"The best cooking book",PageSize.A4,PaperType.GLOSSY,146));
        editions.add(new Edition(26,"Wars",PageSize.A3,PaperType.STANDARD,706));
        editions.add(new Edition(19,"Music history",PageSize.A1,PaperType.NEWSPAPER,368));
        editions.add(new Edition(21,"Fabrics",PageSize.A2,PaperType.GLOSSY,298));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(EmployeeType.MANAGER, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.OPERATOR, 800));
        employees.add(new Employee(EmployeeType.MANAGER, 800));

        List<Machine> machineList = new ArrayList<>();
        machineList.add( new Machine(Color.BLACKANDWHITE, 5000, 600));
        machineList.add( new Machine(Color.COLORED, 6000, 700));
        machineList.add( new Machine(Color.BLACKANDWHITE, 7000, 800));

        PrintingHouse ph = new PrintingHouse(employees, machineList);
        Accounting accounting = new Accounting(editions, employees);
        PrintData printData = new PrintData(editions, employees);
        printData.printData();

        ph.startPrinting(editions);
    }
}
