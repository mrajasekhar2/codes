package com.adhishta.syam.brightfuture.AsyncTask;

import org.json.JSONException;

//response listner
public interface ResponseListner {
	public abstract void serverResponse(String response, String path) throws JSONException, Exception;
}
