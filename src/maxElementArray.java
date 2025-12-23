import java.util.Scanner;

public class maxElementArray {
    public static void main(String[] args) {

        int sum =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:- ");
        for (int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        for (int x: arr)
        {
           sum = sum + x;
        }
        System.out.println(sum);
        int average = sum/ n;
        System.out.println(average);


        // for maximum element
//        int max = 0; agar negative huye toh nahi kaam krega
        int max = arr[0];
        // initialise kr diya max ko first element se of array
        for (int j = 0; j<n; j++){
            if (arr[j]>max){
                max = arr[j];
            }
        }
        System.out.println(max);
    }
}
