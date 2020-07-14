
package POO;

public class VendedorTeste {
	public static void main(String [] args)
	{
		Vendedor v1=new Vendedor("Anderson","Rua Vermelha","1526-8974",1256.5,15);
		System.out.println(v1.nome);
		System.out.println(v1.endereco);
		System.out.println(v1.comissaoValor());
	}

}
