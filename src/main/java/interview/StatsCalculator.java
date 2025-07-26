package interview;

import java.util.*;

public class StatsCalculator {

    public static double mean(Collection<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            throw new IllegalArgumentException("Collection is empty");
        }
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.size();
    }

    public static double median(Collection<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            throw new IllegalArgumentException("Collection is empty");
        }
        List<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        int n = sorted.size();
        if (n % 2 == 1) {
            return sorted.get(n / 2);
        } else {
            return (sorted.get(n / 2 - 1) + sorted.get(n / 2)) / 2.0;
        }
    }

    public static int mode(Collection<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            throw new IllegalArgumentException("Collection is empty");
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        for (int num : arr) {
            int count = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, count);
            maxFreq = Math.max(maxFreq, count);
        }
        int mode = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                mode = Math.min(mode, entry.getKey());
            }
        }
        return mode;
    }
}
