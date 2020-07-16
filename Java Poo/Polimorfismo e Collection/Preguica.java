package POO;

public class Preguica extends Animal{
	
	
	//Construtor
	public Preguica(String nome, int idade) 
	{
		super(nome, idade);
	
	}
	//Métodos
	public void emitirSom() 
	{
		System.out.println("? ? ? ? ?");
	}
	public void subir() 
	{
		System.out.println("O bicho-preguiça está subindo a arvore!");
	}
	public void dadosPreguica()
	{
		System.out.println("\n      BICHO - PREGUIÇA       ");
		System.out.println("-------------------------------");
		System.out.println("Nome da preguiça:"+ getNome());
		System.out.println("Idade: "+ getIdade());
	}

}
