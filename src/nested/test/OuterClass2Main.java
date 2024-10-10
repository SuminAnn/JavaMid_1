package nested.test;

import nested.test.OuterClass2.InnerClass;

public class OuterClass2Main {

    public static void main(String[] args) {
        //여기에서 InnerClass의 hello()를 호출하라
        OuterClass2 outer = new OuterClass2();
        InnerClass innerClass = outer.new InnerClass();
        innerClass.hello();
    }
}
