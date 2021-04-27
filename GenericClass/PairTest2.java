package GenericClass;

import java.time.LocalDate;
import java.util.Locale;

/*
* 类型变量的限定：
* 1.表示 T 应该是绑定类型（Comparable之类的）的子类型，选
择关键字 extends 的原因是更接近子类的概念
* 2.T 和绑定类型可以是类， 也可以是接口
* 3.一个类型变量或通配符可以有多个限定：T extends Comparable & Serializable
* 限定类型用“ &” 分隔，而逗号用来分隔类型变量
* 4.可以根据需要拥有多个接口超类型， 但限定中至多有一个类
* 如果用一个类作为限定，它必须是限定列表中的第一个
* */
public class PairTest2 {
    public static void main(String[] args){
        LocalDate[] birthdays = {
            LocalDate.of(1906,12,9),
            LocalDate.of(2001,11,24),
            LocalDate.of(1998,2,1)
        };
        Pair<LocalDate> mm = ArrayAlg3.minmax(birthdays);

        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }

}
class ArrayAlg3{
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if (a == null ) return null;
        T min = a[0];
        T max = a[0];
        for (int i=1;i<a.length;i++){
            if (min.compareTo(a[i])>0) min=a[i];
            if (max.compareTo(a[i])<0) max=a[i];
        }
        return new Pair<>(min,max);
    }
}
