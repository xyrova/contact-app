package com.lochan.contactapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lochan.contactapi.model.Contact;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
    @SuppressWarnings("null")
    Optional<Contact> findById(String id);
}