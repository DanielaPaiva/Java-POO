package POO;

public class Cachorro extends Animal
{
	//Construtor
	public Cachorro(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	
	//Métodos
	public void emitirSom()
	{
		System.out.println("Au,Au!");
	}
	public void correr() 
	{
		System.out.println("O cachorro está correndo!!");
	}
	public void dadosCachorro()
	{
		System.out.println("            CACHORRO             ");
		System.out.println("---------------------------------");
		System.out.println("Nome do Cachorro: "+ getNome());
		System.out.println("Idade: "+ getIdade());
		
	}

}
