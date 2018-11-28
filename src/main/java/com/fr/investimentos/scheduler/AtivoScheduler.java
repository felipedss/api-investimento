package com.fr.investimentos.scheduler;

import com.fr.investimentos.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AtivoScheduler {

    @Autowired
    private Repository repository;

    @Scheduled(fixedDelay = 15000)
    public void ativoTask() {
        //TODO Implementar
    }


}
