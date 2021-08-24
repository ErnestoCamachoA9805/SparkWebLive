package edu.escuelaing.SparkWebLive.HttpRequest;

import org.json.JSONObject;

public interface HttpConectionInterface {

    public JSONObject getIntraDay(String identificadorDeBolsa);

    public JSONObject getDay(String identificadorDeBolsa);

    public JSONObject getWeek(String identificadorDeBolsa);

    public JSONObject getMonth(String identificadorDeBolsa);

    public JSONObject chooseFunction(String function, String identificadorDeBolsa);
}
