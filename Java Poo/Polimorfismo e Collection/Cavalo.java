package POO;

public class Cavalo extends Animal 
{
	
	//Construtor
	public Cavalo(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	//Métodos
	public void emitirSom() 
	{
		System.out.println("Hiin in in ...");
	}
	public void correr() 
	{
		System.out.println("O cavalo está galopando!:");
	}
	public void dadosCavalo()
	{
		System.out.println("\n           CAVALO                ");
		System.out.println("-----------------------------------");
		System.out.println("Nome do Cavalo:"+ getNome());
		System.out.println("Idade: "+ getIdade());
	}

}
