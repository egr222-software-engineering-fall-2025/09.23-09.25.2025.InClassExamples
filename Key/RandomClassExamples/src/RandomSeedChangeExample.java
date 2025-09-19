import java.util.*;

public class RandomSeedChangeExample {
    public static void main(String[] args) {
        Random rand = new Random();

        // each call will return a different random number because Java provides a different "seed" each time
        getRandom(rand);
        getRandom(rand);
        getRandom(rand);
        getRandom(rand);
    }

    private static void getRandom(Random rand) {
        System.out.println(rand.nextInt(30 - 23 + 1) + 23);
    }
}