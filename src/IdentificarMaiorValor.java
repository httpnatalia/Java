package datas;

public class IdentificarMaiorValor {
	public static void main(String[] args) 
	{ 
		  int[] valores = {
				  334,
				  568,
				  123,
				  796,
				  225
		  };
		  
		  System.out.println(ValidarMaior(valores));;
	}
	
	public static int ValidarMaior(int[] lista)
	{
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > maior) {
				maior = lista[i];
			}
		}
	
		return maior;
	}
}
