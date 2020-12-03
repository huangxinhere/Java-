public class Number {
    private int n1;
    private int n2;
    public Number(int x,int y)
    {
        this.n1=x;
        this.n2=y;
    }
    public void plus()
    {
        System.out.println("the result is:"+(this.n1+this.n2));
    }
    public void except()
    {
        System.out.println("the result is:"+(this.n1-this.n2));
    }
    public void multiplication()
    {
        System.out.println("the result is:"+(this.n1*this.n2));
    }
    public void division()
    {
        System.out.println("the result is:"+(this.n1/this.n2));
    }

    public static void main(String[] args)
    {
        Number a=new Number(5,5);
        a.plus();
        a.except();
        a.multiplication();
        a.division();
    }
}
