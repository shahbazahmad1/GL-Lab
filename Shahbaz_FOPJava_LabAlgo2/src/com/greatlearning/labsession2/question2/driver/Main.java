package com.greatlearning.labsession2.question2.driver;
import java.util.Scanner;
import com.greatlearning.labsession2.question2.service.*;

public class Main
{
	public static void main (String [] args)
	{
		MergeSort ms = new MergeSort();
		NotesCount nc = new NotesCount();

		System.out.println("enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] notes = new int [size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++)
		{
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		ms.sort(notes, 0, notes.length-1);
		nc.notesCountImplementation(notes, amount);
		sc.close();
	}
}
