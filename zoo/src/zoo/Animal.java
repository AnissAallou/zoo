package zoo;

public class Animal {
	public String race;
	public String surnom;
	public String sexe;
	public int numTatouage; 
	public Animal pacs = null;
	
	public Animal(String race, String surnom, String sexe, int numTatouage) {
		super();
		this.race = race;
		this.surnom = surnom;
		this.sexe = sexe;
		this.numTatouage = numTatouage;
		
	}
	
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}




	public String getSurnom() {
		return surnom;
	}




	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}




	public String getSexe() {
		return sexe;
	}




	public void setSexe(String sexe) {
		this.sexe = sexe;
	}




	public int getNumTatouage() {
		return numTatouage;
	}




	public void setNumTatouage(int numTatouage) {
		this.numTatouage = numTatouage;
	}

	public Animal getPacs() {
		return pacs;
	}
	
	
	public void setPacs(Animal pacs) {
		
		if(this.sexe == "H") {
			
			
			if(this.sexe != pacs.sexe ) {
				if(this.race.equals(pacs.race)){
					if(this.getPacs() == null) {
						this.pacs = pacs;
					}
					else {
						System.out.println("Déjà casé");
					}
				}else {
					System.out.println(" Impossible, un " + this.race + " ne peut pas s'accoupler avec un " + pacs.getRace());
				}
				
			} else {
				System.out.println("Pas d'homosexualité");
			}
		}else {
			System.out.println("info pas renseignée pour l'animal");
		}
		
	}

	
	public String toString() {
		return "Race " + race + "\nSurnom " + surnom + "\nSexe " + sexe + "\nNuméro de tatouage " + numTatouage
			+ " se marie avec \n" + pacs.getSurnom() + "\nRace " + pacs.getRace()+ "\nSexe " 
			 + pacs.getSexe() + "\nNuméro de tatouage " + pacs.getNumTatouage();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Nabil = new Animal("chat","Nabil","H",1994);
		Animal Nabilla = new Animal("chat","Nabilla","F",1998);
		
		// mariage entre
		Nabil.setPacs(Nabilla);

		System.out.println(Nabil.toString());
	}
	
	

}
