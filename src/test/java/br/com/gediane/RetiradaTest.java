package br.com.gediane;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RetiradaTest {

	@Test
	public void RetiradaTest() {
		Retirada  retirada  = new Retirada();
		
		retirada.Retirar();
		
		assertEquals(16,retirada.getProduto1());
	}

}
