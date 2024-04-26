
public class FiatConcreteCreator extends CarCreator {

	protected Car factoryMethod() {
		return new ConcreteProductPalio();
	}
}
