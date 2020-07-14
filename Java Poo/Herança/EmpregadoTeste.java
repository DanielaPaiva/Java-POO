package POO;

public class EmpregadoTeste {
	public static void main(String [] args)
	{
		Empregado e1= new Empregado("Ana","Rua Verde","1236-7895","101-A",1200,10);
		System.out.println(e1.getNome());
		System.out.println(e1.getTelefone());
		System.out.println(e1.getCodigoSetor());
		System.out.println(e1.calcularSalario());
	}

}
