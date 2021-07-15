package dev.jair.bogo.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jair.bogo.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
