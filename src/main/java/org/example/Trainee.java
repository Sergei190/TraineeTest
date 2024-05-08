package org.example;

import java.util.ArrayList;
import java.util.List;

public class Trainee {
    public int[] solution(int[] array) {
        List<Integer> filteredList = new ArrayList<>();
        for (int num : array) {
            if (num == 3 || num == 5) {
                filteredList.add(num);
            }
        }
        int[] result = new int[filteredList.size()];
        for (int i = 0; i < filteredList.size(); i++) {
            result[i] = filteredList.get(i);
        }
        return result;
    }

    public boolean solution(String word) {
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
