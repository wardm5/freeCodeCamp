public class main {
    public static void main(String[] args) {
        Problems problems = new Problems();

        // 1.1 median
        // ASK:
        // 1) if the two arrays are even or the same length
        // 2) how to deal with two median values, maybe return two elements or average
        // 3) confirm if arrays of intergers... if okay to return double
        System.out.println("\n1.1 median");
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        System.out.println(problems.median(arr1, arr2));  // should return 3.5

        int[] arr3 = {1,3,5};
        int[] arr4 = {2,4,6,7};
        System.out.println(problems.median(arr3, arr4));  // should return 3.5

        // int[] arr5 = {-2, 5, 2, 6 ,4 ,7};
        // int[] arr6 = {9, -6, 2, 7, 5, 3};
        // System.out.println(problems.closestToTarget(arr5, arr6, 1));

        System.out.println("\n1.1 findMissing");
        int[] arr7 = {1,4,5,9,3};
        int[] arr8 = {1,9,4,5};
        System.out.println(problems.findMissing1(arr7, arr8));  // should return 3
    }
}
