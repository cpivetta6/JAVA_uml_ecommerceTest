package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import com.caiopivetta6.domain.enums.ClientType;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "client_tb")
public class Client implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String cpfCnpj;
	private Integer clientType;
	
	
	@JsonManagedReference
	@OneToMany(mappedBy = "client")
	private List<Address> address = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name = "phone")
	private Set<String> phone = new HashSet<>();
	
	@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>();
	
	
	public Client() {
		
	}
	
	public Client(Integer id, String name, String cpfCnpj, ClientType clientType) {
		super();
		this.id = id;
		this.name = name;
		this.cpfCnpj = cpfCnpj;
		this.clientType = clientType.getCode();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpfCnpj() {
		return cpfCnpj;
	}


	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	
	
	public ClientType getClientType() {
		return ClientType.ToEnum(clientType);
	}


	public void setClientType(ClientType clientType) {
		this.clientType = clientType.getCode();
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	public Set<String> getPhone() {
		return phone;
	}


	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
}
