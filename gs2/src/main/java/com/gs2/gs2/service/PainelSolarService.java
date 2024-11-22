package com.gs2.gs2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.gs2.gs2.model.PainelSolar;
import com.gs2.gs2.repository.PainelSolarRepository;

@Service
public class PainelSolarService {

    @Autowired
    private PainelSolarRepository painelSolarRepository;

    public List<PainelSolar> list() {
        return painelSolarRepository.findAll();
    }

    public PainelSolar save(PainelSolar painelSolar) {
        return painelSolarRepository.save(painelSolar);
    }

    public boolean existsById(Long id) {
        return painelSolarRepository.existsById(id);
    }

    public void delete(Long id) {
        painelSolarRepository.deleteById(id);
    }

    public Optional<PainelSolar> findById(Long id) {
        return painelSolarRepository.findById(id);
    }
}
