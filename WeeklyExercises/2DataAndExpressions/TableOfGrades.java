
public class TableOfGrades {

	public static void main(String[] args) {
		final String Sam = "Sam";
		final String Leo = "Leo";
		final String Rio = "Rio";
		final String Ben = "Ben";
		final String Rhys = "Rhys";
		
		int SAMlab, SAMbonus, LEOlab, LEObonus, RIOlab, RIObonus, BENlab, BENbonus, RHYSlab, RHYSbonus;
		SAMlab = 43;
		SAMbonus = 6;
		LEOlab = 55;
		LEObonus = 5;
		RIOlab = 49;
		RIObonus = 7;
		BENlab = 51;
		BENbonus = 4;
		RHYSlab = 47;
		RHYSbonus = 8;
		
		System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==          Student Points          ==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
		System.out.println("");
		System.out.println("");
		System.out.println("Name\t\tLab\tBonus\tTotal");
		System.out.println("----\t\t---\t-----\t-----");
		System.out.println(Sam + "\t\t" + SAMlab + "\t" +  SAMbonus + "\t" + (SAMlab + SAMbonus));
		System.out.println(Leo + "\t\t" + LEOlab + "\t" +  LEObonus + "\t" + (LEOlab + LEObonus));
		System.out.println(Rio + "\t\t" + RIOlab + "\t" +  RIObonus + "\t" + (RIOlab + RIObonus));
		System.out.println(Ben + "\t\t" + BENlab + "\t" +  BENbonus + "\t" + (BENlab + BENbonus));
		System.out.println(Rhys + "\t\t" + RHYSlab + "\t" +  RHYSbonus + "\t" + (RHYSlab + RHYSbonus));
	}

}
