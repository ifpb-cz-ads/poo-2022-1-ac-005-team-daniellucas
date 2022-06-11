/*
 * Resposta do exercicio BMExercicio06
 * que corresponde a alteracao do metodo
 * abreContaSimples desta classe que corresponde
 * a implementacao do modelo encontrado no arquivo
 * BMExercicio03.txt
*/

public class ContaBancariaSimplificada {
    
    private String nomeDoCorrentista;
    private double saldo;
    private boolean contaEhEspecial;

    public void abreConta(String nome, double deposito, boolean especial) {
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEhEspecial = especial;
    }

    public void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 100.00;
        contaEhEspecial = false;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void retira(double valor) {
        if(!contaEhEspecial) {
            if(valor <= saldo) {
                saldo -= valor;
            }
        } else {
            saldo -= valor;
        }
    }

    public void mostraDados() {
        System.out.print("O nome do correntista eh: ");
        System.out.println(nomeDoCorrentista);
        System.out.print("O saldo eh: ");
        System.out.println(saldo);
        if(contaEhEspecial) {
            System.out.println("A conta eh especial");
            if(saldo < 0) {
                System.out.println("Alerta! O saldo estah negativo");
            }
        } else {
            System.out.println("A conta eh comum");
        }
    }

}