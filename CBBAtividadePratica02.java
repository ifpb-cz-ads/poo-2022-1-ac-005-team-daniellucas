class Main {
  public static void main(String[] args) {
    String frase3;
    String frase4;
    frase3 = new String("Lucas está fazendo dupla com Daniel ");
    frase4 = frase3;
    System.out.println("\nFrase 3: " +frase3);
    System.out.println("\nFrase 4: " +frase4);
    System.out.println("\nFrase 3 e Frase 4 possuem a mesma referência? \nResultado: " +(frase3==frase4));
  }
}