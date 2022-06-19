package state;

class EtatAuGarage extends State {

    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Trasition d'état de Garage => Piste");
        avion.setState(new EtatEnPiste(avion));
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible, je suis déja au garage");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller, je suis au garage");
    }

    @Override
    void executeAtterrir() {
        System.out.println("Impossible d'atterrir, je suis au garage");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état au garage ....."+i);
        }
    }
}
