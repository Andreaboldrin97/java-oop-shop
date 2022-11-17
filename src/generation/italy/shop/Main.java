package generation.italy.shop;


/*
 * Todo:
Nel solito package generation.italy.shop creare classe Prodotto che rappresenta un singolo prodotto all'interno di un negozio. Il prodotto e' caratterizzato dalle seguenti informazioni:

codice - int
nome - String
descrizione - String
prezzo - int
iva - int
Nella classe, oltre alle variabili d'istanza generare i seguenti metodi:

costruttore che accetta in ingresso nome, descrizione, prezzo N.B.: il codice e' un valore a 5 cifre calcolato casualmente N.N.B.: il valore dell'iva e' fisso a 20 (inteso come 20%)
metodo che restituisce il prezzo
metodo che restituisce il prezzo incrementato dell'iva (PERCENTUALE)
metodo toString() che dia una rappresentazione sensata dell'oggetto
Nello stesso package aggiungere una classe Main con metodo main che verra' utilizzato per creare alcuni oggetti di prova e testarne le relative funzioni a scopo di debug.
 */
public class Main {

	public static void main(String[] args) {
		
		// creo l'istanza dell'oggeto nel main
		Prodotto prodotto1 = new Prodotto("MacBook Air","Il miglio pc del mondo ",1000);
		
		//stampio gli elementi dell'istanza creata
		System.out.println(prodotto1);
		System.out.println("---------------------------");
		
		//stampiamo il prezzo
		System.out.println("il prezzo del prodotto senza iva  è di " + prodotto1.getPrice() + " euro");
		
		//stampiamo il prezzo finale conpreso d'iva
		System.out.println("il prezzo del prodotto con iva  è di " + prodotto1.getTotalPrice() + " euro");
		
				
	}
	
}
