import java.io.Serializable;

public class Message implements Serializable{
	public String type;
	public String priority;
	public String division;

	public String getType(){
		return type;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getPriority(){
		return priority;
	}

	public void setPriority(String priority){
		this.priority = priority;
	}

	public String getDivision(){
		return division;
	}

	public void setDivision(String division){
		this.division = division;
	}
}