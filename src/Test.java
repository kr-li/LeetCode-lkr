import 树的遍历.TreeNode;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] house = new int[n];
        for (int i = 0; i < n; i++) {
            house[i] = scanner.nextInt();
        }
        int ans = help(house, k);
        System.out.println(ans);

    }

    public static int help(int[] arr, int k){
        List<Integer> zeroIndexArr = new ArrayList<>();
        Map<Integer, Integer> houseIndexDistance = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                zeroIndexArr.add(i);
            }
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] <= k){
                for (int j = 0; j < zeroIndexArr.size(); j++) {
                    minDistance = Math.min(minDistance, Math.abs(i - zeroIndexArr.get(j)));
                }
                houseIndexDistance.put(minDistance, i);
                minDistance = Integer.MAX_VALUE;
            }
        }
        int newMinDistance = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : houseIndexDistance.entrySet()){
            newMinDistance = Math.min(newMinDistance, entry.getKey());
        }
        return houseIndexDistance.get(newMinDistance) + 1;
    }
}
