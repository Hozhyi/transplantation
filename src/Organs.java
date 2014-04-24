import java.io.Serializable;


import java.util.Comparator;

import javax.swing.JOptionPane;



public class Organs implements Serializable {

	
	
        private String OrganId;
		private String OrganName;
		private String OrganPrice;
		private String OrganBlood;

		public String getOrganBlood() {
			return OrganBlood;
		}

		public void setOrganBlood(String organBlood) {
			OrganBlood = organBlood;
		}

		public String getOrganName() {
			return OrganName;
		}

		public void setOrganName(String organName) {
			OrganName = organName;
		}

		public String getOrganPrice() {
			return OrganPrice;
		}

		public String setOrganPrice(String organPrice) {
			return OrganPrice = organPrice;
		}

		

		public String getOrganId() {
			return OrganId;
		}

		public String setOrganId(String organId) {
			return OrganId = organId;
		}



		public static class SortByPrice implements Comparator<Organs> {
			 
			public int compare(Organs o1, Organs o2) {
				return Integer.parseInt(o2.getOrganPrice()) - Integer.parseInt(o1.getOrganPrice());
			}
	 
		}
	
		
	}



