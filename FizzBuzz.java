public class FizzBuzz {

    /** Runs the compute method. */
    public static void main(String[] args) {
      compute();
    }

    /**
     * Given int n, returns:
     *  - FizzBuzz if divisible my 3 and 5
     *  - Fizz if divisible by only 3
     *  - Buzz if divisible by only 5
     *  - n if not divisible by 3 or 5
     */
    public static String fizzBuzz(int n) {
      if (n % 3 == 0 && n % 5 == 0) {
        return "FizzBuzz";
      } else if (n % 3 == 0) {
        return "Fizz";
      } else if (n % 5 == 0) {
        return "Buzz";
      } else {
        return Integer.toString(n);
      }
    }

    /**
     * Prints the results of fizzBuzz for numbers 1-100
     * with the format " <input> => <output>"
     */
    public static void compute() {
      for (int i = 1; i <= 100; ++i) {
        System.out.println(String.format("%d => %s", i, fizzBuzz(i)));
      }
    }

}
