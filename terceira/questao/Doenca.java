package terceira.questao;

import java.util.Arrays;

public class Doenca {
    private static Object sintomas;
	private static char[] nome;

	public Doenca(String string, String[] strings) {
	
	}

	public static void main(String args[])
    {
        Doenca[] doencas = {
            new Doenca("Dengue", new String[]{"Dor abdominal", "Vômitos", "Sonolência"}),
            new Doenca("Esporotricose", new String[]{"Lesão", "Nódulo", "Pápula"}),
            new Doenca("Febre amarela", new String[]{"Dor de cabeça", "Dores nas costas", "Sonolência"}),
        };
        
        possiveisDoencasPorSintoma(doencas, "Sonolência");
        
    }
    
    public static void possiveisDoencasPorSintoma(Doenca[] doencas, String sintoma)
    {
        for (int i = 0; i < doencas.length; i++) {
            if (Arrays.asList(Doenca.sintomas).contains(sintoma)) {
                System.out.println(doencas[i].nome);
            }
        }
    }
}
