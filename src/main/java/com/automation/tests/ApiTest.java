import io.restassured.response.Response;
import org.testng.Assert;

public class ApiTest {

    public static void main(String[] args) {
        // Example of GET request
        Response getResponse = HttpHelper.get("/some-endpoint");
        Assert.assertEquals(getResponse.getStatusCode(), 200);
        
        // Example of POST request
        String jsonBody = "{\"name\":\"John\", \"age\":30}";
        Response postResponse = HttpHelper.post("/create-user", jsonBody);
        Assert.assertEquals(postResponse.getStatusCode(), 201);

        // Example of setting Authorization
        HttpHelper.setAuth("your-jwt-token");

        // Example of DELETE request
        Response deleteResponse = HttpHelper.delete("/delete-user/123");
        Assert.assertEquals(deleteResponse.getStatusCode(), 204);
    }
}