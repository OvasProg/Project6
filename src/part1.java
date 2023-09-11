public class part1 {
    public static void main(String[] args) {

        //1.4 (below)
        int[] numbers = new int[10]; //1.1

        int size = 5;
        double[] doubles = new double[size]; //1.2

        String[] strings = {"Hello", "Thank you", "Goodbye"}; //1.3

        //1.5 , 3.1
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*i*i; //2.1
        }
        for (int j = 0; j < size; j++) {
            doubles[j] = j + (double)j/3;
        }
        //3.2
        System.out.println("The integer array:");
        for (int element:numbers) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        System.out.println("The double array:");
        for (double el:doubles) {
            System.out.print(el + " ");
        }
        System.out.println("\n");
        int i = 0;
        //3.3
        while (i < strings.length){
            System.out.println((i+1) + " element of the string array: " + strings[i]); //2.2
            i++;
        }
    }
}