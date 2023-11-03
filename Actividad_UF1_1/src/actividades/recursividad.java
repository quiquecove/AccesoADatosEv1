package actividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class recursividad {

    private List<List<Integer>> combinations = new ArrayList<>();
    private final List<Integer> numbersList;
    private List<Integer> combination = new ArrayList<>();
    private int target;

    public recursividad(List<Integer> numbersList, int target) {
        this.numbersList = numbersList;
        this.target = target;
    }

    public void findCombinations() {
        findCombinations(0, 0);
    }

    private void findCombinations(int startIndex, int currentSum) {
        if (currentSum == target) {
            combinations.add(new ArrayList<>(combination));
            return;
        }


        for (int i = startIndex; i < numbersList.size(); i++) {
            int num = numbersList.get(i);

            if (i>startIndex && numbersList.get(i)==numbersList.get(i-1)) continue;

            if (currentSum + num <= target) {
                combination.add(num);

                findCombinations(i + 1, currentSum + num); // Usar i + 1 para evitar repetir elementos
                combination.remove(combination.size() - 1);
            }
        }
    }
    public List<List<Integer>> getCombinations() {
        return combinations;
    }

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4); numbersList.add(2);
        numbersList.add(5);
        numbersList.add(6);
        int target = 6;

        Collections.sort(numbersList);
        recursividad backTracking = new recursividad(numbersList, target);
        backTracking.findCombinations();
        List<List<Integer>> combinations = backTracking.getCombinations();

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}