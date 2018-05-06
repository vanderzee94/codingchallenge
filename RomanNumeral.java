public class RomanNumeral {

    private static int I = 1;
    private static int IV = 4;
    private static int V = 5;
    private static int IX = 9;
    private static int X = 10;
    private static int XL = 40;
    private static int L = 50;
    private static int XC = 90;
    private static int C = 100;
    private static int CD = 400;
    private static int D = 500;
    private static int CM = 900;
    private static int M = 1000;

    public static void main(String[] args) {
      if (args.length > 0) {
        try {
          print(Integer.parseInt(args[0]));
        } catch (Exception e) {
          System.out.println(String.format("Cannot parse %s as an Integer.", args[0]));
        }

      } else {
        // Start with converting the base numbers
        test(1, "I");
        test(5, "V");
        test(10, "X");
        test(50, "L");
        test(100, "C");
        test(500, "D");
        test(1000, "M");

        // Base subtraction cases
        test(4, "IV");
        test(9, "IX");
        test(40, "XL");
        test(90, "XC");
        test(400, "CD");
        test(900, "CM");

        // Lastly some random numbers that are more complex
        test(1984, "MCMLXXXIV");
        test(98, "XCVIII");
        test(2028, "MMXXVIII");
        test(890, "DCCCXC");
        test(707, "DCCVII");
      }
    }

    /**
     * Roman numerals are formed with the following letters:
     *    1    => I
     *    5    => V
     *    10   => X
     *    50   => L
     *    100  => C
     *    500  => D
     *    1000 => M
     *
     * All other numbers are formed with the following rules:
     *    1) A smaller letter to the left of a larger letter is subtracted
     *       from the larger e.g. IV => 5(V) - 1(I) = 4.
     *    2) Larger or equal letters to the right of a larger/equal letter
     *       are added together e.g. XXI => 10(X) + 10(X) + 1(I) = 21.
     *    3) Subtraction can only be done with powers of ten i.e I,X,C.
     *    4) Only one letter can be subtracted from another.
     *    5) A number cannot be subtracted from another that is more than
     *       ten times greater than it e.g IC is not 100 but XCIX is.
     *       
     */
    public static String convert(int n) {
      String result = "";
      while (n >= M) {
       result += "M";
       n -= M;
      }
      while (n >= CM) {
       result += "CM";
       n -= CM;
      }
      while (n >= D) {
       result += "D";
       n -= D;
      }
      while (n >= CD) {
       result += "CD";
       n -= CD;
      }
      while (n >= C) {
       result += "C";
       n -= C;
      }
      while (n >= XC) {
       result += "XC";
       n -= XC;
      }
      while (n >= L) {
       result += "L";
       n -= L;
      }
      while (n >= XL) {
       result += "XL";
       n -= XL;
      }
      while (n >= X) {
       result += "X";
       n -= X;
      }
      while (n >= IX) {
       result += "IX";
       n -= IX;
      }
      while (n >= V) {
       result += "V";
       n -= V;
      }
      while (n >= IV) {
       result += "IV";
       n -= IV;
      }
      while (n >= I) {
       result += "I";
       n -= I;
      }
      return result;
    }

    /** Simple print function for user input. */
    public static void print(int i) {
      System.out.println(String.format("%d => %s", i, convert(i)));
    }

    /** Simple print function for test cases. */
    public static void test(int input, String expected) {
        System.out.println(String.format("%d == '%s' => %b", input, expected, convert(input).equals(expected)));
    }
}
