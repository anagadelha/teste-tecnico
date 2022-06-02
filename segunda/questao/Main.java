package segunda.questao;

public class Main {

	public static void main(String[] args) {
		SerVivo animal = new Animal();
        SerVivo vegetal = new Vegetal();
        
		System.out.println(serVivoRespira(animal));
		
	}

	public static String serVivoRespira(SerVivo serVivo) {
        return serVivo.respira;
    }
}
