package studenti;

public class Student {
int Id;
String Ime;
int Godini;
public int getId() {
	return Id;
}
public void setId(int Id){
	this.Id = Id;
}
	public String getIme(String Ime) {
		return this.Ime=Ime;
	}
		public int getGodini(){
			return Godini;
		}
			public int setGodini(int godini) {
				return this.Godini=Godini;
		}
			public void setIme(String string) {
				
			}

	public static void main(String[]args) {
		Student marko = new Student();
		marko.setId(1);
		marko.setIme("Marko");
		marko.setGodini(18);
		System.out.println("Reden broj" +marko.getId()+ "e studentot" + marko.getId()+ "star" + marko.getGodini()+"godini");
		

    }
}