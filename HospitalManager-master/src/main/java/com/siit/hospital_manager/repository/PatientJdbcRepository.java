package com.siit.hospital_manager.repository;

import com.siit.hospital_manager.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Patient> findAll() {
        String query = "SELECT * FROM patients";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Patient.class));
    }
}
