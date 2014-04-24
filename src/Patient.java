import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Patient {
	private static ArrayList<Organs> organs = new ArrayList<Organs>();
	private static ArrayList<Analyzes> analyzes = new ArrayList<Analyzes>();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		System.out.println("Available organs:");
		organs = (ArrayList<Organs>) deserData("organs");
		
		   /* Organs  organ = new Organs();
		    Integer.parseInt(organ.setOrganId(JOptionPane.showInputDialog(null, "����� ������ ")));
	    	organ.setOrganName(JOptionPane.showInputDialog(null, "������ ����� "));
			organ.setOrganBlood(JOptionPane.showInputDialog(null, "������ ����� ����"));
			Integer.parseInt(organ.setOrganPrice(JOptionPane.showInputDialog(null,"������ ����")));
			
			organs.add(organ);	 */
			int i=0;
			for (Organs p : organs) {
				i++;
				System.out.println(p.getOrganId()+". " + p.getOrganName()+" "+p.getOrganBlood() + " "+ p.getOrganPrice());
				
				
			}

			serData("organs",organs);
			
		System.out.println("Analyses of patient:");
			analyzes = (ArrayList<Analyzes>) deserData("analyzes");
		
		   /*  Analyzes analyz = new Analyzes();	 
	    	analyz.setAnalyzOrganName(JOptionPane.showInputDialog(null, "������ ���������� ��� �������� ����� "));
	    	analyz.setAnalyzBlood(JOptionPane.showInputDialog(null, "������ ����� ���� ��������"));
	    	Integer.parseInt(analyz.setAnalyzMinPrice(JOptionPane.showInputDialog(null, "������ �������� ���� ������")));
	    	Integer.parseInt(analyz.setAnalyzMaxPrice(JOptionPane.showInputDialog(null, "������ ����������� ���� ������")));
	    	
	    	analyzes.add(analyz);*/

			for (Analyzes m : analyzes) {
			
				System.out.println(m.getAnalyzOrganName()+" "+m.getAnalyzBlood() + " "+ m.getAnalyzMinPrice()+" " + m.getAnalyzMaxPrice());
				}
		     
			System.out.println("��� �������� ������� ��� ������:");
			Collections.sort(organs, new Organs.SortByPrice());
			goodOrgans();
			
		   // serData("analyzes",analyzes);
			
			
			
			
	}

	
	
	private static Object deserData(String file_name) {
		 Object retObject=null;
		try {
			
			FileInputStream fileIn = new FileInputStream (file_name + ".txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			try {
				retObject = in.readObject();
			} catch (ClassNotFoundException e) {
				System.out.println("����� �� ������");
			}
			fileIn.close();
			in.close();
			} 
		catch (FileNotFoundException e) {
			
			System.out.println("���� �� ������");
			System.exit(1);
		}
		catch (IOException e) {
		
			System.out.println("������ �����/������");
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
			
			System.out.println("���� �� ������");
			System.exit(1);
		}
		catch (IOException e) {
			
			System.out.println("������ �����/������");
			System.exit(2);
		}
	}
	
	public static void goodOrgans()
	{
		int k=0, i=0,  y=0;
		
		Scanner sc = new Scanner(System.in);
		for(Analyzes m : analyzes)
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
										
										/*System.out.println("������ ����� ��������� ������");
										y=sc.nextInt();
										
										if(Integer.parseInt(p.getOrganId())==y)
										{
											System.out.println(p.getOrganId() + p.getOrganName()+" "+p.getOrganBlood() + " "+ p.getOrganPrice());
										}	*/
										
										
									}
								}
						}		
				}
			
			
			
				if (k==0)
					{
						System.out.println("���� ������� ������. �������� ���������� � �����");
					}	
				
				
				
			
			}
		
		
		
		
		
	}
	

 
	

}