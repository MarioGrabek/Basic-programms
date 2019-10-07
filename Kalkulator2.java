import java.util.Scanner;

class Kalkulator2 {
	public static void main(String[] args){
		//deklaruję potrzebne zmienne
		double a,b; //a i b jako liczby całkowite
		char znak; //znak podany przez użytkownika, jako napis
		double wynik; //wynik jest double bo przyda sie przy dzieleniu 
		
		/*tworzę obiekt typu Scanner o nazwie scanner
		i ten obiekt jest nowym obiektem typu Scanner
		skanującym wejście systemowe (Stystem.in)*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj dwie liczby i wprowadzenie kazdej zmiennej zakoncz znakiem enter:");
		String aString = scanner.nextLine(); 
		String bString = scanner.nextLine();
		
		System.out.println ("Podaj znak");
		znak = scanner.next().charAt(0);; //pamietajmy, że pobraliśmy zarówno znak jak i znak specjalny konca lini, bo użytkownik wcisnał enter
		
		scanner.close();
		/*zmiaeniam podane przez użytkownika a i b na 
		liczby, korzystjąc z metody Integer.parseInt*/
		
		a = Integer.parseInt(aString);
		b = Integer.parseInt(bString);
		
		/*Przed zapisaniem wyniku pamietaj,
		że operujemy na liczbach typu int,
		a wynik zapisywany jest jako double.
		Musisz zamienić wynik na double podczas 
		wykonywania działania.
		Robi się to operatorem rzutowania (typ)
		w tym wypadku(double)
		*/
		
		switch(znak){
			case '+':
				wynik = a + b;
				System.out.println("Wynik to:" + wynik);
				break;
			case '-':
				wynik = a - b;
				System.out.println("Wynik to:" + wynik);
				break;
			case '*':
				wynik = a * b;
				System.out.println("Wynik to:" + wynik);
				break;
			case '/':
				wynik = a / b;
				System.out.println("Wynik to:" + wynik);
				break;
			default:
				System.out.println("ZLY ZNAK BARANIE!");
				break;
				
		}
		
	}

}