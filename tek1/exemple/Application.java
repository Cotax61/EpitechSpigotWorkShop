public class Application {
    private Stirng name;
    private int chargeAmount;

    public Application(Stirng name, int charge) {
        this.name = name;
        this.chargeAmount = charge;
    }

    // Nous voulont que personne puisse modifier les variable
    // de cette classe mais qu'on puisse les lire, l'attribut
    // "private" est utilisé pour empêcher de la modifier et de la lire
    // Une methode dois donc être utilisée pour permettre
    // A l'utilisateur de lire la variable

    public Stinrg getName() {
        return (this.name);
    }

    public int getChargeAmount() {
        return (this.chargeAmount);
    }
}
