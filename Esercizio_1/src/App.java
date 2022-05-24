public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("inizio partita !");

        Giocatori g1 = new Giocatori("giuseppe");
        Giocatori g2 = new Giocatori("erika");

        g1.start();
        g2.start();

        g1.join();
        g1.sleep(1000);
        System.out.println(g1.getNome() + " sta aspettando");
        g2.join();

        if(g1.getPunteggio() > g2.getPunteggio())
        {
            System.out.println(g1.getNome() + " : HA VINTO! , totalizzando : " + g1.getPunteggio() + " punti");
        }
        else
        {
            System.out.println(g2.getNome() + " : HA VINTO! , totalizzando : " + g2.getPunteggio() + " punti");
        }

    }
}