class Main {
  public static void main(String[] args) {
    String frase1;
    String frase2;
    frase1 = new String("Testando igualdade!");
    frase2 = new String("Testando igualdade!");
    System.out.println("\nFrase 1: " +frase1);
    System.out.println("\nFrase 2: " +frase2);
    System.out.println("\nFrase 1 e Frase 2 possuem o mesmo conteúdo? \nResultado: " +(frase1.equals(frase2)));
  }
}