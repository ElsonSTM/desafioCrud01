package com.desafioCrud01.crud.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafioCrud01.crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
