import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int max=arr[0];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing the elements: ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element in array: "+max);
    }
}
