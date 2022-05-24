public class Giocatori extends Thread
{
    private String nome;
    private int dado1;
    private int dado2;
    private int punteggio;


    public Giocatori(String nome) 
    {
        this.nome = nome;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDado1() {
        return this.dado1;
    }

    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    public int getDado2() {
        return this.dado2;
    }

    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " : "+ nome + " : sta giocando");
        
        dado1 = (int) (6*Math.random()+1);
        dado2 = (int) (6*Math.random()+1);
        punteggio = punteggio + dado1 + dado2;

        System.out.println(nome + "  ha fatto : " + dado1 + " e : " + dado2);

        if(dado1 == dado2)
        {
            System.out.println(Thread.currentThread().getName() + " : "+ nome + "ha fatto doppio ! \n ha diritto ad un lancio BONUS! ");

            dado1 = (int) (6*Math.random()+1);
            dado2 = (int) (6*Math.random()+1);
            punteggio = punteggio + dado1 + dado2;

            System.out.println(nome + "  ha fatto : " + dado1 + " e : " + dado2);
        }
    }

    public int getPunteggio()
    {
        return this.punteggio;
    }

    public void setPunteggio(int punteggio)
    {
        this.punteggio = punteggio;
    }

}
