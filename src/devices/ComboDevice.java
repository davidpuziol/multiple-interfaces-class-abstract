package devices;
/*
* Herda o serialnumber de Device e é obrigado a fazer o metodo processDoc() pela heranca
* Nao existe reuso nesse metodo pois o metodo foi abstrato
* O metodo scan() tambem foi obrigado a ser executado pois implementa  interface Scanner
* O metodo print() tambem foi obrigado a ser executado pois implementa  interface Printer
*/

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}
}
