package steps;

import apis.GetWeatherAPI;
import apis.GetWeatherByEarthIDAPI;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.ArrayList;

public class WeatherValidationStep {

    Response response;
    public static String earth_ID,min_temp, max_temp;
    ArrayList<Integer> earth_ID1 ;

    GetWeatherAPI getWeatherAPI = new GetWeatherAPI();
    GetWeatherByEarthIDAPI getWeatherByEarthIDAPI = new GetWeatherByEarthIDAPI();

    @Given("^City location is given$")
    public void city_location_is_given()
    {
    }

    @When("^I fetch the weather temp by city name$")
    public void i_fetch_the_weather_temp_by_city_name()
    {
        response = getWeatherAPI.getWeather();
        response.then().log().all();
        earth_ID = response.jsonPath().getString("woeid");
        earth_ID1 = response.path("woeid");
        System.out.println(earth_ID1.get(0));

    }

    @Then("^I should get the Earth_Id$")
    public void i_should_get_the_Earth_Id()
    {

    }

    @When("^I fetch weather temp by Earth_id$")
    public void i_fetch_weather_temp_by_Earth_id()
    {

        response = getWeatherByEarthIDAPI.getWeatherByEarthID(earth_ID1.get(0));
        response.then().log().all();


    }

    @Then("^I should get the min_temp and max_temp$")
    public void I_should_get_the_min_temp_and_max_temp()
    {
    }





}
