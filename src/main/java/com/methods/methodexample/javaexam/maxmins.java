import java.util.HashSet;
import java.util.Random;

public class maxmins {

  static void minmaxs(HashSet<Integer> set) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (Integer val : set) {
      max = max < val ? val : max;
      min = min > val ? val : min;
    }
    System.out.println("Max " + max + " Min Val " + min);
  }

  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    Random rand = new Random();

    while (set.size() < 10) {
      set.add(rand.nextInt(100));
    }

    minmaxs(set);

  }
}
