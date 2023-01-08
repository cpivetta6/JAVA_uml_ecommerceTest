package com.caiopivetta6;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.Address;
import com.caiopivetta6.domain.Category;
import com.caiopivetta6.domain.City;
import com.caiopivetta6.domain.Client;
import com.caiopivetta6.domain.Product;
import com.caiopivetta6.domain.State;
import com.caiopivetta6.domain.enums.ClientType;
import com.caiopivetta6.repositories.AddressRepository;
import com.caiopivetta6.repositories.CategoryRepository;
import com.caiopivetta6.repositories.CityRepository;
import com.caiopivetta6.repositories.ClientRepository;
import com.caiopivetta6.repositories.ProductRepository;
import com.caiopivetta6.repositories.StateRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
	
		//PRODUCT AND CATEGORY
		Category cat1 = new Category(null, "Informatic");
		Category cat2 = new Category(null, "Office");
		
		Product p1 = new Product(null, "Computer", 2000);
		Product p2 = new Product(null, "Printer", 200);
		Product p3 = new Product(null, "Mouse", 20);
		
		cat1.getProducts().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProducts().addAll(Arrays.asList(p2,p3));
		
		p1.getCategories().add(cat1);
		p2.getCategories().add(cat2);
		p3.getCategories().add(cat2);
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2));
		productRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		//CITY AND STATE
		
		State st1 = new State(null, "Veneto");
		State st2 = new State(null, "Lombardia");
		
		City city1 = new City(null, "Verona", st1);
		City city2 = new City(null, "Milano", st2);
		City city3 = new City(null, "Padova", st1);
		
		st1.getCity().addAll(Arrays.asList(city1, city3));
		st2.getCity().addAll(Arrays.asList(city2));
		
		stateRepository.saveAll(Arrays.asList(st1,st2));
		cityRepository.saveAll(Arrays.asList(city1,city2,city3));
		
		//CLIENT AND ADDRESS
		
		Client cl1 = new Client(null, "Bob Clif", "1245132412", ClientType.PHYSICAL_PERSON);
		
		Address a1 = new Address(null, "Via Masini", "Piazza Bra", "47b", "323142", cl1, city1);
		
		cl1.getAddress().add(a1);
		cl1.getPhone().add("3925119194");
		
		clientRepository.save(cl1);
		addressRepository.save(a1);
		
		
		
		
	}
	
	
}
