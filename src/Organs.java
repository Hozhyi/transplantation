import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import java.io.Serializable;
public class Organs implements Serializable  {
	
	
	private String name;
	private String Blood;
	public String getBlood() {
		return Blood;
	}
	public void setBlood(String blood) {
		Blood = blood;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	
	
}
