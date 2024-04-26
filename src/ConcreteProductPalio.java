
public class ConcreteProductPalio extends Car{

	// Neste código, a classe ConcreteProductPalio representa uma implementação concreta de 
	// um produto de carro específico, neste caso, um Palio da Fiat. No construtor, os atributos 
	// do carro (modelo, fábrica e categoria) são definidos e, em seguida, as informações do carro são 
	// exibidas por meio do método showInformation().
	public ConcreteProductPalio() {
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
	}
}
