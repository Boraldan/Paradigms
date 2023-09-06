import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2_Imperativ {

    // Задание 2. Поиск долей положительных, отрицательных и нулевых в массиве.
    // Императивный метод.
    public double[] find2(int arr[]) {
        double[] newArr = new double[3];
        int pos = 0;
        int nul = 0;
        int neg = 0;
        for (int el : arr) {
            if (el > 0) pos++;
            else if (el == 0) nul++;
            else neg++;
        }
        newArr[0] = (double) pos / arr.length;
        newArr[1] = (double) nul / arr.length;
        newArr[2] = (double) neg / arr.length;
        return newArr;
    }

    // Евгений Малютин
    public Map<String, Integer> findEM(List<Integer> list) {
        Map<String, Integer> result = new HashMap<>();
        result.put("positive", 0);
        result.put("zero", 0);
        result.put("negative", 0);
        for (Integer el : list) {
            if (el > 0) result.put("positive", result.get("positive") + 1);
            if (el == 0) result.put("zero", result.get("zero") + 1);
            if (el < 0) result.put("negative", result.get("negative") + 1);
        }
        result.put("positive", result.get("positive") / list.size());
        result.put("zero", result.get("zero") / list.size());
        result.put("negative", result.get("negative") / list.size());
        return result;
    }

}

