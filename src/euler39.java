
/*
 * https://projecteuler.net/problem=39
 *
 * Integer right triangles
 * Problem 39
 * If p is the perimeter of a right angle triangle with integral length sides, 
 * {a,b,c}, there are exactly three solutions for p = 120.
 * {20,48,52}, {24,45,51}, {30,40,50}
 * For which value of p ≤ 1000, is the number of solutions maximised?
 *
 * Answer: ___840_____  <== You fill in (you can check on Euler Project)
*/

public class euler39 {

    
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int n = euler39(120);        
        System.out.println("For 120 ==>" + n + "  (<== should be 3)");

        int max_p = 0 ;

        // ToDo: AFTER you write the euler39 function below, you now
        // need to loop over all possible perimeters and call the function,
        // and keeping track of which gives you the maximum value.
        for (int ii=0; ii<1000; ++ii) {
            if (euler39(ii) > max_p)
                max_p = euler39(ii);
        }

        System.out.println("Answer for optimal under 1000: " + max_p);

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Time: " + (elapsedTime / 1000000)  + "[msec]");
        
    }    
    
    /**
     * 
     * @param p Perimeter of the right triangle
     * @return number of possible triangles
     * 
     */    
    public static int euler39(int p) {
    
        int cnt = 0;

        // ToDo: your code here
        for (int a=1; a<p; ++a) {
            for (int b=a; b<p; ++b) {
                int c = (int) p - a - b;
                if (((a*a) + (b*b) == (c*c)) && (a+b+c == p)) {
                    ++cnt;
                }
            }
        }
        
        System.out.println(p + ": " + cnt);
        return cnt;    
    }
    

}

