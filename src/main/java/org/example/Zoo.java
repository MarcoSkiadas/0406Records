package org.example;

import java.util.List;

public record Zoo(List<Animal> animal) {

    public String totalFoodRequirement(){
        return "Food requirement for this Day: "+animal.stream().mapToInt(animal -> animal.species().foodPerGramPerDay()).sum()+"g";
    }
}
