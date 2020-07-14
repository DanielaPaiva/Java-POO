package POO;

public class AdministradorTeste {
	public static void main(String [] args)
	{
		Administrador adm1= new Administrador("Andre","Rua amarelo","1458-58","14-5",1500,35,250);
		System.out.println(adm1.getNome());
		System.out.println(adm1.getAjudaDeCusto());
		System.out.println(adm1.calcularSalario());
		
	}

}
