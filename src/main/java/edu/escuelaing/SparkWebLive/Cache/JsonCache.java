package edu.escuelaing.SparkWebLive.Cache;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonCache implements CacheInterface{
    private HashMap<String,JSONObject> requests= new HashMap<String,JSONObject>();

    /**
     * Checks if the value is already in the map
     * @param key
     */
    @Override
    public boolean contais(String key) {
        return requests.containsKey(key);
    }

    /**
     * Gets the JSON from the specified key if there is some key associated 
     * @param key - the key of the object
     * @return JSONObject
     */
    @Override
    public JSONObject getValue(String key) {
        return (JSONObject) requests.get(key);
    }

    /**
     * Adds the JSONObject to the chache 
     * @param key
     * @param newValue
     */
    @Override
    public void addValue(String key, JSONObject newValue) {
        if(!requests.containsKey(key)){
            requests.put(key, newValue);
        }
    }

    /**
     * Deletes the entry from the chache
     * @param key
     */
    @Override
    public void deleteValue(String key) {
        if(requests.containsKey(key)){
            requests.remove(key);
        }
    }

    /**
     * Updates the entry from the cache
     * @param key
     * @param newValue
     */
    @Override
    public void updateValue(String key, JSONObject newValue) {
        if(requests.containsKey(key)){
            requests.replace(key, newValue);
        }
    }

    /**
     * Gets the current requests
     * @return
     */
    public HashMap<String,JSONObject> getRequests() {
        return this.requests;
    }

    /**
     * Sets a new map of values 
     * @param requests
     */
    public void setRequests(HashMap<String,JSONObject> requests) {
        this.requests = requests;
    }
}
