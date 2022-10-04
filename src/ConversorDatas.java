package datas;

public class ConversorDatas {
	  public static void main(String[] args) 
	  { 
		  String[] datas = {
				  "01/05/2018",
				  "01 05 2018",
				  "01052018",
				  "2018 05 01",
				  "20180501",
				  "2018-05-01",
				  "2022/05  -01"
		  };
		  
		  for (int i = 0; i < datas.length; i++) 
			  System.out.println(ConverterDatas(datas[i]));
	  }
	  
	  public static String ConverterDatas(String dataRecebida)
	  {
		  int anoInicial = 1913;
		  
		  String dataSomenteNumeros = dataRecebida.replaceAll("[^0-9]", "");
		  
		  if (dataSomenteNumeros.length() != 8) 
			return "A data informada está incorreta.";  

		  String ano = dataSomenteNumeros.substring(0, 4);
		  String mes = "";
		  
		  if (Integer.parseInt(ano) >= anoInicial) 
			  mes = dataSomenteNumeros.substring(4, 6);
		  else
			  mes = dataSomenteNumeros.substring(2, 4);
			  ano = dataSomenteNumeros.substring(4, 8);
		   
		  return ano + "/" + mes;
	  }
}

