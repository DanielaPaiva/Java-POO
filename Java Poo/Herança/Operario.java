/*Implemente a classe Operario como subclasse da classe Empregado.
Um determinado operário tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao
(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao (que corresponde à porcentagem do 
valorProducao que será adicionado ao vencimento base do operário). Note que deverá redefinir nesta subclasse o método herdado 
calcularSalario (o salário de um operário é equivalente ao salário de um empregado usual acrescido da referida comissão).
Escreva um programa de teste adequado para esta classe.*/
package POO;

public class Operario extends Empregado 
{	private int valorProducao;
	private float comissao;
	

	//Construtor
	public Operario(String nome, String endereco, String telefone, String codigoSetor, double salarioBase,float imposto,int valorProducao,float comissao)
	{
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao=valorProducao;
		this.comissao=comissao;
		
	}

	//Getters e Setters
	public int getValorProducao() {
		return valorProducao;
	}


	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}


	public float getComissao() {
		return comissao;
	}


	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	//Método
	public double calcularSalario()
	{ double salario;
	salario=Math.round(salarioBase+=salarioBase*(imposto/100)+(comissao/100));
	return salario;
}
	

}
