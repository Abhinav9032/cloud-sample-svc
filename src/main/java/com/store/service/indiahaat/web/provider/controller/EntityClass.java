package com.store.service.indiahaat.web.provider.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="new_table")
public class EntityClass {
	
	  @Id
	  @Column(name = "obj_id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long objId;

	  @Column(name = "name")
	  private String name;

	  public EntityClass() {
		  
	  }
	  
	public EntityClass(Long objId, String name) {
		this.objId = objId;
		this.name = name;
	}



	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EntityClass [objId=" + objId + ", name=" + name + "]";
	}
	  
	  
	  

}
