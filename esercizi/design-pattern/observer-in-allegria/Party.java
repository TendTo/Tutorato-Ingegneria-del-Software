public class Party implements Subject {
    private List<String> players = new LinkedList<>();

    public void onChange() {
        onChange(super,players);
    }

    public void onChange(Subject subject, Object state) {
        for (Observer o : observers) {
            o.update(subject, state);
        }
    }

    public void join(String name) {

    public void join(String name) {

    public void join(String name) {
nfor()aList<Strinfg> plateyers{}hCno

    void join(String name) {
        players.add(name);
        onChange();
    }

    public void leaveParty(String name) {
        players.remove(name);
        onChange();
    }

}