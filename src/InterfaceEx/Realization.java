package InterfaceEx;

public class Realization implements IntA, IntB {

    @Override
    public void method() {
        IntA.super.method();
    }

    public static void main(String[] args) {
        Realization realization = new Realization();
        realization.method();
    }
}
