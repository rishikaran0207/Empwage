package com.company;

public class Main {


        public static void main(String[] args){

            int Full_Time_Emp = 1;
            int Part_Time =2;
            int Emp_Rate_per_hour = 20;
            int empHrs = 0;

            double empcheck =  Math.floor(Math.random() * 10) % 3;

            if (empcheck == Full_Time_Emp){
                empHrs = 8;
            } else if (empcheck == Part_Time) {
                    empHrs=4;

            } else {
                empHrs = 0;
            }
            int empwage;
            empwage= empHrs * Emp_Rate_per_hour;
            System.out.println("Employee Wage Is " + empwage);

        }
    }


