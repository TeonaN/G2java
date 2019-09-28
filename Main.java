import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Main {
    public static void main(String[] args){
        task11();
    }
    public static void task1() {
        System.out.println("C++");
        System.out.println("C#");
        System.out.println("java");
        System.out.println("pascal");
        System.out.println("php");
        System.out.println("JavaScript");
        System.out.println("ActionScript");
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = n1 / n2;
        int n4 = n2 % n1;
        System.out.println(n3);
        System.out.println(n4);
    }

    public static void task3() {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(num1 + num2 + num3);
        System.out.println(num1 * num2 * num3);
    }

    public static void task4(){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        while(num1>0){
            int i= num1 % 10;
            System.out.println(i);
            num1 = num1 /10;
        }
    }

    public static void task5_6(){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int sum=0;

        while(num1>0){
            int i= num1 % 10;
            sum += i;
            num1 = num1 /10;
        }
        System.out.println(sum);
    }

    public static void task7(){
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("GCD "+(GCD(number1,number2)));
        System.out.println("LCM "+(number1*number2)/ GCD(number2, number1%number2));
    }

    private static int GCD(int number1, int number2) {
        if(number2 == 0){
            return number1;
        }
        return GCD(number2, number1%number2);
    }


    public static void task8(){
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        for (int i=M+1; i<N; i++){
            System.out.println(i);
        }
    }

    public static void task9(){
        double [] arr = {-1, 8, 2.1, 15, 30, 0, 9, 5};
        double max = arr[0];
        double min = arr[0];
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        for (int i = 0; i<arr.length; i++)
            if (arr[i]>max)
                max = arr[i];
        System.out.println("The max element is " + max);



        for (int i = 0; i<arr.length; i++)
            if (arr[i]<min)
                min = arr[i];
        System.out.println("The min element is " + min);
    }

    public static void task10(){
        double[] arr = {-1, 8, 2.1, 15, 30, 0, 9, 5};
        double temp;
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++)
                if (arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void task11(){
        double[] arr = new double[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) (Math.random() * 100 );

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void task12(){
        int[] arr = new int[8];
        int temp;
        for (int i = 0; i<arr.length; i++)
            arr[i] = (int) (Math.random() * 100 );
        for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j<arr.length; j++)
                if (arr[i]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }

        }


        System.out.println(Arrays.toString(arr));
    }

}