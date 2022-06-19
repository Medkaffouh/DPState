package state;

class EtatEnLair extends State {

    public EtatEnLair(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du garage, je suis en l'air");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible d'entrer du garage, je suis en l'air");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller, je suis déja en l'air");
    }

    @Override
    void executeAtterrir() {
        System.out.println("Trasition d'état de En l'air => Piste");
        avion.setState(new EtatEnPiste(avion));
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en l'air ....."+i);
        }
    }
}
