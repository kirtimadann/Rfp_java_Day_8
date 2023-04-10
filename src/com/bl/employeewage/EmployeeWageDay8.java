package com.bl.employeewage;

public class EmployeeWageDay8 {
   public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    int Empoloyee_per_rate_hrs = 20;

    void empwageUC4(){

        int empperhrs= 0;
        int empwage = 0;


        int employeecheck = (int)(Math.random() * 10 % 3);

        switch (employeecheck){

            case IS_PART_TIME:
                empperhrs = 4;
                break;

            case IS_FULL_TIME:
                empperhrs = 8;
                break;
            default:{
                empperhrs =0;
            }

        }




        empwage = empperhrs * Empoloyee_per_rate_hrs;
        System.out.println("Employee Wage :" + empwage);

    }
    public static void main(String[] args) {

        EmployeeWageDay8 obj = new EmployeeWageDay8();
        obj.empwageUC4();

    }
}
