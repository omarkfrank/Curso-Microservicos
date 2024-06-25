package com.mark.mscurso.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.mscurso.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
