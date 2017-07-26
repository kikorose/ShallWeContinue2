package shallwecontinue2;

import java.util.Scanner;

public class ShallWeContinue {
	
public static void main(String[]args){
	
	Scanner input = new Scanner (System.in);
	boolean runProgram = true;
	do {
		System.out.println("Shall we continue (A) yes (B) no");
		String continueOn = input.nextLine();
		if (continueOn.equalsIgnoreCase("A")){
			//if pick A you will continue
		}else if(continueOn.equalsIgnoreCase("B")){
			// if you pick B you exit
			System.out.print("Come back again ");
			runProgram = false;
		}else {
			
			System.out.println("Choose A or B please");
		}
		
		
		
		
	}while(runProgram == true);
	
	System.out.println("***This is the end of the program ***");
	
}
}
