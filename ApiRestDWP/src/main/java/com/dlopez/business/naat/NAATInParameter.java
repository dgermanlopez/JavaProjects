package com.dlopez.business.naat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NAATInParameter implements Serializable {

	private static final long serialVersionUID = 2006774636203399755L;

	private Long applicationId;
	private String cardId;
	private Long customerId;
	private String cardType;
	private Long guarantorId;
	private String mainCardId;
	private List<NAATCreditLinePartition> creditLinePartitions;
	private String billingDate;
	private String paymentDate;

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getGuarantorId() {
		return guarantorId;
	}

	public void setGuarantorId(Long guarantorId) {
		this.guarantorId = guarantorId;
	}

	public String getMainCardId() {
		return mainCardId;
	}

	public void setMainCardId(String mainCardId) {
		this.mainCardId = mainCardId;
	}

	public List<NAATCreditLinePartition> getCreditLinePartitions() {
		return creditLinePartitions;
	}

	public void setCreditLinePartitions(List<NAATCreditLinePartition> creditLinePartitions) {
		this.creditLinePartitions = creditLinePartitions;
	}

	public String getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
}
