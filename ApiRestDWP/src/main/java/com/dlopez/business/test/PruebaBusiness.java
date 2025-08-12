package com.dlopez.business.test;

import java.io.Serializable;

public class PruebaBusiness implements Serializable {

	private static final long serialVersionUID = -7119673164485126150L;

	private Integer id;
	private String description;

	public PruebaBusiness() {
		super();
	}

	public PruebaBusiness(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PruebaBusiness [id=" + id + ", description=" + description + "]";
	}
}