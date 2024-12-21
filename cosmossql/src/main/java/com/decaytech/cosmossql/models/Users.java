package com.decaytech.cosmossql.models;

import com.azure.spring.data.cosmos.core.mapping.Container;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	@Id
	private String id;
	@NotNull
	@PartitionKey
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String address;

	public Users(String id,String firstname, String lastname, String address) {
		this.firstName=firstname;
		this.lastName=lastname;
		this.address=address;
		this.id=id;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}