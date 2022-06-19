package state;

class EtatEnPiste extends State {

    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de Sortir du garage je suis déja en piste");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Transition d'état de En Piste => Garage");
        avion.setState(new EtatAuGarage(avion));
    }

    @Override
    void executeDecoller() {
        System.out.println("Trasition d'état de En Piste => Décollage");
        avion.setState(new EtatEnLair(avion));
    }

    @Override
    void executeAtterrir() {
        System.out.println("Impossible, je suis déja en piste");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en piste ....."+i);
        }
    }
}
