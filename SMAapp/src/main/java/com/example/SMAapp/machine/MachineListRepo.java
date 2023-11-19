package com.example.SMAapp.machine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MachineListRepo extends JpaRepository<Machine, Long> {
    Optional<Machine> findByInventNum(Long inventNum);
    Optional<Machine> findById(Long id);
    void deleteById(Long id);
    void deleteByInventNum(Long inventNum);
}
