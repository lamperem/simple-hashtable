package com.example;

public class Example {
	
	static HashTable htable;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = "int suma = 0;suma = 54 + 20;";
		String cadena2 = "suma = 54 + 20;";
		int posicionInicial = 0;
		String tokenNuevo = "";
		
		htable = new HashTable();
		
		getToken(posicionInicial, cadena1, cadena1.length() );
		
		htable.viewHashTable();
		
		//System.out.println("token: " + tokenNuevo );
		
		//System.out.println( cadena1.substring(4,cadena1.length()) );
		

	}
	
	public static void getToken(int posicionInicial, String cadena, int tam) {
		String token = "";
		String nuevaCadena = cadena.substring( posicionInicial, cadena.length() );
		char[] arrayCadena = nuevaCadena.toCharArray();
		
		System.out.println("NUEVA CADENA: " + nuevaCadena);
		
		int posicionFinal = posicionInicial;
		
		for (char caracter : arrayCadena) {
			if(caracter != ' ') {
				token = token + caracter;	
				posicionFinal++;
				
				if(caracter == '0') {
					System.out.println("TOKEN: " + token + " - POSICION_FINAL: " + posicionFinal);
					htable.setValues(posicionFinal+"-"+token.length(), token);
					break;
				}
				
				if(caracter == ';') {
					System.out.println("TOKEN: " + token + " - POSICION_FINAL: " + posicionFinal);
					htable.setValues(posicionFinal+"-"+token.length(), token);
					break;
				}
				
			}else {
				System.out.println("TOKEN: " + token + " - POSICION_FINAL: " + posicionFinal);
				htable.setValues(posicionFinal+"-"+token.length(), token);
				break;
			}			
			
		}
		
		System.out.println("posicion final: " + (posicionFinal + 1) + " - tamanio: " + tam);
		
		if(posicionFinal+1 < tam ) {
			getToken(posicionFinal+1, cadena, tam);
		}else {
			if(posicionFinal+1 == tam ) {
				getToken(posicionFinal, cadena, tam);
			}
			
		}
		
	}

}
