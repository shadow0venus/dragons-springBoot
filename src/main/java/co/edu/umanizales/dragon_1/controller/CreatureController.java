package co.edu.umanizales.dragon_1.controller;

import co.edu.umanizales.dragon_1.model.*;
import co.edu.umanizales.dragon_1.service.CreatureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/criaturas")
public class CreatureController {
    private final CreatureService creatureService;

    public CreatureController(CreatureService creatureService) {
        this.creatureService = creatureService;
    }

    @PostMapping("/dragon")
    public void registerDragon(@RequestBody Dragon dragon) {
        creatureService.registerCreature(dragon);
    }

    @PostMapping("/fenix")
    public void registerFenix(@RequestBody Fenix fenix) {
        creatureService.registerCreature(fenix);
    }

    @PostMapping("/chimera")
    public void registerChimera(@RequestBody Chimera chimera) {
        creatureService.registerCreature(chimera);
    }

    @GetMapping("/{name}/poder")
    public String getPower(@PathVariable String name) {
        return creatureService.invokePower(name);
    }

    @GetMapping
    public List<Creature> listCreatures() {
        return creatureService.listCreatures();
    }
}
