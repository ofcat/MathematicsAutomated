import java.util.LinkedList;
import java.util.List;

public class HoaxNum {

    public static boolean isHoax(int n) {
        List<Integer> list = new LinkedList<>(primeFactors(n));

        //checks if the number is prime
        if (list.get(0) == n)
            return false;

        //removes any duplicate prime factors, as only distinct are needed
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1)))
                list.remove(i);

        }

        //gets the sum of all prime factors from the list
        int listTotal = 0;
        for (Integer integer : list) {
            while (integer > 0) {
                listTotal += integer % 10;
                integer /= 10;
            }
        }

        int numTotal = 0;
        while (n > 0) {
            numTotal += n % 10;
            n /= 10;
        }

        return listTotal == numTotal;

    }

    public static List<Integer> primeFactors(int n) {
        List<Integer> list = new LinkedList<>();

        while (n % 2 == 0) {
            list.add(2);
            n /= 2;
        }
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }

        if (n > 2)
            list.add(n);

        return list;
    }


    public static void main(String[] args) {
        int n = 105;
        if (isHoax(n))
            System.out.println(n + " is a hoax number!");
        else
            System.out.println(n + " is not a hoax number!");
    }
}
