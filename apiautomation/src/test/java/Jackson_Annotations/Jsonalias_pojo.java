package Jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Jsonalias_pojo {
	
	private String name;
	@JsonAlias({"employeeid","ID","Id"})
	private int id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
