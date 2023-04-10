package com.bl.employeewage;

public class EmployeeWageDay8 {
   public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static final int EMPLOYEE_PER_RATEHRS = 20;

    public static final int NUM_OF_WORKINGDAY = 2;

    void empwageUC5(){

        int empperhrs;
        int empwage = 0;
        int totalempwage =0;

for(int day = 0; day < NUM_OF_WORKINGDAY; day ++) {

    int employeecheck = (int) (Math.random() * 10 % 3);

    switch (employeecheck) {
        case IS_PART_TIME:
            empperhrs = 4;
            break;

        case IS_FULL_TIME:
            empperhrs = 8;
            break;

        default: {
            empperhrs = 0;
        }


    }
        empwage = empperhrs * EMPLOYEE_PER_RATEHRS;
        System.out.println(empwage);
        totalempwage += empwage;
        System.out.println("Employee Wage :" + empwage);

    }

    System.out.println("Total Employee Wage" + totalempwage);
}


    public static void main(String[] args) {

        EmployeeWageDay8 obj = new EmployeeWageDay8();
        obj.empwageUC5();

    }
}
