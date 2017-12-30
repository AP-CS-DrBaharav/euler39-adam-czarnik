
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
 * Answer: ________  <== You fill in (you can check on Euler Project)
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
        
        return cnt;    
    }
    

}

