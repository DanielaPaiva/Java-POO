/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para
manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
package POO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Collections 
{
	public static void main(String [] args)
	
	{	int opcao;
		Scanner teclado= new Scanner(System.in);
		Collection <String> estoque= new ArrayList();
		
		
		
		do {
			System.out.println("\n           Digite uma opção: "           );
			System.out.println("----------------------------------------");
			System.out.println("(1)Deseja adicionar produtos ao estoque\n(2)Deseja remover\n(3)Atualizar\n(4)Mostrar todos os produtos do estoque\n(0)Encerrar programa");
			System.out.println("----------------------------------------");
			opcao=teclado.nextInt();
		
			
			switch(opcao)
				{
					case 1:
			
						System.out.print("Digite o produto para adicionar ao estoque:");
						String produto=teclado.next();
						estoque.add(produto);
						break;
			
					case 2:
			
						System.out.println("Digite o produto para remover do estoque:");
						String produtor=teclado.next();
						estoque.remove(produtor);
						break;
						
					case 3:
						
						System.out.println("Digite o produto que quer atualizar: ");
						String verifica=teclado.next();
						System.out.println("Digite o nome do produto que entrará no lugar de "+verifica+":");
						String novo=teclado.next();
						
						if(estoque.contains(verifica))
						{
							estoque.remove(verifica);
							estoque.add(novo);
						}
						System.out.println(estoque);
						break;
			
					case 4:
						
						System.out.println(" Os produto  do estoque:");
						System.out.println(estoque);
						break;
						
					default:
						System.out.println("Digite um número válido");
				
					}
		
		}while(opcao!=0);

	}

	
}

