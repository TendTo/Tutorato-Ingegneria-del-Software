public class Client {
    public static void main(String[] args) {
        Banca banca = new Banca(500);

        banca.deposita(200);
        banca.deposita(300);
        banca.saldo();

        banca.deposita(1); //errore capacità massima
        banca.preleva(900);
        banca.preleva(100);
        banca.preleva(10); //errore no fondi 

        banca.saldo();
        banca.storia();
    }
}