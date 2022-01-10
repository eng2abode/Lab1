import java.util.Scanner;

/**
 * Created by HP on 10/01/2022.
 */
public class Main {
    public static void main(String[] args) {
        Student []arr =new  Student[3];

    Scanner in= new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
        Student s= new Student(in.nextInt(),in.next());
        arr[i]=s;}

        for (int i = 0; i <arr.length ; i++) {
        System.out.println(arr[i].toString());}

}}


