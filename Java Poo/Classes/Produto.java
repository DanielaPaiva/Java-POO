package POO;

public class Produto {
	private String tipo;
	private  int codigo;
	private double pre�o;
	private String marca;

	public Produto(String tip, int cd, double price,String marc)
	{
		tipo=tip;
		codigo=cd;
		pre�o=price;
		marca=marc;
	}

	public String getInfo()
	{
		String informacao="Tipo do Produto: "+tipo+"\nC�digo: "+codigo+"\nPre�o do Produto: "+pre�o+"\nMarca do Produto: "+marca;
		return informacao;
	}

	public String getLiberar() 
	{
		String uso="Produto liberado com SUCESSO.";
		return uso;
	}
	
}
