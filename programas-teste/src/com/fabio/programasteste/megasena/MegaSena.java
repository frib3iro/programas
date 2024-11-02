package com.fabio.programasteste.megasena;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    
    public static void main(String[] args) {
	
	Random rd = new Random();
	
	Scanner sc = new Scanner(System.in);
	
	int maxNumero = 20;
	int[] mega = new int[6];
	int[] jogo = new int[mega.length];
	int[] acertos = new int[mega.length];
	
	System.out.print("Digite seu jogo: ");
	for (int i = 0; i < mega.length; i++) {
	    mega[i] = rd.nextInt(maxNumero) + 1;
	    jogo[i] = rd.nextInt(maxNumero) + 1;
//	    jogo[i] = sc.nextInt();
	}
	
	for (int i = 0; i < mega.length; i++) {
	    for (int j = 0; j < mega.length; j++) {
		if (jogo[i] == mega[j]) {
		    acertos[i] = jogo[i];
		}
	    }
	}
	
	Arrays.sort(mega);
	Arrays.sort(jogo);
	Arrays.sort(acertos);
	
	System.out.println();
	
	System.out.print("Jogo --------> ");
	for (int aux : jogo) {
	    System.out.printf("%02d ", aux);
	}
	
	System.out.println();
	
	System.out.print("Sorteio -----> ");
	for (int aux : mega) {
	    System.out.printf("%02d ", aux);
	}
	
	System.out.println();
	
	System.out.print("Acertos -----> ");
	for (int aux : acertos) {
	    System.out.printf("%02d ", aux);
	}
	
	System.out.println();
	
	sc.close();
    }
}
