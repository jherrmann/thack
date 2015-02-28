package de.thack.test;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

public class User {

	@JsonIgnore
	private int age = 29;
	
    @JsonProperty("messages")
	private List<String> messagesee = new ArrayList<String>() {
		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};

	private String name = "mkyong";



	// getter and setter methods

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", " + "messages="
				+ messagesee + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMessagesee() {
		return messagesee;
	}

	public void setMessagesee(List<String> messagesee) {
		this.messagesee = messagesee;
	}



}