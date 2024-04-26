
public class FiatConcreteCreator extends CarCreator {

	// Nesta classe, FiatConcreteCreator, a implementação do método factoryMethod() retorna uma 
	// instância de ConcreteProductPalio, que é um produto específico da Fiat. 
	// Isso demonstra a utilização do padrão para criar carros da marca Fiat.

	protected Car factoryMethod() {
		return new ConcreteProductPalio();
	}
}
