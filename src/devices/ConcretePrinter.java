package devices;
/*
* Herda o serialnumber de Device e é obrigado a fazer o metodo processDoc() pela heranca
* O metodo print() tambem foi obrigado a ser executado pois implementa  interface Printer
*/

public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}
