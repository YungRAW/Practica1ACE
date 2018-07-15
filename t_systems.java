package javaapplication_practica;

public class t_systems {

	private int Id;
	private String SystemName;
	private String SystemDescription;
	private int SystemScore;

	public void setID(int value) {
		this.Id = value;
	}

	public void setSsytemName(String value) {
		this.SystemName = value;
	}

	public void setSystemDescription(String value) {
		this.SystemDescription = value;
	}

	public void setSystemDescription(int value) {
		this.SystemScore = value;
	}

	public int getID() {
		return this.Id;
	}

	public String getSystemName() {
		return this.SystemName;
	}

	public String getSystemDescription() {
		return this.SystemDescription;
	}

	public int getSystemScore() {
		return this.SystemScore;
	}

	public void setAll(int value, String value1, String value2, int value3) {
		this.Id = value;
		this.SystemName = value1;
		this.SystemDescription = value2;
		this.SystemScore = value3;
	}
}
