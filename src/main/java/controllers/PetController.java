package controllers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import models.PetModel;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

/**
 * Created by SK on 2018-05-14
 */
public class PetController {
    private RequestSpecification requestSpecification;
    private PetModel pet;
    private final String HEADER_NAME = "api_key";
    private final String HEADER_VALUE = "2233322";
    private final String BASE_URI = "http://petstore.swagger.io";
    private final String BASE_PATH = "/v2/pet";


    public PetController(PetModel pet) {
        requestSpecification = new RequestSpecBuilder()
                .addHeader(HEADER_NAME, HEADER_VALUE)
                .setBaseUri(BASE_URI)
                .setBasePath(BASE_PATH)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
        RestAssured.defaultParser = Parser.JSON;
        this.pet = pet;
    }

    public PetModel addNewPet() {
        return given()
                .body(pet)
                .when()
                .post()
                .as(PetModel.class);
    }
}
