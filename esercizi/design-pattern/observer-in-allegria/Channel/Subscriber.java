public class Subscriber implements Observer {

    public void update(Subject subject, Object state) {
        if (subject instanceof Channel c) {
            System.out.println("E' uscito un nuovo video dal titolo " + c.videos.get(c.videos.size()));
        }
    }
}