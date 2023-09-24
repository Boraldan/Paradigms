public class FindWhile {
    public int findNum(int num, int[] arr) {
        int lenMin = 0;
        if (arr[lenMin] == num) return 0;
        int lenMax = arr.length;
        while (lenMin < lenMax - 1) {
            int lenMed = (lenMin + lenMax) / 2;
            if (arr[lenMed] == num) return lenMed;
            if (arr[lenMed] < num) {
                lenMin = lenMed;
            } else {
                lenMax = lenMed;
            }
        }
        return -1;
    }
}
