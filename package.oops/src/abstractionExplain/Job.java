package abstractionExplain;

abstract class Job {
    /**
     * all methods in interface are by default-2public static
     * all vars are by default public static and final
     */

    int salary=12000;

    abstract void work();

    abstract void deliveries();

    abstract void vacations();

    static void foundation(){
        System.out.println("Aasha");
    }

    final void aFin(){

    }




}
