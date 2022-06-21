/*
 * Teste correspondente a classe LampadaDeSupermercado.
*/
public class LampadaDeSupermercadoTeste {

    public static void main(String args[]) {
        LampadaDeSupermercado lampada = new LampadaDeSupermercado();
        lampada.setPreco(4.50);
        lampada.setTipo("incandescente");
        lampada.setMarca("Philips");

        System.out.println("Preco da lampada: " + lampada.getPreco());
        System.out.println("Tipo da lampada: " + lampada.getTipo());
        System.out.println("Marca da lampada: " + lampada.getMarca());
    }
    
}