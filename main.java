class Main{
  public static void main(String[] args){
    RegistraAluno daniel = new RegistraAluno();
    RegistraAluno lucas = new RegistraAluno();
    RegistraAluno jonathan = new RegistraAluno();

    daniel.setNome("Daniel de Oliveira");
    lucas.setNome("Lucas Marques");
    jonathan.setNome("Jonathan César");

    System.out.println(lucas.getNome());
    System.out.println("Contador: " +RegistraAluno.getQuantidadeAlunos());
  }
}