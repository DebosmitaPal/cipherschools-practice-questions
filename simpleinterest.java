import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double si=(p*r*t)/100.0;
        System.out.println(si);
    }
}
