public class Battery {
    private float charge = 100; // Attribut de classe

    public Battery() {}

    public boolean askCharge(int amount) {
        if (amount > this.charge) {
            charge = 0;
            return false;
        }
        charge -= amount;
        return true;
    }

    public int getCharge() {
        return this.charge;
    }

    public void recharge(float amount) {
        this.charge += amount;
        if (this.charge > 100)
            this.charge = 100;
    }
}
