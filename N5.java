import java.util.Scanner;

/**
 * Created by HP on 10/01/2022.
 */
public class N5 {
    public static void input(int []a){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            a[i]=in.nextInt();}
    }

    public static void out(int []b){
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+"   ");}
    }
    public static void main(String[] args) {
        int[] arr= new int[5];
        System.out.println("Enter 5 numbers");
        input(arr);
        out(arr);

    }
}
