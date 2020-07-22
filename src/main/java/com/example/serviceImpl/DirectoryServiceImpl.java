package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.Directory;
import com.example.repository.DirectoryRepository;
import com.example.service.DirectoryService;

@Service
public class DirectoryServiceImpl implements DirectoryService {

	@Autowired
	private DirectoryRepository directoryRepository;
	
	@Override
	public List<Directory> getContactList() {
		
		return directoryRepository.findAll();
		
	}

	@Override
	public void saveContact(Directory contact) {
		
		directoryRepository.save(contact);
		
	}

	@Override
	public void deleteById(int directoryId) {
		
		directoryRepository.deleteById(directoryId);
		
	}

	@Override
	public void editContact(Directory contact) {
		
		directoryRepository.save(contact).getId();
	}
	
	@Override
	public Optional<Directory> getDirectoryById(int directoryId) {
		return directoryRepository.findById(directoryId);
	}
}
