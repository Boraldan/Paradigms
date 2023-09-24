public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Исходный массив:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Отсортированный массив:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Рекурсивно сортируем левую и правую половины
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Объединяем две отсортированные половины
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Создаем временные массивы
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Копируем данные во временные массивы leftArray[] и rightArray[]
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[middle + 1 + j];

        // Объединяем временные массивы обратно в основной массив arr[]
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы leftArray[], если таковые есть
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы rightArray[], если таковые есть
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    }
