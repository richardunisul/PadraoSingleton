// C�digo retirado do livro :FREEMAN, Eric; FREEMAN, Elisabeth. Use a cabe�a: padr�es e projetos. 2. ed. rev. Rio de Janeiro: Alta Books, 2009. xxiv, 478 p. (Use a cabe�a!). ISBN 9788576081746.
public class Chocolateboiler {
	private boolean empty;
	private boolean boiled;
	
	private Chocolateboiler() {  // Este c�digo s� � iniciado quando a caldeira est� vazia
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
	
	public void drain() {  //Para drenar a caldeira, ela deve estar cheia (n�o vazia) e tamb�m em ebuli��o. Depois, configuramos empty como true novamente
		if(!isEmpty() && isBoiled()) {
			//drene o leite e o chocolate fervidos
			empty = true;
		}
	}
	
	public void boil() {// Para fever a mistura,  a caldeira deve estar cheia e ainda n�o deve ter  fervida. Depois de fever, congiguramos o indicador boiled como true.
		if (!isEmpty() && !isBoiled()) {
			//coloque o conte�do em ebuli��o  
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
