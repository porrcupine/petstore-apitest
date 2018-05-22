package io.swagger.petstore;

import assertions.models.pet.PetModelAssert;
import controllers.pet.PetController;
import models.pet.PetModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by SK on 2018-05-14
 */
public class PetObjectTest {
    @Test
    public void addNewPetToStoreTest() {
        int idTestPetValue = RandomUtils.nextInt(0, 900);
        String nameTestPetValue = RandomStringUtils.randomAlphabetic(5);
        PetModel testPetModel = new PetModel(2556467, "PETO", "AVAILABLE", null, null, null);
        PetModel petResponse = new PetController(testPetModel).addNewPet();

        System.out.println(petResponse.getId());
        Assert.assertTrue(petResponse != null,"Test failed");
    }

    @Test
    public void updatePetTest() {
        String nameTestPetValue = RandomStringUtils.randomAlphabetic(5);
        PetModel testPetModel = new PetModel(2556467, "skPet", "UNAVAILABLE", null, null, null);
        PetModel petResponse = new PetController(testPetModel).updatePet();
        PetModelAssert.assertThat(petResponse).isSameAs(testPetModel);
    }



}
