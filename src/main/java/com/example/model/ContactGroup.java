package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "t_group")

public class ContactGroup {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "GROUPNAME")
	private String groupname;
	
	@OneToMany(mappedBy = "contactGroup")
	private List<Directory> contactList;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Directory> getContactList() {
		return contactList;
	}

	public void setContactList(List<Directory> contactList) {
		this.contactList = contactList;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	
	
}
