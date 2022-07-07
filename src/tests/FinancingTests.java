package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShoulCreateObjectWhenValidData() {
		
		Financing financing = new Financing(100000.0,2000.0,80);
		
		Assertions.assertEquals(100000, financing.getTotalAmount());
		Assertions.assertEquals(2000, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}
	
	@Test
	public void constructorShouldThrowExceptionWhenInvalidData() {
		Assert.assertThrows(IllegalArgumentException.class, ()->{
			@SuppressWarnings("unused")
			Financing financing = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateTotalAmountWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		financing.setTotalAmount(90000.0);
		Assertions.assertEquals(90000, financing.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setTotalAmount(200000.0);
		});
		
	}
	
	@Test
	public void setIncomeShouldUpdateIncomeWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		financing.setIncome(4000.0);
		Assertions.assertEquals(4000, financing.getIncome());
	}
	
	@Test
	public void setncomedThrowExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setIncome(1000.0);
		});
		
	}
	
	@Test
	public void setMonthsShouldUpdateMonthsWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		financing.setMonths(100);
		Assertions.assertEquals(100, financing.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowExeptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setMonths(70);
		});
		
	}
	@Test
	public void entryShouldReturnEntryValue() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double entryValue = financing.entry();
		Assertions.assertTrue(20000 == entryValue);
	}
	
	@Test
	public void quotaShoundReturnQuotaValue() {
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double quotaValue = financing.quota();
		Assertions.assertTrue(1000 == quotaValue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
