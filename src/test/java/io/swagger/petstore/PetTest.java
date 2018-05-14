package io.swagger.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.commons.lang3.RandomStringUtils;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Created by SK on 2018-05-13
 */
public class PetTest {
    String idTestValue = RandomStringUtils.randomNumeric(5);
    String testPetsName = "Pettt";
    //change from hmb

    @Test
    public void petApiTest() {
        RestAssured.given()
                .baseUri("http://petstore.swagger.io")
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "2233322")
                .body("{\n" +
                        " \"id\": " + idTestValue + ", \n " +
                        " \"name\": \"" + testPetsName + "\", \n" +
                        " \"photoUrls\": [],\n" +
                        " \"tags\": [],\n " +
                        " \"status\": \"pending\"\n" +
                        "}")
                .when().post()
                .then()
                .body("id", Matchers.equalTo(Integer.parseInt(idTestValue)));
                //.then().extract().response().prettyPrint();
    }
}
