package client2;

import java.util.Scanner;
import javax.swing.*;
import Server.JournalEntries;

public class start {
	
	
	public static String UN;
	public static String PN;
	public static String PW;
	public static Boolean UserAndPasswordCorrect;
	public static Integer level;
	

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	

	JOptionPane.showMessageDialog(null, "Press OK for Login"); 
	PN = JOptionPane.showInputDialog( "Personalnumber");
	PW = JOptionPane.showInputDialog( "Password");	
	
UserAndPasswordCorrect= true;

	if( UserAndPasswordCorrect){
//if(PN.equals(staff.get.pNbr())){
	// if password is correct then:
//	 level = Staff.getLevel(PN);
	level = 4;
	
		if (level==1 /*GOV*/){
		
		}else if (level==2)/*DOC*/{
		
		}else if (level==3 /*NURSE*/){
			PN = JOptionPane.showInputDialog( "Searh for a patient by Personalnumber");
	if (true){
			//	if(PN.patient.isThreatedBy(CurrentUser.getPnbr())){
			//JOptionPane.showConfirmDialog(null,JournalEntries.getText() + "Press Yes to add entries");
		JOptionPane.showConfirmDialog(null,"Massa mamssa massa text and a bunch of entries yo "+ "\n" +"\n"+" Press Yes to add entries");
		}
		
		}else/*PATIENT*/{
		
			JOptionPane.showMessageDialog(null, "Journalen kommer here" /*JournalEntries.getText()*/);
		}
	
	}else{
	 JOptionPane.showMessageDialog(null, "User dosent exist. Try to login again"); 
	PN = JOptionPane.showInputDialog( "Personalnumber");
	PW = JOptionPane.showInputDialog( "Password");

	
 }}


	}