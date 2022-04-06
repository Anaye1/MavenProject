import static org.junit.Assert.*;

import org.junit.Test;

import com.calc.craft.Claculator;

import junit.framework.Assert;

public class CalculatorTest {
	
		 Claculator c =new Claculator();
		
	
@Test
public void increamentTest() {
	
	Assert.assertEquals(5,c.increament(4));
}
@Test
public void additionTest() {
	Assert.assertEquals(16,c.addition(8,8));
}

}
