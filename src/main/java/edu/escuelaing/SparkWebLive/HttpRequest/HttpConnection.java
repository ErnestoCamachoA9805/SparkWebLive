package edu.escuelaing.SparkWebLive.HttpRequest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * El codigo de pedir el objecto al framework esta basado en un trabajo de discucion con sebastian herrera hernandez
 */
public class HttpConnection implements HttpConectionInterface{
    
    private static final String Standard_URL = "https://www.alphavantage.co/query?function=%s&symbol=%s&apikey=Q80L1OEVTAWQTMHJ";
    private static final String IntraDay_URL = "https://www.alphavantage.co/query?function=%s&symbol=%s&interval=5min&apikey=Q80L1OEVTAWQTMHJ";
    /**
     * Function that returns the intraday movements of the actions  with a timeframe of 5 min
     * @param identificadorDeBolsa the name of the action based on the list from the framework
     * @return JSONObject the information recibed
     */
    @Override
    public JSONObject getIntraDay(String identificadorDeBolsa) {
        try {
            return new JSONObject(IOUtils.toString(new URL(String.format(IntraDay_URL,"TIME_SERIES_INTRADAY",identificadorDeBolsa)),Charset.forName("UTF-8")));
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject("{}");
    }

    /**
     * Functions that the returns a JSON object with the information of the movements of the action in the day
     * @param identificadorDeBolsa the name of the action based on the list from the framework
     * @return JSONObject the information recibed
     */
    @Override
    public JSONObject getDay(String identificadorDeBolsa) {
       try {
            return new JSONObject(IOUtils.toString(new URL(String.format(Standard_URL,"TIME_SERIES_DAILY",identificadorDeBolsa)),Charset.forName("UTF-8")));
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject("{}");
    }

    /**
     * Functions that the returns a JSON object with the information of the movements of the action in the week
     * @param identificadorDeBolsa the name of the action based on the list from the framework
     * @return JSONObject the information recibed
     */
    @Override
    public JSONObject getWeek(String identificadorDeBolsa) {
        try {
            return new JSONObject(IOUtils.toString(new URL(String.format(Standard_URL,"TIME_SERIES_WEEKLY",identificadorDeBolsa)),Charset.forName("UTF-8")));
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject("{}");
    }

    /**
     * Functions that the returns a JSON object with the information of the movements of the action in the Month
     * @param identificadorDeBolsa the name of the action based on the list from the framework
     * @return JSONObject the information recibed
     */
    @Override
    public JSONObject getMonth(String identificadorDeBolsa) {
        try {
            return new JSONObject(IOUtils.toString(new URL(String.format(Standard_URL,"TIME_SERIES_MONTHLY",identificadorDeBolsa)),Charset.forName("UTF-8")));
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject("{}");
    }

    @Override
    public JSONObject chooseFunction(String funtion, String identificadorDeBolsa){
        JSONObject value= null;
        switch(funtion){
            case "intraDay":
                value= getIntraDay(identificadorDeBolsa);
                break;
            case "day":
                value= getDay(identificadorDeBolsa);
                break;
            case "week":
                value= getWeek(identificadorDeBolsa);
                break;
            case "month":
                value= getMonth(identificadorDeBolsa);
                break;
        }
        return value;
    }

} 