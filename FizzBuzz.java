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
      String result = n % 3 == 0 ? "Fizz" : "";
      result += n % 5 == 0 ? "Buzz" : "";
      return result.equals("") ? Integer.toString(n) : result;
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
