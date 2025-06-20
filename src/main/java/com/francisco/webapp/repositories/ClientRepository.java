package com.francisco.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francisco.webapp.models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    public Client findByEmail(String email);

}
