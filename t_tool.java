package javaapplication_practica;

public class t_tool {

	private int Id;
	private String ToolName;
	private String ToolDescription;
	private int ToolScore;

	public void setID(int value) {
		this.Id = value;
	}

	public void setToolName(String value) {
		this.ToolName = value;
	}

	public void setToolDescription(String value) {
		this.ToolDescription = value;
	}

	public void setToolScore(int value) {
		this.ToolScore = value;
	}

	public int getID() {
		return this.Id;
	}

	public String getToolName() {
		return this.ToolName;
	}

	public String getToolDescription() {
		return this.ToolDescription;
	}

	public int getToolScore() {
		return this.ToolScore;
	}

	public void setAll(int value, String value1, String value2, int value3) {
		this.Id = value;
		this.ToolName = value1;
		this.ToolDescription = value2;
		this.ToolScore = value3;
	}
}
