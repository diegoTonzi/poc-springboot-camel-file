package br.com.diegotonzi.camelfile.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

	@XmlElement(name = "street")
	private String street;

	@XmlElement(name = "number")
	private String number;

	@XmlElement(name = "city")
	private String city;

	@XmlElement(name = "state")
	private String state;

}
