public class User implements Observer {

    public void readPrice() {

    }

    @Override
    public void update(Subject s, Object o) {

        System.out.println("Lo sconto e di" + s.getSconto);

    }
}
