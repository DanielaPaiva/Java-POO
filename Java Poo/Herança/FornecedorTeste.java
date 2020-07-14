package POO;

public class FornecedorTeste {
	public static void main(String [] args)
	{
		Fornecedor f1=new Fornecedor("Roberto","Av.principal","1234-5678",200,50);
		System.out.println(f1.getNome());
		System.out.println(f1.getTelefone());
		System.out.println(f1.obterSaldo());
		
	}

}
