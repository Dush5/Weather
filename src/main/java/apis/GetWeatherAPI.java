package apis;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.Constants;
import utils.Endpoints;

public class GetWeatherAPI extends BaseAPI {

    public static String GET_WEATHER_URI = Endpoints.BASE_URL + Endpoints.GET_WEATHER + Constants.LONDON;

    public Response getWeather()
    {
        response = RestAssured.given().log().all().when().get(GET_WEATHER_URI);
        Assert.assertEquals(response.statusCode(), 200);
        response.getBody().prettyPrint();
        return response;
    }
}
