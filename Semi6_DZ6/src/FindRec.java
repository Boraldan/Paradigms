public class FindRec {
    public int findRec(int num, int[] arr, int lenMin, int lenMax) {
        int lenMed = (lenMin + lenMax) / 2;
        if (arr[lenMin] == num) return lenMin;
        if (arr[lenMed] == num) return lenMed;
        if (lenMin >= lenMax - 1) return -1;
        if (arr[lenMed] < num) return findRec(num, arr, lenMed, lenMax);
//        if (arr[lenMed] > num) return findRec(num, arr, lenMin, lenMed);
//        return -1;
        return findRec(num, arr, lenMin, lenMed);
    }
}
