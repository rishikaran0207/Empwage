
public class Wage {

    public static final int Full_Time_Emp = 1;
    public static final int Part_Time = 2;
    public static final int Emp_Rate_per_hour = 20;
    public static final int Num_Of_Working_days = 20;
    public static final int MAX_HRS_PER_MONTH = 100;

    public static void main(String[] args) {


        int empHrs = 0;
        int total_Wage = 0;
        int totalHrs = 0;

        int day = 1;
        while (day <= Num_Of_Working_days && totalHrs < MAX_HRS_PER_MONTH) {
            double empcheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empcheck) {
                case Full_Time_Emp:
                    empHrs = 8;
                    break;
                case Part_Time:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }
            int empwage;
            empwage = empHrs * Emp_Rate_per_hour;

            totalHrs += empHrs;
            total_Wage += empwage;

            System.out.println("day" + day);
            System.out.println("Employee Wage Is " + empwage);
            day++;


    }

            System.out.println("Total Hrs:" + totalHrs);
        System.out.println("Total Wage:"+total_Wage);
    }
}


