package GenericClass;

public class PairTest {
    public static void main(String[] args){
        String[] words = {"Mary","had","a","little","lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        String middle = ArrayAlg2.getMiddle("John","!","Public");
        double middle2 = ArrayAlg2.getMiddle(3.14,2.2,1.1);
        System.out.println(middle);
    }
}

class ArrayAlg{
    public static Pair<String> minmax(String[] a){
        if (a == null || a.length == 0) return null;

        String min = a[0];
        String max = a[0];
        //第一个字符串比第二个字符串靠前，返回负值
        for (int i = 1; i < a.length; i++){
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min,max);
    }
}
class ArrayAlg2{
    public static <T> T getMiddle(T... a){
        return a[a.length/2];
    }
}
