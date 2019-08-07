public class main {
    public static void main(String[] args) {
        Problems problems = new Problems();
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        System.out.println(problems.median(arr1, arr2));  // should return 3.5

        int[] arr3 = {1,3,5};
        int[] arr4 = {2,4,6,7};
        System.out.println(problems.median(arr3, arr4));  // should return 3.5
    }
}
