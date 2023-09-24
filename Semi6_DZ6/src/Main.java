public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 10, 15, 20, 25, 30, 100};

        FindWhile findWhile = new FindWhile();
        System.out.println("Index el: " + findWhile.findNum(7, arr));

        FindRec findRec = new FindRec();
        System.out.println("Index el: " + findRec.findRec(25, arr, 0, arr.length));
    }
}