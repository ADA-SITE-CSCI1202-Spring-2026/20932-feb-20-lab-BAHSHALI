import java.util.Scanner;

public class Minmax {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }




    public static void main(String[] args) {

        if(args.length > 0) {
            int[] cmdArray = new int[args.length];

            for(int i = 0; i < args.length; i++) {
                cmdArray[i] = Integer.parseInt(args[i]);
            }

            System.out.println("From cli ");
            System.out.println("Min " + findMin(cmdArray));
            System.out.println("Max " + findMax(cmdArray));
        }


        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] userArray = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            userArray[i] = input.nextInt();
        }

        System.out.println("From scanner ");
        System.out.println("Min " + findMin(userArray));
        System.out.println("Max " + findMax(userArray));

       
        int[] result = findMinMax(userArray);
        System.out.println("Returning both at the same time ");
        System.out.println("Min " + result[0]);
        System.out.println("Max " + result[1]);

        input.close();
    }
}