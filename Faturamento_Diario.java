package Desenvolvedor_2;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Faturamento_Diario {

	public static void main(String[] args) {
		
			String jsonString = "{ \"faturamento\": [0, 1500, 2200, 0, 3200, 500, 0, 2800, 3700, 900, 0, 2500, 4000, 1800, 2700, 0, 0, 3100, 2900, 2100, 1200, 3400, 0, 3800, 2600, 3300, 0, 0, 4100, 3600] }";
	        Gson gson = new Gson();
	        JsonObject json = gson.fromJson(jsonString, JsonObject.class);
	        JsonArray faturamento = json.getAsJsonArray("faturamento");

		        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0;
		        int diasValidos = 0, diasAcimaMedia = 0;

		        for (int i = 0; i < faturamento.size(); i++) {
		            double valor = faturamento.get(i).getAsDouble();
		            if (valor > 0) {
		                menor = Math.min(menor, valor);
		                maior = Math.max(maior, valor);
		                soma += valor;
		                diasValidos++;
		            }
		        }

		        double media = soma / diasValidos;

		        for (int i = 0; i < faturamento.size(); i++) {
		            double valor = faturamento.get(i).getAsDouble();
		            if (valor > media) {
		                diasAcimaMedia++;
		            }
		        }

		        System.out.println("Menor faturamento: R$" + menor);
		        System.out.println("Maior faturamento: R$" + maior);
		        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
		    }
		}
