package problemSolving.DSApatterns.slidingWindow;

import java.util.*;

public class CountDistinctElementsInEveryWindowOfSizeK {

    public static List<Integer> countDistinct(int[] arr, int k) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: First window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        result.add(map.size());

        // Step 2: Slide window
        for (int i = k; i < n; i++) {

            // Remove outgoing element
            int key = arr[i - k];
            map.put(key, map.get(key) - 1);

            if (map.get(key) == 0) {
                map.remove(key);
            }

            // Add incoming element
            int incoming = arr[i];
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            result.add(map.size());
        }

        return result;
    }
}
