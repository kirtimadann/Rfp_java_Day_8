package com.bl.employeewage;

public class EmployeeWageDay8 {
      String message;
    void msg(){
        message = " Welcome to Employee Wage Computation Program";
        System.out.println(message);
    }

    void  empcheck(){

        int emp_is_full_time = 1;
        int employeecheck = (int)(Math.random() * 10 % 2);

        if (employeecheck == 1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee not present");
        }

    }
    public static void main(String[] args) {
        EmployeeWageDay8 obj = new EmployeeWageDay8();
        obj.msg();
        obj.empcheck();



    }

}
