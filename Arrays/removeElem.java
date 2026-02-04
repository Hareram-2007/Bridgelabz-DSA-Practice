import java.util.Scanner;

public class removeElem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // size input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // array input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // element to remove
        System.out.print("Enter element to remove: ");
        int key = sc.nextInt();

        // count elements not equal to key
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != key)
                count++;
        }

        // new array
        int[] newArr = new int[count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != key)
                newArr[index++] = arr[i];
        }

        // output
        System.out.println("Array after removing element:");
        for (int x : newArr)
            System.out.print(x + " ");
    }
}
