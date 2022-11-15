package com.tecsup.petclinic.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author jgomezm
 *
 */
@Entity(name = "pets")
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@Column(name = "type_id")
	private int typeId;
	@Column(name = "owner_id")
	private int ownerId;
	@Column(name = "birth_date")
	private Date birth_date;

	public Pet() {
	}

	public Pet(long id, String name, int type_id, int owner_id) {
		super();
		this.id = id;
		this.name = name;
		this.typeId = type_id;
		this.ownerId = owner_id;
	}

	public Pet(String name, int type_id, int owner_id) {
		super();
		this.name = name;
		this.typeId = type_id;
		this.ownerId = owner_id;
	}


	public Pet(String name, int typeId, int ownerId, Date birth_date) {
		this.name = name;
		this.typeId = typeId;
		this.ownerId = ownerId;
		this.birth_date = birth_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int type_id) {
		this.typeId = type_id;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int owner_id) {
		this.ownerId = owner_id;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", typeId=" + typeId + ", ownerId=" + ownerId + ", birth_date="
				+ birth_date + "]";
	}

	public void setBirthDate(Date birthDate) {
		this.birth_date = birthDate;
	}
}
