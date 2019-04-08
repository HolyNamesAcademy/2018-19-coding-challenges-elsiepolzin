package challenges;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     * <p>
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     * <p>
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     * <p>
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c) {
        // Delete the line below and implement the method!

        int one = Math.max(a, b);
        int two = Math.max(b, c);
        int three = Math.max(a, c);

        int max = Math.max(Math.max(one, two), three);
            if(max == one)
                
        int min = Math.min(Math.max(one, two), three);




        int firstdiff = 0;
        int lastdiff = 0;
        int first = Math.max(a, b);
            if(first == a)
                firstdiff = a-b;
            else
                firstdiff = b-a;

        int last = Math.max(b, c);
            if(last == b)
              lastdiff = b - c;
             else
                lastdiff = c-b;

         if(firstdiff == lastdiff)
            return true;
        else
            return false;




    }
  }
