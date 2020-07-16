package com.example.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Directory;
import com.example.service.DirectoryService;

@Service
public class DirectoryServiceImpl implements DirectoryService {

	@Override
	public List<Directory> getNumbers() {
		
		List<Directory> contacts = new ArrayList<Directory>();
		contacts.add(new Directory(1, "Andrei", "Popescu", "0711111111", "Str.Cocorului, Nr.23","popescu.andrei@yahoo.com"));
		contacts.add(new Directory(2, "Andreea", "Georgescu", "0755555555", "Str.Dorului, Nr.33","georgescu.andreea@yahoo.com"));
		contacts.add(new Directory(3, "Ion", "Ionescu", "0722222222", "Str.Norului, Nr.12", "ionescu.ion@yahoo.com"));
		contacts.add(new Directory(4, "Cristian", "Ionescu", "0733333333", "Str.Lunga, Nr.6", "ionescu.cristian@yahoo.com"));

		return contacts;
	}

	@Override
	public int saveNumbers(Directory number) {
		System.out.println("Hello from saveNumbers");
		int x = 5;
		return x;
	}

}
