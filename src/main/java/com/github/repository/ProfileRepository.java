package com.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {

}
