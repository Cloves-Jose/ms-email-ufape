package com.ms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
