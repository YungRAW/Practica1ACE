package javaapplication_practica;

public class t_nume {

	private int Id;
	private String Nume;
	private String Prenume;

	public void setID(int value) {
		this.Id = value;
	}

	public void setNume(String value) {
		this.Nume = value;
	}

	public void setPrenume(String value) {
		this.Prenume = value;
	}

	public int getID() {
		return this.Id;
	}

	public String getNume() {
		return this.Nume;
	}

	public String getPrenume() {
		return this.Prenume;
	}

	public void setAll(int value, String value1, String value2) {
		this.Id = value;
		this.Nume = value1;
		this.Prenume = value2;
	}
}
