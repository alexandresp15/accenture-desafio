package com.accenture.resources;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.entities.KeyboardCell;

@RestController
@RequestMapping(value = "/keyboards")
public class KeyboardResource {

	@GetMapping()
	public ResponseEntity<Map<Integer, String>> findByAll() {
		Map<Integer, String> keyMap = new HashMap<>();

		keyMap.put(2, "a");
		keyMap.put(22, "b");
		keyMap.put(222, "c");
		keyMap.put(2222, "A"); 
		keyMap.put(3, "d");
		keyMap.put(33, "e");
		keyMap.put(333, "f");
		keyMap.put(4, "g");
		keyMap.put(44, "h");
		keyMap.put(444, "i");
		keyMap.put(5, "j");
		keyMap.put(55, "k");
		keyMap.put(555, "l");
		keyMap.put(6, "m");
		keyMap.put(66, "n");
		keyMap.put(666, "o");
		keyMap.put(7, "p");
		keyMap.put(77, "q");
		keyMap.put(777, "r");
		keyMap.put(7777, "s");
		keyMap.put(8, "t");
		keyMap.put(88, "u");
		keyMap.put(888, "v");
		keyMap.put(9, "w");
		keyMap.put(99, "x");
		keyMap.put(999, "y");
		keyMap.put(9999, "z"); 
		
		return ResponseEntity.ok().body(keyMap);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<KeyboardCell> findById(@PathVariable Integer id) { 
		KeyboardCell newKey = new KeyboardCell(findByAll().getBody().get(id));
		return ResponseEntity.ok().body(newKey);
	} 	

}
