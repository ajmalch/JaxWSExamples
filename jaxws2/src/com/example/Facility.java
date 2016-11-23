package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="facility")
public class Facility {

    Facility()
    {
        ID = 0;
        Name="Test Facility";
        Type="OutPatient";
    }

    
    private int     ID;
    @XmlElement(name="name", required=true)
    private String     Name;
    @XmlElement(name="type", required=true)
    private String     Type;
	
    @XmlElement(name="id", required=true)
    public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
    
    
}
