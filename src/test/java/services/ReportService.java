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

public class ReportService extends CommonService {

    public void generateAverageSalesPerMonthReport(String token){
        LogUtility.infoLog("STEP 2: GENERATE REPORT");
        RequestSpecification request = RestAssured.given();
        request.header("Authorization", "Bearer " + token);

        Response response = performRequest(RequestMethodType.REQUEST_GET,request, EndpointType.REPORT_AVERAGE_SALES);
        LogUtility.infoLog(response.getStatusLine());
        LogUtility.infoLog(response.getBody().asPrettyString());
        Assert.assertEquals(response.getStatusCode(), RequestStatusType.RESPONSE_OK);
    }
}
