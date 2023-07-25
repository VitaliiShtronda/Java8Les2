package InterfaceEx;

public interface IntA {

    default void method() {
        System.out.println("FromA");
    };
}
