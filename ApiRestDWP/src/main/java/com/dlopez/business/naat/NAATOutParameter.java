package com.dlopez.business.naat;

import java.io.Serializable;

public class NAATOutParameter implements Serializable {
	private static final long serialVersionUID = -1746569378380297502L;

	private String resultInd;
	private String errorDetail;
	private String code;
	private String message;

	public String getResultInd() {
		return resultInd;
	}

	public void setResultInd(String resultInd) {
		this.resultInd = resultInd;
	}

	public String getErrorDetail() {
		return errorDetail;
	}

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
