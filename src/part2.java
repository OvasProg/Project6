import java.util.Scanner;
import java.util.Random;

public class part2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Input the length of your int array");
        int length = in.nextInt();
        in.nextLine();

        int[] a =in_arr(length);
        print(a);

        System.out.println("Input the length of your int array");
        length = in.nextInt();
        in.nextLine();

        a =rand(length);
        print(a);

        sum();
        largest();

        System.out.println("Input the length of your int array");
        length = in.nextInt();
        in.nextLine();
        a = in_arr(length);

        System.out.println("Input an int element, which index you want to find ");
        int el = in.nextInt();
        in.nextLine();
        int index = Index(a, el);
        System.out.println("Your element index is " + index);
        System.out.println("If index is -1, there isn't such element in your array");
    }
    //1
    public static int[] in_arr(int length){
        int[] a = new int[length];
        System.out.println("Input your integer array");
        for (int i = 0; i < length; i++) {
            a[i] = in.nextInt();
            in.nextLine();
        }
        return a;
    }
    //2
    public static int[] rand(int length){
        int[] a = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            a[i] = rand.nextInt(100);
        }
        return a;
    }
    //3
    public static void print(int[] arr){
        System.out.println("Your array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }
    //4
    public static void sum(){
        System.out.println("Input the length of your int array");
        int length = in.nextInt();
        in.nextLine();
        int[] a =in_arr(length);
        print(a);
        int sum = 0;
        for (int el:a) {
            sum += el;
        }
        System.out.println("The sum of your array's elements is " + sum);
    }
    //5
    public static void largest(){
        System.out.println("Input the length of your int array");
        int length = in.nextInt();
        in.nextLine();
        int[] a = rand(length);
        print(a);
        int biggest = a[0];
        for (int el:a) {
            if (el > biggest){
                biggest = el;
            }
        }
        System.out.println("The largest value in your array is " + biggest);
    }
    //6
    public static int Index(int[] arr, int el){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el){
                return i;
            }
        }
        return -1;
    }

}
