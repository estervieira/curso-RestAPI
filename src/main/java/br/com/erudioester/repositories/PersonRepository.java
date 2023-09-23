package br.com.erudioester.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudioester.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}