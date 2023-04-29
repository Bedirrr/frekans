import java.util.*;

public class frekans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu girin: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.printf("Dizi elemanlarını girin (%d adet):%n", size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i], 1);
            }
        }

        System.out.println("Elemanlar ve frekansları:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}