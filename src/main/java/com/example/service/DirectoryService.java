package com.example.service;

import java.util.List;

import com.example.model.Directory;

public interface DirectoryService {
	
	public List<Directory> getContactList();

	public int saveContact(Directory contact);

}
