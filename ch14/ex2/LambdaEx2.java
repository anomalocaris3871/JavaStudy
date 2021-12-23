package ch14.ex2;

@FunctionalInterface
interface MyFunction {
    void myMethod();
}

public class LambdaEx2 {

    public static void main(String[] args) {
        MyFunction f = ()->{};
        Object obj = (MyFunction)(()->{});
        String str = ((Object)(MyFunction)(()->{})).toString();

        System.out.println("f = " + f);
        System.out.println("obj = " + obj);
        System.out.println("str = " + str);

        //System.out.println(()->{});
        System.out.println((MyFunction)(()->{}));

        //System.out.println((MyFunction)(()->{}).toString());
        System.out.println(((Object)(MyFunction)(()->{})).toString());

    }
}

