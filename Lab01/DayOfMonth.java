import java.util.Scanner;
public class DayOfMonth {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
        int days;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Please enter the Month: ");
            System.out.println("Please enter the year: ");
            String monthInput = N.nextLine().toLowerCase();
            int year = N.nextInt();
            N.nextLine(); 
            int month = Month_Input(monthInput);
            if (month != -1 && year > 0) {
                days = Day_Month(month, year);
                System.out.println("Number of days in the entered month (" + month + "/" + year + "): " + days);
                validInput = true;
            } else {
                System.out.println("Invalid month input or year. Please try again.");
            }
        	}
        N.close();

	    }
	    //Write function Month, day, leap year
	private static int isLeapYear(int year) {
    	if(year % 400 !=0 && year % 100 == 0) {
    		return 1;
    	}else {
    		return 0;
    	}   
    }
	private static int Month_Input(String monthInput) {
        switch (monthInput) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
            case "January":
            case "Jan.":
            case "Jan":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
            case "February":
            case "Feb.":
            case "Feb":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
            case "March":
            case "Mar.":
            case "Mar":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
            case "April":
            case "Apr.":
            case "Apr":
                return 4;
            case "may":
            case "5":
            case "May":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
            case "June":
            case "Jun.":
            case "Jun":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
            case "July":
            case "Jul.":
            case "Jul":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
            case "August":
            case "Aug.":
            case "Aug":
                return 8;
            case "september":
            case "sep.":
            case "sep":
            case "9":
            case "September":
            case "Sep.":
            case "Sep":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
            case "October":
            case "Oct.":
            case "Oct":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
            case "November":
            case "Nov.":
            case "Nov":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
            case "December":
            case "Dec.":
            case "Dec":
                return 12;
            default:
                return -1; // Invalid month
        }
    }

	 private static int Day_Month(int month, int year) {
	        switch (month) {
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                return 31;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                return 30;
	            case 2:
	                if(isLeapYear(year)==1) {
	                	return 29;
	                }else {
	                	return 28;
	                }
	            default:
	                return -1; //  Invalid input of Month
	        }
	    }

	    

}
