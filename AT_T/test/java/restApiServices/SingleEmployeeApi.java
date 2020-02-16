package restApiServices;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleEmployeeApi {
    @Test()
    public void callSingleEmployeeResources() {
        Response response = RestAssured.get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/590cd847355229a408ba9d06");
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
        System.out.println("The Status Code is " + statusCode);
        System.out.println("Time of response is: " + response.getTime());
        System.out.println("*********************************************");
    }
    @Test()
    public void callSingleEmpResources() {
        Response response = RestAssured.get("http://info.venturepulse.org:8080/service-webapp/api/SingleEmployeeResources/590cd847355229a408ba9d06");
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 201 OK");
        Assert.assertEquals(statusCode, 201);
        System.out.println("Shows Employee but test failed(Default Suite) " + statusCode);
        System.out.println("Time of response is: " + response.getTime());
        System.out.println("*********************************************");
    }


}
