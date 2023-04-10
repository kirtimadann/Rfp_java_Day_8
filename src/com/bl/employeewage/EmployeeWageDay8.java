package com.bl.employeewage;

public class EmployeeWageDay8 {
    int is_part_time = 1;
    int is_full_time = 2;
    int Empoloyee_per_rate_hrs = 20;

    void empwageUC3(){

        int empperhrs= 0;
        int empwage = 0;


        int employeecheck = (int)(Math.random() * 10 % 3);

        if (employeecheck == is_part_time){

            empperhrs = 4;

        } else if (employeecheck == is_full_time) {
            empperhrs = 8;

        } else {
            empperhrs = 0;
        }

        empwage = empperhrs * Empoloyee_per_rate_hrs;
        System.out.println("Employee Wage :" + empwage);

    }
    public static void main(String[] args) {

        EmployeeWageDay8 obj = new EmployeeWageDay8();
        obj.empwageUC3();

    }
}
