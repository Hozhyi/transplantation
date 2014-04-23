import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



import javax.swing.JOptionPane;

public class Analyzes extends Organs {
    
	private String OrganAnalyzes;
	private String BloodAnalyzes;
	private String MinPrice;
	private String MaxPrice;
	public String getOrganAnalyzes() {
		return OrganAnalyzes;
	}
	public void setOrganAnalyzes(String organAnalyzes) {
		OrganAnalyzes = organAnalyzes;
	}
	public String getBloodAnalyzes() {
		return BloodAnalyzes;
	}
	public void setBloodAnalyzes(String bloodAnalyzes) {
		BloodAnalyzes = bloodAnalyzes;
	}
	public String getMinPrice() {
		return MinPrice;
	}
	public void setMinPrice(String minPrice) {
		MinPrice = minPrice;
	}
	public String getMaxPrice() {
		return MaxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		MaxPrice = maxPrice;
	}
	

}
