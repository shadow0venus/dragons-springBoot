package co.edu.umanizales.dragon_1.service;

import  co.edu.umanizales.dragon_1.model.Creature;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CreatureService {
    private final List<Creature> creatures = new ArrayList<>();

    public void registerCreature(Creature creature) {
        creatures.add(creature);
    }

    public String invokePower(String name) {
        Optional<Creature> creature = creatures.stream().filter(c -> c.getName().equals(name)).findFirst();
        return creature.map(Creature::usePower).orElse("Creature not found.");
    }

    public List<Creature> listCreatures() {
        return creatures;
    }
}
