package edu.escuelaing.SparkWebLive;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

import edu.escuelaing.SparkWebLive.Cache.*;
import edu.escuelaing.SparkWebLive.HttpRequest.*;

import java.io.IOException;
import org.json.JSONObject;

public class SparkWebApp {

    private static HttpConectionInterface httpConectionInterface= new HttpConnection();
    private static CacheInterface cache= new JsonCache();
    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        staticFiles.location("/public");
        port(getPort());
        get("/results", (req, res) -> resultsPage(req, res));
        get("/facade", (req,res) -> facadePage(req, res));
    }

    private static JSONObject facadePage(Request req, Response res) throws IOException {
        res.type("application/json");
        String funcion= req.queryParams("function");
        String empresa= req.queryParams("empresa");
        String key= funcion + empresa;
        if(cache.contais(key)){
            return cache.getValue(key);
        }else{
            JSONObject currentRequest= httpConectionInterface.chooseFunction(funcion,empresa);
            cache.addValue(key, currentRequest);
            return currentRequest;
        }
    }

    private static String resultsPage(Request req, Response res) {
        return req.queryParams("firstname") + " " +
                req.queryParams("lastname");
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
