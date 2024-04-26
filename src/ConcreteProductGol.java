
public class ConcreteProductGol extends Car{
	
	// Neste trecho de código, a classe ConcreteProductGol é uma implementação concreta de um 
	// produto de carro específico, neste caso, um Gol da Volks. No construtor, são definidos os 
	// atributos do carro (modelo, fábrica e categoria) e em seguida são exibidas as informações 
	// do carro através do método showInformation().
	
	public ConcreteProductGol() {
		this.setModel("Gol");
		this.setFactory("Volks");
		this.setCategory("Hatch");
		this.showInformation();
	}
	
}
