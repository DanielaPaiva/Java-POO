/*Implemente a classe Operario como subclasse da classe Empregado.
Um determinado oper�rio tem como atributos, para al�m dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao
(que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) e comissao (que corresponde � porcentagem do 
valorProducao que ser� adicionado ao vencimento base do oper�rio). Note que dever� redefinir nesta subclasse o m�todo herdado 
calcularSalario (o sal�rio de um oper�rio � equivalente ao sal�rio de um empregado usual acrescido da referida comiss�o).
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
	
	//M�todo
	public double calcularSalario()
	{ double salario;
	salario=Math.round(salarioBase+=salarioBase*(imposto/100)+(comissao/100));
	return salario;
}
	

}
