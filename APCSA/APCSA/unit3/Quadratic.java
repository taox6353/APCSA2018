//THIS IS A WIP!! ERRORS ARE EXPECTED. DO NOT REMOVE THIS LABEL UNTIL THIS PROGRAM WORKS!!

package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		float qA = quadA;
		float qB = quadB;
		float qC = quadC;
 	}

	public void calcRoots( )
	{
		rootone = -qB + (Math.sqrt(Math.pow(qB,2)-4*qA*qC))/2*qA; //thisisnew
		roottwo = -qB - (Math.sqrt(Math.pow(qB,2)-4*qA*qC))/2*qA; //thisisnew
	}

	public void print( )
	{
		System.out.println("rootone :: "+(String.format("%.2f",rootone)));
		System.out.println("roottwo :: "+(String.format("%.2f",roottwo)));
	}
}
