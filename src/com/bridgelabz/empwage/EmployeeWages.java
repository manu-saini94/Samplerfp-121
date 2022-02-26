package com.bridgelabz.empwage;

public class EmployeeWages {
    private int var1;
    private static int var2; // static or class level
    private int var;// non static or instance variable or object level
    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;
    private static final int WAGE_PER_HOUR = 20;
    private static final int TOTAL_WORKING_HOURS = 100;
    private static final int TOTAL_WORKING_DAYS = 20;

    // Parameterized constructor
    EmployeeWages(int a) {
        var1 = a;
    }

    EmployeeWages() {

    }

    //Constants
    public static void m1() {
        int x = 0;
        System.out.println(x);
        System.out.println(IS_PART_TIME);
    }

    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1]);
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double a = -5;
        String s = "abc";
        char ch = '5';
        int t = 10;
        float f = -10f;
        System.out.println(f + " " + a);
        System.out.println(s + " " + ch);
        m1();

        EmployeeWages emp = new EmployeeWages(5);
        System.out.println("var:" + emp.var);
        System.out.println("var1:" + emp.var1);
        System.out.println("s:" + emp.var2);
        EmployeeWages emp2 = new EmployeeWages();





        int arr2[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = i + j;
                System.out.println(arr2[i][j]);
            }
        }

        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Employee Wages Problem Developed by Tahir Mansuri.");

        //Variable for Calculating Employee Wage
        int empWage = 0;
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalDays = 0;
        int totalEmpHrs = 0;

        while(totalEmpHrs <= TOTAL_WORKING_HOURS && totalDays < TOTAL_WORKING_DAYS) {
            //Computation
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 6;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 10;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            empWage = WAGE_PER_HOUR * empHrs;   // Calculating Employee Wage if Employee is Present as PART TIME Or FULL TIME
            totalEmpWage = empWage + totalEmpWage;
            totalEmpHrs = empHrs + totalEmpHrs;
            System.out.println("Employee Wage = " + empWage);
            totalDays++;
        }

        //Displaying Total Emp Wages
        System.out.println("Total Emp Hrs:"+totalEmpHrs);
        System.out.println("Total Days:"+totalDays);
        System.out.println("Total Employee Wages = "+ totalEmpWage);
    }
}
