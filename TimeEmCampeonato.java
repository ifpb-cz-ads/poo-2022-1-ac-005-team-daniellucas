/*
 * Resposta do exercicio BMExercicio05
 * que corresponde a implementacao do modelo
 * TimeEmCampeonato localizado no arquivo
 * BMExercicio02.txt.
*/

import java.util.ArrayList;

public class TimeEmCampeonato {
    
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;
    private ArrayList<String> jogadores = new ArrayList<String>();
    private String treinador;

    public void criarTime(ArrayList<String> jogadoresDoTime, String treinadorDoTime) {
        adicionarJogadores(jogadoresDoTime);
        setTreinador(treinadorDoTime);
    }

    public void adicionarJogadores(ArrayList<String> novosJogadores) {
        for(String jogador : novosJogadores) {
            adicionarJogador(jogador);
        }
    }

    public void adicionarJogador(String novoJogador) {
        jogadores.add(novoJogador);
    }

    public void removerJogador(String jogador) {
        jogadores.remove(jogador);
    }

    public ArrayList<String> getJogadores() {
        return jogadores;
    }

    public void setTreinador(String novoTreinador) {
        treinador = novoTreinador;
    }

    public String getTreinador() {
        return treinador;
    }

    public void adicionarVitoria() {
        vitorias++;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void adicionarDerrota() {
        derrotas++;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void adicionarEmpate() {
        empates++;
    }

    public int getEmpates() {
        return empates;
    }

}