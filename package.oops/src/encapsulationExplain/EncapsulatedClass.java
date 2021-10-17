package encapsulationExplain;

public class EncapsulatedClass {

    private static int privateVar= 90000;

    public static int getPrivateVar() {
        return privateVar;
    }

    public static void setPrivateVar(int privateVar) {
        EncapsulatedClass.privateVar = privateVar;
    }
}
