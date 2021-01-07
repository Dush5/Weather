package apis;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.Constants;
import utils.Endpoints;

public class GetWeatherByEarthIDAPI extends BaseAPI {

    public static String GET_WEATHER_BY_EARTH_ID_URI = Endpoints.BASE_URL + Endpoints.GET_WEATHER_BY_EARTH_ID;

   public Response getWeatherByEarthID(Integer earthId)
   {

       response = RestAssured.given().log().all().when().get(GET_WEATHER_BY_EARTH_ID_URI+earthId);
       Assert.assertEquals(response.statusCode(),200);
       response.getBody().prettyPrint();
       return  response;
   }





}
