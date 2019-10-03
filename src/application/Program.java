package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;
import devices.Device;

/* Programa para observar que nao existe reuso de codigo e nao e possivel fazer heranca multipla em java nesse caso
 */

public class Program {

	public static void main(String[] args) {
		
		//Instanciando a classe mais especifica
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		System.out.println();
		
		//Instanciando pela classe abstrata mesmo ela nao tendo a implementacao do metodo que a interface exigia
		Device d = new ConcretePrinter("1000");
		d.processDoc("My Letter");
		((ConcretePrinter)d).print("My Letter Bla Bla Bla");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
		
		System.out.println();
		//Instanciando pela classe abstrata mesmo ela nao tendo a implementacao que as duas interfaces exigem
		Device cd = new ComboDevice("1000");
		//O fato de device ter o metodo processDoc nao faz necessario o downcast
		cd.processDoc("My Letter Bla Bla Bla");
		((ComboDevice)cd).print("My Letter Bla Bla Bla");
		System.out.println("Scan result: " + ((ComboDevice)cd).scan() + " Bla Bla Bla");
	}
}
