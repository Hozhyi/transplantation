import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Patient {

  /*  public Vector  myQueue of organs;
    public Vector  myQueue of organs;
    public Vector  myOperations;*/
	
private static ArrayList<Organs> organs = new ArrayList<Organs>();
private static ArrayList<Analyzes> analyzes = new ArrayList<Analyzes>();
	
	
	@SuppressWarnings("unchecked")
	public static void main (String args[]){
		System.out.println("Органи які є в наявності:");
		organs = (ArrayList<Organs>) deserData("organs");
		
		/*Organs organ = new Organs();
	
		organ.setName(JOptionPane.showInputDialog(null,"Введіть орган"));
		organ.setBlood(JOptionPane.showInputDialog(null, "Введіть групу крові"));
		organs.add(organ);*/
	    int i=0;
		for (Organs p: organs)
			{   i++;
				System.out.println(i + " "+ p.getName() +" "+ p.getBlood());
			}
		 
		
		serData("organs",organs);
		System.out.println("Дані пацієнта:");
		analyzes = (ArrayList<Analyzes>) deserData("analyzes");
		/*Analyzes analyz = new Analyzes();
		
		analyz.setOrganAnalyzes(JOptionPane.showInputDialog(null,"Введіть необхідний орган"));
		analyz.setBloodAnalyzes(JOptionPane.showInputDialog(null, "Введите групу крові пацієнта"));
	    analyzes.add(analyz);*/
		int k=0;
		for (Analyzes m: analyzes)
			{    
				System.out.println( " "+ m.getOrganAnalyzes() +" "+ m.getBloodAnalyzes());
			}
	serData("analyzes",analyzes);
	}


	
	
	private static void serData(String file_name, Object obj) {
		try {
			FileOutputStream fileOut = new FileOutputStream(file_name + ".txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			fileOut.close();
			out.close();
			
			}
		catch (FileNotFoundException e) {
			System.out.println("Файл не найден1");
			System.exit(1);
		
   		} catch (IOException e) {
	System.out.println("Ошибка ввода");
	System.exit(2);		
	}
	}
	
	private static Object deserData(String file_name) {
		Object retObject = null;
	    try {
			FileInputStream fileIn = new FileInputStream(file_name + ".txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			try {
				retObject = in.readObject();
			} catch (ClassNotFoundException e) {
				System.out.println("Класс не найден");
				System.exit(3);
			}
			fileIn.close();
			in.close();
			
			}
		catch (FileNotFoundException e) {
			System.out.println("Файл не найден");
			System.exit(1);
		
   		} catch (IOException e) {
	System.out.println("Ошибка вывода");
	System.exit(2);		
	}
	return retObject ;	
	} 
}