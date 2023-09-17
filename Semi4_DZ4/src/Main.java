import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] masX = {1, 2, 3, 4, 5};
        double[] masY = {11, 22, 33, 44, 55};

        double avrX = Arrays.stream(masX).max().getAsDouble();
        double avrY = Arrays.stream(masY).max().getAsDouble();
        double sumNum = 0;
        double sumDenum = 0;

        for (int i = 0; i < masX.length; i++) {
            sumNum += (masX[i] - avrX) * (masY[i] - avrY);
            sumDenum += Math.pow((masX[i] - avrX), 2) * Math.pow((masY[i] - avrY), 2);
        }

        double Rxy = sumNum / Math.sqrt(sumDenum);

        System.out.println(Rxy);
    }
}