package tutorial.springframework.mypetclinic.services;

import tutorial.springframework.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
