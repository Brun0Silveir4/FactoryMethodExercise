
public abstract class CarCreator {

	//	Esse código define uma classe abstrata CarCreator que possui um método buildCar(),
	// que utiliza o padrão Factory Method para criar um objeto Car. A implementação 
	//concreta desse método é delegada às subclasses, através do método abstrato factoryMethod().


	public void buildCar() {
		Car carro = factoryMethod();
	}

	protected abstract Car factoryMethod();
}
