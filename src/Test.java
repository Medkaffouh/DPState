import state.Avion;
import state.AvionImpl;

public class Test {
    public static void main(String[] args) {
        Avion avion=new AvionImpl();
        avion.doActivity();
        System.out.println("------------------------");
        avion.sortirDuGarage();
        System.out.println("------------------------");
        avion.doActivity();
        System.out.println("------------------------");
        avion.entrerAuGarage();
        System.out.println("------------------------");
        avion.doActivity();
        System.out.println("------------------------");
        avion.decoller();
        System.out.println("------------------------");
        avion.atterrir();
        System.out.println("------------------------");
        avion.sortirDuGarage();
        System.out.println("------------------------");
        avion.doActivity();
        System.out.println("------------------------");
        avion.decoller();
        System.out.println("------------------------");
        avion.doActivity();
        System.out.println("------------------------");
        avion.entrerAuGarage();
        System.out.println("------------------------");
        avion.decoller();
        System.out.println("------------------------");
        avion.atterrir();
        System.out.println("------------------------");
        avion.doActivity();
    }
}
