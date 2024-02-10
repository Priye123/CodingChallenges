package API;

import static io.restassured.RestAssured.*;

import com.google.gson.JsonArray;
import io.restassured.http.Header;
import io.restassured.http.Headers;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;


public class AutomateAPI {

    @Test
    void b() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("username", "admin");
        map.put("password", "password12344");

        //System.out.println(map);
        String url = "https://restful-booker.herokuapp.com/auth";

        Response res =
                given()
                        .contentType(ContentType.JSON)
                        .body(map)
                        .when()
                        .post(url)
                        //.then().extract().response();
                        .then()
                        .assertThat()
                        .body("reason", Matchers.equalTo("Bad cdentials"))
                        .statusCode(Matchers.equalTo(200))
                        .extract().response();
        System.out.println(res.asPrettyString());

    }


    @Test
    void a() {
        Response res =
                given()
                        .header("Content-Ty", "application/js")
                        .header("Accept-Enco", "gzip, deflate, br")
                        .when()
                        .get("https://reqres.in/api/users/2");
        System.out.println(res.header("Reporting-Endpoints"));

//        Headers headers = res.headers();
//        for (Header header : headers) {
//            System.out.println(header.getName() + "-->" + header.getValue());
//        }
    }

    @Test(enabled = false)
    void tc1() {
        String s = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        Response res =
                given()
                        //.contentType(ContentType.JSON)
                        .header("Content-Type", "application/json")
                        .body(s)
                        .when()
                        .post("https://reqres.in/api/users");
        //.then().log().body();

        System.out.println(res.asPrettyString());

        JSONObject jo = new JSONObject(res.asPrettyString());
        System.out.println("The io is::" + jo.getString("id"));
    }

    @Test
    void tc2() {
        String s = "{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"MainId\": 1111,\n" +
                "            \"firstName\": \"Sherlock\",\n" +
                "            \"lastName\": \"Homes\",\n" +
                "            \"categories\": [\n" +
                "                {\n" +
                "                    \"CategoryID\": 1,\n" +
                "                    \"CategoryName\": \"Example\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"CategoryID\": 1,\n" +
                "                    \"CategoryName\": \"Example3\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"MainId\": 122,\n" +
                "            \"firstName\": \"James\",\n" +
                "            \"lastName\": \"Watson\",\n" +
                "            \"categories\": [\n" +
                "                {\n" +
                "                    \"CategoryID\": 2,\n" +
                "                    \"CategoryName\": \"Example2\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"messages\": [], \n" +
                "    \"success\": true\n" +
                "}";

//        JSONObject jo = new JSONObject(s);
//        JSONArray ja = jo.getJSONArray("data");
//        int sum = 0;
//        for (int i = 0; i < ja.length(); i++) {
//            sum += ja.getJSONObject(i).getInt("MainId");
//        }
//        System.out.println(sum);

        JSONObject jo = new JSONObject(s);
        JSONArray ja = jo.getJSONArray("data");
        for (int i = 0; i < ja.length(); i++) {
            JSONArray cateogories = ja.getJSONObject(i).getJSONArray("categories");
            for (int j = 0; j < cateogories.length(); j++) {
                System.out.println(ja.getJSONObject(i).getJSONArray("categories").getJSONObject(j).getString("CategoryName"));
            }
        }
    }


}
