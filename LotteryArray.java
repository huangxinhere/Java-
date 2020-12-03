public class LotteryArray {
    public static void main(String[] args)
    {
        final int NMAX=10;

        int[][] odds=new int[NMAX+1][];//n从0开始到NMAX共11，所以int NMAX+1
        for (int n=0;n<=NMAX;n++)
        {
            odds[n]=new int[n+1];
        }

        for (int n=0;n< odds.length;n++)
        {
            for (int k=0;k<odds[n].length;k++)
            {
                int lotteryOdds=1;//由每行的元素个数限制
                for (int i=1;i<=k;i++)
                    lotteryOdds=lotteryOdds*(n-i+1)/i;//核心计算：杨辉三角

                odds[n][k]=lotteryOdds;
            }
        }
        for (int[] row:odds)
        {
            for(int odd:row)
                System.out.printf("%4d",odd);
            System.out.println();
        }
    }
}
