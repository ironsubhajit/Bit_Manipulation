public class Bit {
  // Count number of 1's in long a [TC - Number set bits]
  public static int numOfSetBits(long a) {
    int count = 0;
    while(a > 0){
        a = (a & (a-1));
        count++;
    }
    return count;
  }
    
  // count the number of tailing Zeros
  public static int numOfTailingZeros(int A) {
    int count = 0;
    while((A&1) == 0){
        A = A >> 1;
        count++;
    }
    return count;
  }
  
  // Reverse the bits of an 32 bit unsigned integer A. 
  public static long reverse(long A) {
    long rev = 0;
    for (int i= 0; i < 32; i++){
      rev <<= 1L;
      if ((A & 1L) == 1L){
        rev ^= 1;
      }

      A >>>= 1L;
    }
    return rev;
  }
  
  // Driver Code
  public static void main(String[] args) {
    System.out.println(numOfSetBits(11));
    System.out.println(numOfTailingZeros(8));
    System.out.println(reverse(2));
  }
}
