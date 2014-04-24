import java.io.Serializable;

public class Analyzes extends Organs implements Serializable{
	
		private String AnalyzOrganName;
		private String AnalyzBlood;
		private String AnalyzMinPrice;
		private String AnalyzMaxPrice;
		public String getAnalyzOrganName() {
			return AnalyzOrganName;
		}
		public void setAnalyzOrganName(String analyzOrganName) {
			AnalyzOrganName = analyzOrganName;
		}
		public String getAnalyzMinPrice() {
			return AnalyzMinPrice;
		}
		public String setAnalyzMinPrice(String analyzMinPrice) {
			return AnalyzMinPrice = analyzMinPrice;
		}
		public String getAnalyzMaxPrice() {
			return AnalyzMaxPrice;
		}
		public String setAnalyzMaxPrice(String analyzMaxPrice) {
			return AnalyzMaxPrice = analyzMaxPrice;
		}
		public String getAnalyzBlood() {
			return AnalyzBlood;
		}
		public void setAnalyzBlood(String analyzBlood) {
			AnalyzBlood = analyzBlood;
		}

	}
