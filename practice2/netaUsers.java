package practice2;

public class netaUsers {
    private int psw;
    private String id;
    private String email;

    public netaUsers(int p,String i,String e)
    {
        this.psw=p;
        this.id=i;
        this.email=e;
        System.out.println(id+"\n"+psw+"\n"+email);//直接输出?
    }

    public netaUsers(int p,String i)
    {
        this.psw=p;
        this.id=i;
        this.email=id+"@gameschool.com";//变量加字符串的定义形式

        System.out.println(id+"\n"+psw+"\n"+email);
    }

    public static void main(String[] args)
    {
        netaUsers amy=new netaUsers(12335,"amy","111@qq.com");
        netaUsers tom=new netaUsers(12336,"tom");
    }

}
