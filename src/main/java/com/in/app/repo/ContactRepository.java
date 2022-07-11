package com.in.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.app.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {


}
