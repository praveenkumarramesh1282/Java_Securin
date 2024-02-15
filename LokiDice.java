import java.util.*;

public class LokiDice {
    public static void main(String[] args) {
        int[] OldDieA = {1, 2, 3, 4, 5, 6};
        int[] OldDieB = {1, 2, 3, 4, 5, 6};
        Map<Integer, Integer> targetDistribution = calculateSumDistribution(OldDieA, OldDieB);

        // Generate all possible dice 
        for (int x2 =1; x2 <= 4; x2++) {
            for (int x3 = x2; x3 <= 4; x3++) {
                for (int x4 = x3; x4 <= 4; x4++) {
                    for (int x5 = x4; x5 <= 4; x5++) {
                        for (int x6 = x5; x6 <= 4; x6++) {
                            int[] NewdiceA = new int[]{1, x2, x3, x4, x5, x6};
                            for (int y2 =1; y2 <= 8; y2++) {
                                for (int y3 = y2; y3 <= 8; y3++) {
                                    for (int y4 = y3; y4 <= 8; y4++) {
                                        for (int y5 = y4; y5 <= 8; y5++) {
                                            for (int y6 = y5; y6 <= 8; y6++) {
                                                int[] NewdiceB = new int[]{1, y2, y3, y4, y5, y6};
                                                if (calculateSumDistribution(NewdiceA, NewdiceB).equals(targetDistribution)) {
                                                    System.out.println("The Transformed dice is:\n ");
                                                    System.out.println("New_Dice A: " + Arrays.toString(NewdiceA));
                                                    System.out.println("New_Dice B: " + Arrays.toString(NewdiceB));
                                                    return; 
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
	
    
    private static Map<Integer, Integer> calculateSumDistribution(int[] die1, int[] die2) {
        Map<Integer, Integer> distribution = new HashMap<>();
        for (int i : die1) {
            for (int j : die2) {
                int sum = i + j;
                distribution.put(sum, distribution.getOrDefault(sum, 0) + 1);
            }
        }
        return distribution;
    }
}