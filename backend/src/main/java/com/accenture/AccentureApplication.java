package com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccentureApplication {
	public static String input(int a){
		if (a == 2){
			return "A";
		}else if (a == 22){
			return "b";
		}else if (a == 222){
			return "c";
		}else if (a == 3 ){
			return "d";
		}else if (a == 33){
			return "e";
		}else if (a == 333){
			return "f";
		}else if (a == 4){
			return "g";
		}else if (a == 44){
			return "h";
		}else if (a == 444){
			return "i";
		}else if (a == 5){
			return "j";
		}else if (a == 55){
			return "k";
		}else if (a == 555){
			return "l";
		}else if (a == 6){
			return "m";
		}else if (a == 66){
			return "n";
		}else if (a == 666){
			return "o";
		}else if (a == 7){
			return "p";
		}else if (a == 77){
			return "q";
		}else if (a == 777){
			return "r";
		}else if (a == 7777){
			return "s";
		}else if (a == 8){
			return "t";
		}else if (a == 88){
			return "u";
		}else if( a == 888){
			return "v";
		}else if (a == 9){
			return "w";
		}else if (a == 99){
			return "x";
		}else if (a == 999){
			return "y";
		}else if (a == 9999){
			return "z";
		}else if (a == 0){
			return " ";
		} else {
			return "";
		}
	}

	public static int[] retorno(String s){
		String[] array;
		array = s.split(" ");
		int[] array2 = new int[array.length];
		for (int i = 0; i < array.length; i++){
			array2[i] = Integer.parseInt(array[i]);
		}
		return array2;
	}


	public static void main(String[] args) {
		SpringApplication.run(AccentureApplication.class, args);
	}

}
