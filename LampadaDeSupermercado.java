/*
 * Resposta do exercicio BMExercicio04
 * que corresponde a implementacao do modelo
 * LampadaDeSupermercado localizado no arquivo
 * BMExercicio01.txt
*/
public class LampadaDeSupermercado {

    private double preco;
    private String tipo;
    private String marca;

    public void setPreco(double novoPreco) {
        preco = novoPreco;
    }

    public double getPreco() {
        return preco;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String novaMarca) {
        marca = novaMarca;
    }

    public String getMarca() {
        return marca;
    }

}