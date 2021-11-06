package catFacts_API;

import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

public class getOneRandomFact {

    @Test(description = "Ensure request return a cat fact as text")
    public void getFact(){
       Response response = RestAssured.given().
                when().get("https://cat-fact.herokuapp.com/facts/random")
                .then().
                assertThat().body("text",Matchers.not(Matchers.emptyOrNullString())).extract().response();
        Allure.addAttachment("Response Body", response.jsonPath().prettify());


    }
}
