package com.bl.employeewage;

public class EmployeeWageDay8 {
    int EMP_IS_FULL_TIME = 1;

    void empwageUC2(){

        int Empoloyee_per_rate_hrs = 20;
        int empperhrs= 0;
        int empwage = 0;


        int employeecheck = (int)(Math.random() * 10 % 2);

        if (employeecheck == 1){

            empperhrs = 8;

        }else {
            empperhrs = 0;
        }

        empwage = empperhrs * Empoloyee_per_rate_hrs;
        System.out.println("Employee Wage :" + empwage);

    }
    public static void main(String[] args) {

        EmployeeWageDay8 obj = new EmployeeWageDay8();
        obj.empwageUC2();

    }
}
