import java.math.BigInteger;
import java.util.*;

public class copyBigIntegerTest {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        System.out.print("How many numbers do you need");
        int k=in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n=in.nextInt();

        BigInteger lotteryOdds=BigInteger.valueOf(1);//???可能是赋值1

        for (int i=1;i<=k;i++)
        {
            lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(n-i+1).divide(
                    BigInteger.valueOf(i)
            ));
        }
        System.out.println("Your odds are 1 in "+lotteryOdds+".Good luck!");
    }
}
