package abstractionExplain;

public class Employee extends Job{


    @Override
    void work() {

    }

    @Override
    void deliveries() {

    }
    // this @Override shows that there is runtime polymorphism(method overriding)
    @Override
    void vacations() {

    }

    //we cannot override a final method
    @Override
    void aFin(){

    }

    public static void main(String[] args) {
        Employee
        foundation();
        Employee employee= new Employee();
        //abstract class vars are not final by default like interface
        employee.salary=12323312;
    }
}
