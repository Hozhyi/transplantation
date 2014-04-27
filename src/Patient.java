import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Patient extends JFrame  {
	
	private static ArrayList<Organs> organs = new ArrayList<Organs>();
	private static ArrayList<Analyzes> analyzes = new ArrayList<Analyzes>();
	private static ArrayList<Patient> patients = new ArrayList<Patient>();

	
	private String PatientId;
	private String PatientName;
	private String PatientSurname;
	
	private static String surName;

	@SuppressWarnings("unchecked")
	public static  void Organs() 
	{		int i=0;
			System.out.println("List of patients");
			patients = (ArrayList<Patient>) deserData("patients");
		  
		   /*Patient  patients1 = new Patient();
		    Integer.parseInt(patients1.setPatientId(JOptionPane.showInputDialog(null, "¬вед≥ть номер пац≥Їнта ")));
	    	patients1.setPatientName(JOptionPane.showInputDialog(null, "¬вед≥ть ≤м'€ пац≥Їнта "));
			patients1.setPatientSurname(JOptionPane.showInputDialog(null, "¬вед≥ть ѕр≥звище пац≥Їнта"));
			patients.add(patients1);	*/ 
			
			for (Patient p : patients ) 
				{
					System.out.println(p.getPatientId()+". " + p.getPatientName()+" "+p.getPatientSurname() );			
				}
		  
			//serData("patients",patients);
			
			 System.out.println("Choose your patient , enter Surname in textfield(Enter correct data, because you will be must enter it again)");
			 Scanner sc = new Scanner(System.in);
			 analyzes = (ArrayList<Analyzes>) deserData("analyzes");
		
			 do
			 {
				 i=0;
				 surName=sc.nextLine();
				for (Patient p:patients)
			 	{
			 			for (Analyzes k: analyzes)
			 			{
			 					if (surName.equals(p.getPatientSurname()) && k.getAnalyzOrganPatientSurname().equals(p.getPatientSurname()) ) 
			 					 {
			 						System.out.println(k.getAnalyzOrganPatientSurname() +  " " + k.getAnalyzOrganName() + " " + k.getAnalyzBlood() + " " + k.getAnalyzMinPrice() + " " + k.getAnalyzMaxPrice());
			 						i++;
			 					 }
			 					
			 			}
			 			
			 		
			 	} 
				
			 } while (i==0)	; 	
			 
			System.out.println("Available organs:");
			System.out.println("Id   Organ Blood  Price HLA");
			organs = (ArrayList<Organs>) deserData("organs");
		
		    /*Organs  organ = new Organs();
		    Integer.parseInt(organ.setOrganId(JOptionPane.showInputDialog(null, "Ќомер органу ")));
	    	organ.setOrganName(JOptionPane.showInputDialog(null, "¬вед≥ть орган "));
			organ.setOrganBlood(JOptionPane.showInputDialog(null, "¬вед≥ть групу кров≥"));
			Integer.parseInt(organ.setOrganPrice(JOptionPane.showInputDialog(null,"¬вед≥ть ц≥ну")));
			Integer.parseInt(organ.setOrganHLA(JOptionPane.showInputDialog(null,"¬вед≥ть HLA")));
			organs.add(organ);	*/
		
			for (Organs p : organs) 
				{
					System.out.println(p.getOrganId()+".   " + p.getOrganName()+" "+p.getOrganBlood() + "   "+ p.getOrganPrice() + "    " + p.getOrganHLA());	
				}

			 //serData("organs",organs);
		
			analyzes = (ArrayList<Analyzes>) deserData("analyzes");
		
			/*Analyzes analyz = new Analyzes();	 
		    analyz.setAnalyzOrganPatientSurname(JOptionPane.showInputDialog(null, "¬вед≥ть пр≥звище пац≥Їнта"));
	    	analyz.setAnalyzOrganName(JOptionPane.showInputDialog(null, "¬вед≥ть необх≥дний дл€ пац≥Їнта орган "));
	    	analyz.setAnalyzBlood(JOptionPane.showInputDialog(null, "¬вед≥ть групу кров≥ пац≥Їнта"));
	    	Integer.parseInt(analyz.setAnalyzMinPrice(JOptionPane.showInputDialog(null, "¬вед≥ть м≥н≥мальну ц≥ну органа")));
	    	Integer.parseInt(analyz.setAnalyzMaxPrice(JOptionPane.showInputDialog(null, "¬вед≥ть максимальну ц≥ну органа")));
	
	    	analyzes.add(analyz);
			
			 serData("analyzes",analyzes);*/
		    
			System.out.println("Organs for a patient:");
			
			//Collections.sort(organs, new Organs.SortByPrice());
			goodOrgans();
}

	
	private static Object deserData(String file_name) {
		 Object retObject=null;
		try {
			
			FileInputStream fileIn = new FileInputStream (file_name + ".txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			try {
				retObject = in.readObject();
			} catch (ClassNotFoundException e) {
				System.out.println("Class not found");
			}
			fileIn.close();
			in.close();
			} 
		catch (FileNotFoundException e) {
			
			System.out.println("File not found");
			System.exit(1);
		}
		catch (IOException e) {
		
			System.out.println("Errors input/output");
			System.exit(2);
		}
		return retObject;
	}
	

	@SuppressWarnings("unused")
	private static void serData(String file_name, Object obj) {

		try {
		
			FileOutputStream fileOut = new FileOutputStream (file_name + ".txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			fileOut.close();
			out.close();
			} 
		catch (FileNotFoundException e) {
			
			System.out.println("File not found");
			System.exit(1);
		}
		catch (IOException e) {
			
			System.out.println("Errors input/output");
			System.exit(2);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void goodOrgans() 
	{
		int i = 0, id=0;
	
		System.out.println("Enter Organ ID (Enter 0 if you didn't like(not find) your organ) ");
		Scanner sc = new Scanner(System.in);
		
		do { 
			try{
				id=sc.nextInt();	
				} catch (InputMismatchException e){
						System.out.println("Enter correct data"); 
						break;
						}
					
						if (id == 0) {
							System.out.println("Patient in queue for his organ");  
									i=0;
									for (Patient p:patients)
										{
											for (Analyzes k: analyzes)
												{
													if (surName.equals(p.getPatientSurname()) && k.getAnalyzOrganPatientSurname().equals(p.getPatientSurname()) ) 
														{
															System.out.println(k.getAnalyzOrganPatientSurname() +  " " + k.getAnalyzOrganName() + " " + k.getAnalyzBlood() + " " + k.getAnalyzMinPrice() + " " + k.getAnalyzMaxPrice());
	 						
															try {
																ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("queuepatients.txt"));
																out.writeObject(k.getAnalyzOrganPatientSurname());
																out.writeObject(k.getAnalyzOrganName());
																out.writeObject(k.getAnalyzBlood());
																out.writeObject(k.getAnalyzMinPrice());
																out.writeObject(k.getAnalyzMaxPrice());
																out.close();
																} catch (FileNotFoundException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																} catch (IOException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
															i++;
														}
	 					
												}
	 			
	 		
										}
								}
						
						for (Analyzes m : analyzes)
							{
								for (Organs p : organs) 
									{ 
										if(Integer.parseInt(p.getOrganId())==id)
											{   
												if((m.getAnalyzOrganName().equals(p.getOrganName()) &&  (surName.equals(m.getAnalyzOrganPatientSurname()))))
													{  																	 
													 	System.out.println(p.getOrganId()+ ". " + p.getOrganName()+" "+p.getOrganBlood() + " "+ p.getOrganPrice() + " " + p.getOrganHLA());
															try {
															ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("queueorgans.txt"));
															out.writeObject(p.getOrganName());
															out.writeObject(p.getOrganBlood());
															out.writeObject(p.getOrganPrice());
															out.writeObject(p.getOrganHLA());
															out.close();
															} catch (FileNotFoundException e) {
																// TODO Auto-generated catch block
																e.printStackTrace();
															} catch (IOException e) {
																// TODO Auto-generated catch block
																e.printStackTrace();
															}
																i++;  
													}
														
														
											}
											
											   
								}
						}
								
						
		} while (i==0);
		
	}

	

	public static void Error() 
	{ 
		
	}
	
	

	public String getPatientId() {
		return PatientId;
	}


	public String setPatientId(String patientId) {
		return PatientId = patientId;
	}


	public String getPatientName() {
		return PatientName;
	}


	public void setPatientName(String patientName) {
		PatientName = patientName;
	}


	public String getPatientSurname() {
		return PatientSurname;
	}


	public void setPatientSurname(String patientSurname) {
		PatientSurname = patientSurname;
	}

	
		
		/*for(Analyzes m : analyzes)
			{ 
			for(Organs p : organs)
				{
				if (Integer.parseInt(m.getAnalyzMinPrice()) <= Integer.parseInt(p.getOrganPrice()) && (Integer.parseInt(p.getOrganPrice())<=Integer.parseInt(m.getAnalyzMaxPrice())) )
						{  
							if (p.getOrganBlood().equals("4(-)") || (p.getOrganBlood().equals("4(+)") || (m.getAnalyzBlood().equals(p.getOrganBlood()) ) ) ) 
								{
									if (p.getOrganName().equals(m.getAnalyzOrganName()))
									{  
										i++; 
										System.out.println(p.getOrganId()+ ". " + p.getOrganName()+" "+p.getOrganBlood() + " "+ p.getOrganPrice());
										k++;
										
										/*System.out.println("¬вед≥ть номер вибраного органу");
										y=sc.nextInt();
										
										if(Integer.parseInt(p.getOrganId())==y)
										{
											System.out.println(p.getOrganId() + p.getOrganName()+" "+p.getOrganBlood() + " "+ p.getOrganPrice());
										}	
										
										
									}
								}
						}		
				}
			
			
			
				if (k==0)
					{
						System.out.println("ЌемаЇ жодного органа. ѕац≥Їнта переведено в чергу");
					}				
			}*/
		

}