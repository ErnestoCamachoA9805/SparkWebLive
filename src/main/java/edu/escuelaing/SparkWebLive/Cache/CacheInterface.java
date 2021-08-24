package edu.escuelaing.SparkWebLive.Cache;

import org.json.JSONObject;

public interface CacheInterface {
    public boolean contais(String key);

    public JSONObject getValue(String key);

    public void addValue(String key, JSONObject newValue);

    public void deleteValue(String key);

    public void updateValue(String key, JSONObject newValue);
}
