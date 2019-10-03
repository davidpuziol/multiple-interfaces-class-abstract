package devices;
/*
 * Herda o serialnumber de Device e é obrigado a fazer o metodo processDoc() pela heranca
 * O metodo scan() tambem foi obrigado a ser executado pois implementa  interface scanner
 */

public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	@Override
	public String scan() {
		return "Scanned content";
	}
}
