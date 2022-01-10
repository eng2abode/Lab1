import java.util.Scanner;

/**
 * Created by HP on 10/01/2022.
 */
public class N4 {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");}


    }
}
