package com.example.spring2;

import com.example.spring2.entities.TestFunzioni;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Spring2ApplicationTests {

	@Test
	void sommaTraDueNumeri() {
		System.out.println("Test 1.");
		int result = TestFunzioni.somma(10,3);
		assertEquals(13, result);
	}

	@ParameterizedTest
	@CsvSource({"10,3,13","2,3,5","20,8,28"})
	void parameterizedTest(int a, int b, int risultato){
		System.out.println("Parameterized Test somma numeri");
		int result = TestFunzioni.somma(a,b);
		assertEquals(risultato, result);

	}

	@Test
	void sommaNUmeriArray(){
		System.out.println("Test 2");
		int result = TestFunzioni.sommaArray(new int[]{10,15,20});
		assertEquals(45,result);

	}
	

}
