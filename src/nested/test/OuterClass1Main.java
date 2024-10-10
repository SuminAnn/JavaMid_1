package nested.test;

import nested.test.OuterClass1.NestedClass;

public class OuterClass1Main {

    public static void main(String[] args) {
        //여기에서 NestedClass의 hello()를 호출하라
        NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
