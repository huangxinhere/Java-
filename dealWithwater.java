interface dealing{//好像题目的意思是有多个接口。
    public void guolv();
    public void huanChong();
    public void jiaRe();
    public void fangTang();
}

 public class dealWithwater {
    public static void main(String[] args)
    {
        cleanWater1 water=new cleanWater1();
        water.jiaRe();
    }
}//缺纯净水2

class cleanWater1 extends dealWithwater implements dealing
{
    public void guolv()
    {
        System.out.println("在过滤。");
    }
    public void huanChong()
    {
        System.out.println("在缓冲。");
    }
    public void jiaRe()
    {
        System.out.println("在加热。");
    }
    public void fangTang()
    {
        System.out.println("在放糖。");
    }
}