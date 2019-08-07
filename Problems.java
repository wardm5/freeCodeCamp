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
}
