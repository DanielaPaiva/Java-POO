package POO;

public class Preguica extends Animal{
	
	
	//Construtor
	public Preguica(String nome, int idade) 
	{
		super(nome, idade);
	
	}
	//M�todos
	public void emitirSom() 
	{
		System.out.println("? ? ? ? ?");
	}
	public void subir() 
	{
		System.out.println("O bicho-pregui�a est� subindo a arvore!");
	}
	public void dadosPreguica()
	{
		System.out.println("\n      BICHO - PREGUI�A       ");
		System.out.println("-------------------------------");
		System.out.println("Nome da pregui�a:"+ getNome());
		System.out.println("Idade: "+ getIdade());
	}

}
