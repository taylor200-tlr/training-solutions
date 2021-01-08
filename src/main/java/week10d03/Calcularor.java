package week10d03;

public class Calcularor {
    public static int findMinSum(int [] arr){
        int result = 0;
        int maxValue = findMax(arr);
        for (int j: arr){
            if (j != maxValue){
                result += j;
            }
        }
        return result;
    }

    private static int findMax(int [] arr){
        int result = 0;
        for (int i: arr){
            if (i > result){
                result = i;
            }
        }
        return result;
    }
}
