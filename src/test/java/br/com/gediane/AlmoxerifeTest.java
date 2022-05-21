package br.com.gediane;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class AlmoxerifeTest {
    
	@Test
	public void AlmoxerifeTest() {
		Almoxerife  almoxerife1 = new Almoxerife();
		
		almoxerife1.Almoxerife();
		
		assertEquals("Carlos",almoxerife1.getName());
	}

}
