// Un téléphone est un electronique, donc il prends aussi les attributs de ce dernier
// En java on dit que c'est une extention.

public class Phone extends Electronic {
    private String brand;
    private Application currentApplication;
    private boolean isStarted = false;

    // Cette fonction possède le même nom que la classe
    // Elle sera appelée automatiquement quand je ferais
    // Phone monPhone = new Phone("Android");
    public Phone(String brand) {
        this.brand = brand; // J'attribue la marque de CE telephone a la marque donnée
    }

    public boolean start() {
        if (this.getCharge() <= 0)
            return false;
        this.isStarted = true;
    }

    public void shutDown() {
        this.currentApplication = null;
        this.isStarted = false;
    }

    // Même si le fichier Phone.java ne possède pas la méthode "getChargeAmount()"
    // Elle la récupère de la classe Electronic de laquelle elle hérite

    public boolean launchApplication(Application app) {
        if (this.isStarted == false || app.getChargeAmount() > this.getCharge()) {
            this.shutDown();
            return false;
        }
        this.currentApplication = app;
    }
}