package com.company;

        public class Wage {
            public static void main(String[] args){
                int Full_Time_Emp = 1;
                int empcheck = (int) Math.floor(Math.random() * 10 % 2);
                System.out.println(empcheck);
                if(empcheck == Full_Time_Emp)

                {
                    System.out.println("The Emp is Present");
                } else

                {
                    System.out.println("The Emp is Absent");
                }
            }
        }

