package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;




    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estate estate1 = new Estate("Cocoa Farm Delight", "Ghana");
        estateRepository.save(estate1);

        Chocolate chocolate1 = new Chocolate("Mars", 45, estate1);
        chocolateRepository.save(chocolate1);

        Chocolate chocolate2 = new Chocolate("Snickers", 40, estate1);
        chocolateRepository.save(chocolate2);

        Estate estate2 = new Estate("In Love With The Cocoa", "Ivory Coast");
        estateRepository.save(estate2);

        Chocolate chocolate3 = new Chocolate("Galaxy", 70, estate2);
        chocolateRepository.save(chocolate3);

        Chocolate chocolate4 = new Chocolate("Lindt", 85, estate2);
        chocolateRepository.save(chocolate4);
    }
}
