package POO;

public class TesteAnimal 
{
	public static void main(String [] args)
	{
		Cachorro c= new Cachorro("Jade",3);
		c.dadosCachorro();
		c.correr();
		c.emitirSom();
		
		Cavalo cv = new Cavalo("x",5);
		cv.dadosCavalo();
		cv.correr();
		cv.emitirSom();
		
		Preguica p= new Preguica("Luna",6);
		p.dadosPreguica();
		p.subir();
		p.emitirSom();
		
		
		
	}
}
