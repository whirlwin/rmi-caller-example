import java.rmi.Naming;


public class Main {

    public static void main(String[] args) throws Exception {
        Greetable g = (Greetable) Naming.lookup("rmi://localhost/Greeter");
        System.out.println(g.greet());
    }
}
