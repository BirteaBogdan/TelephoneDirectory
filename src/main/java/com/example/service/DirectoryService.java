package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Directory;

public interface DirectoryService {
	
	public List<Directory> getContactList();

	public void saveContact(Directory contact);

	public void deleteById(int directoryId);
	
	public void editContact(Directory contact);
	
	public Optional<Directory> getDirectoryById(int directoryId);

}
