import java.util.*;
public class Problems {
    public double median(int[] arr1, int[] arr2) {
        if (arr1.length >= arr2.length)
            return medianHelper(arr1, arr2);
        else
            return medianHelper(arr2, arr1);
    }
    private double medianHelper(int[] arr1, int[] arr2) {
        double result = 0;   // result
        int[] temp = new int[arr1.length + arr2.length];  // store sorted values
        int i = 0;  // larger array index
        int j = 0;  // smaller array index
        int t = 0;  // temp array index
        while (i < arr1.length) {
            if (j < arr2.length && arr1[i] < arr2[j]) {
                temp[t] = arr1[i];
                t++;
                i++;
            } else if (j < arr2.length && arr2[j] < arr1[i]) {
                temp[t] = arr2[j];
                j++;
                t++;
            } else {
                temp[t] = arr1[i];
                i++;
                t++;
            }
        }
        if (temp.length % 2 == 0)
            return (double) (temp[(temp.length / 2) - 1] + temp[(temp.length / 2)]) / 2;
        else
            return temp[temp.length / 2];
    }

    // public int closestToTarget(int[] arr1, int[] arr2, int target) {
    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);
    //     int i = 0;
    //     int j = arr1.length - 1;
    //     int a = 0;
    //     int b = 0;
    //     int val = -0;
    //     while (i >= 0 && i < arr2.length && j >= 0) {
    //         if (arr1[i] * arr2[j] == target) {
    //             return target;
    //         } else if (arr1[i] * arr2[j] <target) {
    //             i++;
    //
    //             a = arr1[i];
    //             b = arr2[j];
    //             if (Math.abs(target - a * b) < val) {
    //                 val = a * b;
    //             }
    //             System.out.println(a*b);
    //         } else {
    //
    //             j--;
    //             a = arr1[i];
    //             b = arr2[j];
    //             System.out.println(a*b);
    //         }
    //     }
    //     return a * b;
    // }
    public int findMissing1(int[] arr1, int[] arr2) {
        int sum1 = -1;
        int sum2 = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (i < arr2.length)
                sum2 += arr2[i];
            sum1 += arr1[i];
        }
        return sum1-sum2;
    }
    public int findMissing2(int[] arr1, int[] arr2) {
        // int sum1 = -1;
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum ^= arr2[i];
        }
        return sum;
    }
}
