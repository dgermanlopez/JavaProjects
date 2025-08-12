package com.dlopez.utils;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;

public class ApiUtils {

	public final static String objectToJsonString(Object object) {
		Gson g = new Gson();
		return g.toJson(object);
	}

	public final static Response resposeBadRequest(Object out) {
		return Response.status(Response.Status.BAD_REQUEST.getStatusCode()).entity(ApiUtils.objectToJsonString(out))
				.build();
	}
}
