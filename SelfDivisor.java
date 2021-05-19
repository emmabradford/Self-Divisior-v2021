
/**
 * Write a description of class SeldDivisor here.
 * 
 * @author Ms. Bradford
 * @version Jan 19, 2021
 */
public class SelfDivisor
{
    /** @param number the number to be tested
     * Precondition: number > 0
     * @return true if every decimal digit of number is
     * a divisor of number, false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        //< your code goes here >
        int temp = number;
        while (temp > 0)
        {
            int num = temp % 10;
            if (num == 0 || number % num > 0)
            {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }
    
    /** @param start starting point for values to be checked
     * Precondition: start > 0
     * @param num the size of the array to be returned
     * Precondition: num > 0
     * @return an array containing the first num
     * integers >= start that are self-divisors 
     */
    public static int[] firstNumSelfDivisors(int start, int num)

    {
        //< your code goes here >
        int[] ans = new int[num];
        int count = 0;
        while(count < num)
        {
            if(isSelfDivisor(start))
            {
                ans[count] = start;
                count++;
            }
            start++;
        }
        return ans;
    }
}
