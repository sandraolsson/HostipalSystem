package client2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import javax.swing.*;

import java.io.*;
import java.net.*;
import java.security.KeyStore;

import javax.net.*;
import javax.net.ssl.*;
import javax.security.cert.X509Certificate;
import javax.swing.JFileChooser;

public class start {
	
	
	public static String UN;
	public static String DV;
	public static String Name;
	public static String PN;
	public static String PW;
	public static Boolean UserAndPasswordCorrect;
	public static Integer level;
	public static String Entry;
	public static String nurse;
	

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	

	JOptionPane.showMessageDialog(null, "Press OK for Login"); 
	
//PN = JOptionPane.showInputDialog( "Personalnumber");
	
	JFileChooser fc = new JFileChooser();
	File F = new File("/Users");
	File NameDir, NamePath;
	int Checker;
	fc.setCurrentDirectory(F);
	Checker= fc.showOpenDialog(null);
	fc.setDialogTitle("Choose Truststore to use");
	if(Checker == JFileChooser.APPROVE_OPTION){
		NameDir = fc.getCurrentDirectory();
		NamePath = fc.getSelectedFile();
		
		PW = JOptionPane.showInputDialog( "Passward");
		String Path2 = NamePath.getAbsolutePath();
		System.out.println(Path2);
		String Path3 = Path2.replaceFirst("truststore", "keystore");
		System.out.println(Path3);
		if( PW == Path3){
			
		}
	}
	
//	JFileChooser fc = new JFileChooser();
//	fc.setDialogTitle("Choose Keystore to use");
//	int returnVal = fc.showOpenDialog(null);
//	File keystore = fc.getSelectedFile();
//	String path = keystore.getAbsolutePath();
//	System.out.println("Choosen path for KeyStore = " + path);

//	ks.load(new FileInputStream(path), password);
	
	
//	File truststore = fc.getSelectedFile();
	// 
	
	
	//PW = JOptionPane.showInputDialog( "Password");	
	
UserAndPasswordCorrect= true;

	if( UserAndPasswordCorrect){

//	 level = Staff.getLevel(PN);
	level = 2;
	
		if (level==1 /*GOV*/){
			
			 
			PN = JOptionPane.showInputDialog( "What patient do you want to delete? Personalnumber");			
			String toSend = "del:"+PN;
			UIManager.put("OptionPane.yesButtonText", "Delete new patient");
			UIManager.put("OptionPane.cancelButtonText", "Sign out");
			int knapp = JOptionPane.showConfirmDialog(null,"You have now succesfully deleted the patient");
			PN = JOptionPane.showInputDialog( "You have now succesfully deleted the patient \n \n What patient do you want to delete? Personalnumber");
			
		
		}else if (level==2)/*DOC*/{
			int knapp = 1;
			int knapp2 = 1;
			while ( knapp == 1 || knapp == 0){
				
			
			UIManager.put("OptionPane.yesButtonText", "Create/add Patient");
			UIManager.put("OptionPane.noButtonText", "Show Patient");
			UIManager.put("OptionPane.cancelButtonText", "Sign out");

			knapp = JOptionPane.showConfirmDialog(null,"Welcome! ");
			
			if(knapp == 0){ // Create patient
				
				UIManager.put("OptionPane.yesButtonText", "create new Patient");
				UIManager.put("OptionPane.noButtonText", "Add Entry");
				knapp2 = JOptionPane.showConfirmDialog(null,"Nice: ");
				if (knapp2 == 0){
					Name = JOptionPane.showInputDialog( "Name of patient");	
					PN = JOptionPane.showInputDialog( "Personal number");	
					DV = JOptionPane.showInputDialog( "Devision");	
					String toSend ="add:" + PN +":"+ Name +":"+ DV;
					
					JOptionPane.showMessageDialog(null,"You patient has been added ");
				}else if(knapp2 == 1){ // Add entry
				
					PN = JOptionPane.showInputDialog( "Searh for a patient by Personalnumber");	
					
					Entry = JOptionPane.showInputDialog( "Write Entry ");	
					Entry = "Entry"+"\n"+Name;
					nurse = JOptionPane.showInputDialog( "Add Nurse, Pesonal number:");
					String toSend ="njr:" +PN+ ":Entry:"+nurse;
					JOptionPane.showMessageDialog(null,"Your Entry has been updated"  /*String Entry from server */ );
					
				}
				
			}else if(knapp == 1){ // Show Patient 
				String toGet = "get:"+PN;
				JOptionPane.showMessageDialog(null, "Journalen kommer here" /*JournalEntries.getText()*/);
			}
			
			}
		}else if (level==3 /*NURSE*/){
			PN = JOptionPane.showInputDialog( "Searh for a patient by Personalnumber");
	if (true){
	
			//	if(PN.patient.isThreatedBy(CurrentUser.getPnbr())){
			//JOptionPane.showConfirmDialog(null,JournalEntries.getText() + "Press Yes to add entries");
	
		UIManager.put("OptionPane.noButtonText", "Add Entry to Patient");
		UIManager.put("OptionPane.yesButtonText", "Search for new Patient");
		UIManager.put("OptionPane.cancelButtonText", "Sign out");
	int knapp = JOptionPane.showConfirmDialog(null,/*String Entry from server */ "\t Entries \n \n Broke his leg. \n Doctor JAmes fixed it all. \n \n Fell down from a balcony, brok his nose.\n Doctor James fixed it again. \n \n Got hit by a car. Almost dead. \n Doctor Svensson is working his as of to fix it ");
		
	if (knapp == 1){//Add entry
		Entry = JOptionPane.showInputDialog( "Write Entry ");	
		Entry = "Entry"+"\n"+Name;
		nurse = JOptionPane.showInputDialog( "Nurse:");
		String toSend ="njr:" + PN+ ":Entry";
		knapp = JOptionPane.showConfirmDialog(null,"Your Entry has been updated"  /*String Entry from server */ );
		
	}
		} 
	
	
		}else/*PATIENT*/{
	String toGet ="get:" + PN;
			JOptionPane.showMessageDialog(null, "Journalen kommer here" /*JournalEntries.getText()*/);
		}
	
	}else{
	 JOptionPane.showMessageDialog(null, "User dosent exist. Try to login again"); 
	PN = JOptionPane.showInputDialog( "Personalnumber");
	PW = JOptionPane.showInputDialog( "Password");

	
 }}


	}