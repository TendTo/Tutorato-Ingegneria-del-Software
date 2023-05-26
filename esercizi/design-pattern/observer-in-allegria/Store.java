
class Store extends Subject {
    int prezzo;
    int sconto;

    @Override
    public void onChange() {
        for (Observer obs : observers) {
            obs.update(this, obs);
            ;
        }
    }

    public int getPrezzo() {
        return prezzo;
    }

    int getSconto() {
        return sconto;
    }

    public void setSconto(int discount) {
        sconto = discount;
    }

    public void setPrezzo(int price) {
        prezzo = price;
    }
}