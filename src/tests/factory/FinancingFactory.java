package tests.factory;

import entities.Financing;

public class FinancingFactory {
	
	
	
	public static Financing invalidConstructor() {
		return new Financing(100000.0,2000.0,20);
	}
}
