package com.bl.employeewage;

public class EmployeeWageDay8 {
    int emp_is_full_time = 1;


    void  empcheck(){
        int employeecheck = (int)(Math.random() * 10 % 2);

        if (employeecheck == 1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee not present");
        }
    }
    public static void main(String[] args) {
        EmployeeWageDay8 obj = new EmployeeWageDay8();
        obj.empcheck();
    }
}
