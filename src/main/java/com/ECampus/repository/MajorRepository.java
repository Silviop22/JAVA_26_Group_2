package com.ECampus.repository;

import com.ECampus.model.Major;
import com.ECampus.model.ui.MajorEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MajorRepository extends JpaRepository<Major, Long> {

    Optional<Major> existingMajor(MajorEnum majorName, int studentQuota);


}
