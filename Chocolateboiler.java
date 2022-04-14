// Código retirado do livro :FREEMAN, Eric; FREEMAN, Elisabeth. Use a cabeça: padrões e projetos. 2. ed. rev. Rio de Janeiro: Alta Books, 2009. xxiv, 478 p. (Use a cabeça!). ISBN 9788576081746.
public class Chocolateboiler {
	private boolean empty;
	private boolean boiled;
	
	private Chocolateboiler() {  // Este código só é iniciado quando a caldeira está vazia
		empty = true;
		boiled = false;
	}
	
	public void fill() {  // Para encher a caldeira, ela deve estar vazia e , quando estiver cheia, configuramos os indicadores de empty e boiled
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// preencha a caldeira com uma mistura de leite e chocolate
		}
	}
	
	public void drain() {  //Para drenar a caldeira, ela deve estar cheia (não vazia) e também em ebulição. Depois, configuramos empty como true novamente
		if(!isEmpty() && isBoiled()) {
			//drene o leite e o chocolate fervidos
			empty = true;
		}
	}
	
	public void boil() {// Para fever a mistura,  a caldeira deve estar cheia e ainda não deve ter  fervida. Depois de fever, congiguramos o indicador boiled como true.
		if (!isEmpty() && !isBoiled()) {
			//coloque o conteúdo em ebulição  
			boiled = true; 
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
}
