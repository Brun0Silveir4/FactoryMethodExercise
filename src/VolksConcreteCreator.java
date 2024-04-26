
public class VolksConcreteCreator extends CarCreator{

	// Nesta classe, VolksConcreteCreator, a implementação do método factoryMethod() retorna uma 
	// instância de ConcreteProductGol, que é um produto específico da Fiat. 
	// Isso demonstra a utilização do padrão para criar carros da marca Volks.
	
	protected Car factoryMethod() {
		return new ConcreteProductGol();
	}
}
