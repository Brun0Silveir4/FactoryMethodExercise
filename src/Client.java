
public class Client {


	// Neste trecho, a classe Client demonstra o uso do padrão Factory Method. 
	// Duas instâncias de CarCreator são criadas, uma para criar carros da Fiat
	// e outra para criar carros da Volks. Em seguida, o método buildCar() 
	// é chamado para cada instância de CarCreator, que utiliza o método Factory Method para criar carros 
	// específicos de cada fabrica.


	public static void main(String[] args) {
		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();

		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}
}
