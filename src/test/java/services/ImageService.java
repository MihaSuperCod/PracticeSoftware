package services;

import client.RestClient;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import types.EndpointType;
import types.RequestMethodType;
import types.RequestStatusType;
import utils.LogUtility;

public class ImageService extends CommonService {
    public void obtainAllImages(){
        LogUtility.infoLog("STEP 1: GET ALL IMAGES REQUEST");
        RequestSpecification request = RestAssured.given();

        Response response = performRequest(RequestMethodType.REQUEST_GET,request, EndpointType.IMAGE_GET_ALL_IMAGES);
        LogUtility.infoLog(response.getStatusLine());
        LogUtility.infoLog(response.getBody().asPrettyString());
        Assert.assertEquals(response.getStatusCode(), RequestStatusType.RESPONSE_OK);
    }
}
