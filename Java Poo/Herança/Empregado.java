/*Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, 
para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base)
imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario.
Escreva um programa de teste adequado para a classe Empregado. */
package POO;

	public class Empregado extends Pessoa
	{	private String codigoSetor;
		public double salarioBase;
		public float imposto;
		
		//Construtor
		public Empregado(String nome, String endereco, String telefone, String codigoSetor,double salarioBase, float imposto) 
		{
			super(nome, endereco, telefone);
			this.codigoSetor=codigoSetor;
			this.salarioBase=salarioBase;
			this.imposto=imposto;
		}
		
		
		//Getters e Setters
		public String getCodigoSetor() {
			return codigoSetor;
		}

		public void setCodigoSetor(String codigoSetor) {
			this.codigoSetor = codigoSetor;
		}

		public double getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}

		public float getImposto() {
			return imposto;
		}

		public void setImposto(float imposto) {
			this.imposto = imposto;
		}
		
		//Método
		public double calcularSalario()
		{ double salario;
			salario=Math.round(salarioBase+=salarioBase*(imposto/100));
		return salario;
		}
		
		
	}
