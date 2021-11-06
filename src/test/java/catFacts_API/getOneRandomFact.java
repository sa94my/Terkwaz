package catFacts_API;

import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;


public class getOneRandomFact {
    String baseUrl="https://cat-fact.herokuapp.com/facts";
    String randomEndPoint ="/random";
    @Test(description = "Ensure request return a cat fact as text")
    public void validateTextNotEmpty(){
       Response response = RestAssured.given().
                when().get(baseUrl+randomEndPoint)
                .then().
                assertThat().body("text",Matchers.not(Matchers.emptyOrNullString())).extract().response();
        Allure.addAttachment("Response Body", response.jsonPath().prettify());


    }
}
