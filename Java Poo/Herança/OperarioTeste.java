package POO;

public class OperarioTeste 
{
	public static void main(String [] args)
	{
		Operario op1=new Operario("Andreia","Rua Laranja","1258-9674","45-B",1254.25,5,200,75);
		System.out.println(op1.calcularSalario());
	}
}
