import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomValueEX {
  public static HashSet<Integer> randoms() {
    HashSet<Integer> set = new HashSet<>();

    Random rand = new Random();

    while (set.size() < 10) {
      set.add(rand.nextInt(100));
    }

    System.out.println("Random Number" + set);
    return set;
  }

  public static void main(String[] args) {
    randoms();
  }
}
