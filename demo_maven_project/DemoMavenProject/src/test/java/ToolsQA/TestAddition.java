package ToolsQA;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestAddition {
	
	
	
	@BeforeAll
	 static void m1(){
		System.out.println("@BeforeAll executed");
	}

	@Mock
	private AdditionService ser;

	@Test
	@DisplayName("Mockito")
	public void testAddition() {

		AdditionService service=mock(AdditionService.class);

		Addition obj = new Addition(service);
		Addition obj2 = new Addition(ser);

		when(service.addition(10, 20)).thenReturn(30);

		assertEquals(30, obj.addition(10, 20));
		
		

		when(ser.addition(10, 20)).thenReturn(30);

		assertEquals(30, obj2.addition(10, 20));

	}
}
