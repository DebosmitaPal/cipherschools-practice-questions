import java.util.*;
public class day {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       String input = sc.nextLine().toUpperCase();
       try {
            Day dayweek = Day.valueOf(input);
            switch (dayweek) {
                case MONDAY:
                    System.out.println("Start of the week!");
                    break;
                case TUESDAY:
                    System.out.println("Keep going strong!");
                    break;
                case WEDNESDAY:
                    System.out.println("Midweek hustle!");
                    break;
                case THURSDAY:
                    System.out.println("Almost there!");
                    break;
                case FRIDAY:
                    System.out.println("Weekend is near. Finish strong!");
                    break;
                case SATURDAY:
                    System.out.println("Enjoy your weekend!");
                    break;
                case SUNDAY:
                    System.out.println("Relax and recharge for the week ahead.");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please try again.");
        }
    }
}
