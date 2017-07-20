package br.com.diegotonzi.camelfile.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

	@XmlElement(name = "name")
	private String name;

	@XmlElement(name = "age")
	private Integer age;

	@XmlElement(name = "address")
	private Address address;

}
