package com.fabio.programasteste.color;

public class ColorArrayANSI {

    public static final String ANSI_GREEN = "\u001B[32m";  // Verde ANSI
    public static final String ANSI_RED = "\u001B[31m";    // Vermelho ANSI
    public static final String RESET = "\u001B[0m";        // Resetar cor

    public static void main(String[] args) {
	int[] numeros = {19, 20, 25, 31, 38, 43};

	for (int num : numeros) {
	    if (num % 2 == 0) {
		System.out.print(ANSI_GREEN + num + " " + RESET);
	    } else {
		System.out.print(ANSI_RED + num + " " + RESET);
	    }
	}
	System.out.println();
    }
}
