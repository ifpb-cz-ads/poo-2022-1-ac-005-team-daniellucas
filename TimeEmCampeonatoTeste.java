/*
 * Teste correspondente a classe TimeEmCampeonato.
*/

import java.util.ArrayList;

public class TimeEmCampeonatoTeste {
    
    public static void main(String[] args) {
        TimeEmCampeonato time = new TimeEmCampeonato();
        ArrayList<String> jogadoresDoTime = new ArrayList<String>();
        jogadoresDoTime.add("Messi");
        jogadoresDoTime.add("Neymar");
        jogadoresDoTime.add("Ronaldinho");
        jogadoresDoTime.add("Cristiano");
        jogadoresDoTime.add("Peleh");
        String treinadorDoTime = "Brock";
        time.adicionarVitoria();
        time.adicionarVitoria();
        time.adicionarVitoria();
        time.adicionarDerrota();
        time.adicionarEmpate();
        time.adicionarEmpate();
        time.criarTime(jogadoresDoTime, treinadorDoTime);

        System.out.println("JOGADORES DO TIME:");
        imprimirJogadoresDoTime(time);

        time.removerJogador("Neymar");

        System.out.println("\nTIME:");
        imprimirJogadoresDoTime(time);
        System.out.println("treinador: " + time.getTreinador());
        System.out.println("vitorias: " + time.getVitorias());
        System.out.println("derrotas: " + time.getDerrotas());
        System.out.println("empates: " + time.getEmpates());
    }

    public static void imprimirJogadoresDoTime(TimeEmCampeonato time) {
        ArrayList<String> jogadores = time.getJogadores();
        for(int i = 0; i < jogadores.size(); i++) {
            System.out.println("jogador" + i + ": " + jogadores.get(i));
        }
    }

}