package com.gs2.gs2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gs2.gs2.model.PainelSolar;

import java.util.List;

@Repository
public interface PainelSolarRepository extends JpaRepository<PainelSolar, Long> {
    <T> List<T> findAllByNome(String nome, Class<T> type);
}
