/*Implemente a classe Administrador como subclasse da classe Empregado. 
Um determinado administrador tem como atributos, para al�m dos atributos da classe Pessoa e da classe Empregado,
o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...). Note que dever� redefinir na classe Administrador 
o m�todo herdado calcularSalario (o sal�rio de um administrador � equivalente ao sal�rio de um empregado usual acrescido das ajuda de custo).
Escreva um programa de teste adequado para esta classe.*/
package POO;

public class Administrador extends Empregado 
{
	private double ajudaDeCusto;

	//Construtor
	public Administrador(String nome, String endereco, String telefone, String codigoSetor, double salarioBase,float imposto,double ajudaDeCusto)
	{
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto=ajudaDeCusto;
	
	}

	//Getters e Setters
	public Double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//M�todo
	public double calcularSalario()
	{
		double salario;
		salario=Math.round(salarioBase+=salarioBase*(imposto/100))+ajudaDeCusto;
		return salario;
		
		
	}
	

}
