import java.util.ArrayList;
import java.util.List;

public class Solution {   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), 0, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<Integer> combination, int start, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (target < 0) return;

        for (int i = start; i < candidates.length; i++) {
            combination.add(candidates[i]);
            backtrack(candidates, target - candidates[i], combination, i, result);
            combination.remove(combination.size() - 1);
        }
    }
}
