package curso.java.device.application;

import curso.java.device.entity.ComboDevice;
import curso.java.device.entity.ConcretePrinter;
import curso.java.device.entity.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2023");
        s.processDoc("My Email");
        System.out.println("Scan results: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2021");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
