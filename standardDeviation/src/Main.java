import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = randomArr();
        double mean = mean(nums);
        double variance = variance(nums, mean);
        double stDeviation = stDeviation(variance);
        String results = String.format("Dataset: \n%s" +
                "\nMean: %f" +
                "\nVariance: %f" +
                "\nStandard deviation: %f", Arrays.toString(nums), mean, variance, stDeviation);

        System.out.println(results);
    }

    //calculating mean of the numbers in the array
    public static double mean(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return (double) total / nums.length;
    }

    // finding variance of the set
    public static double variance(int[] nums, double mean) {
        //variance is a sum of squares of differences between all numbers and mean
        double tempTotal = 0;
        for (int num : nums) {
            tempTotal += Math.pow((num - mean), 2);
        }
        return tempTotal / nums.length;
    }

    //Standard Deviation is a square root of variance
    public static double stDeviation(double variance) {
        return Math.sqrt(variance);
    }

    //create new array with random values
    public static int[] randomArr() {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        return nums;
    }


}
