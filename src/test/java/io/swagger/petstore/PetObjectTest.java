package io.swagger.petstore;

import controllers.PetController;
import models.PetModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.Test;

/**
 * Created by SK on 2018-05-14
 */
public class PetObjectTest {
    @Test
    public void addNewPetToStoreTest() {
        int idTestPetValue = RandomUtils.nextInt(0, 900);
        String nameTestPetValue = RandomStringUtils.randomAlphabetic(5);
        PetModel testPetModel = new PetModel(idTestPetValue, nameTestPetValue, "AVAILABLE", null, null, null);
        PetModel pet = new PetController(testPetModel).addNewPet();
        System.out.println(pet);
    }
}
