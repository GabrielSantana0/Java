package Desafio.interfacesDesafios.desafioMusica;

public class principalMusica {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast mp = new Podcast();
        mp.setTitulo("BolhaDev");
        mp.setApresentador("Marcus mendes");

        for (int i = 0; i < 5000; i++) {
            mp.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            mp.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(mp);
        preferidas.inclui(minhaMusica);

    }
}
