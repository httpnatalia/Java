package datas;

public class Concatenador {
	public static void main(String[] args) 
	{ 
		  String[] nomes = {
				  "Carlos",
				  "Eduardo",
				  "da",
				  "Costa",
				  "Xavier"
		  };
		  
		  System.out.println(Concatenar(nomes));;
	}
	
	public static String Concatenar(String[] lista)
	{
		String retorno = "";
		
		for (int i = 0; i < lista.length; i++)
			retorno += lista[i] + " ";
		
		return retorno.trim();
	}
}
