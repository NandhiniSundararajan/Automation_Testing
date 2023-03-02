public class DaysInAMonth {

    public static void main(String[] args) {
        String month = "Apr";

        switch (month) {
            case "January", "March", "May", "July", "August", "October", "December", "Jan", "Mar", "Jul", "Aug", "Oct", "Dec":
                System.out.println("No. of days in " + month + " are 31");
                break;
            case "February", "Feb":
                System.out.println("No. of days in February are 28 in a non-leap year and 29 in a leap year");
                break;
            case "April", "June", "September", "November", "Apr", "Jun", "Sept", "Nov":
                System.out.println("No. of days in " + month + " are 30");
                break;
            default:
                System.out.println("Invalid month");
        }

    }
}
