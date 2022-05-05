package com.florian.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordEntity {

	@JsonProperty(value = "fields")
	private FieldsEbtity fields;
	

	public FieldsEbtity getFields() {
		return fields;
	}

	public void setFields(FieldsEbtity fields) {
		this.fields = fields;
	}
	
	
}
