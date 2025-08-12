package com.dlopez.business.naat;

import java.io.Serializable;
import java.math.BigDecimal;

public class NAATCreditLinePartitionInfo implements Serializable {
	private static final long serialVersionUID = -6003112018855769080L;

	private Long creditLinePartitionTypeId;
	private String descCrLinePartitionType;
	private BigDecimal creditLimit;
	private Integer currencyId;
	private String expirationDate;

	public Long getCreditLinePartitionTypeId() {
		return creditLinePartitionTypeId;
	}

	public void setCreditLinePartitionTypeId(Long creditLinePartitionTypeId) {
		this.creditLinePartitionTypeId = creditLinePartitionTypeId;
	}

	public String getDescCrLinePartitionType() {
		return descCrLinePartitionType;
	}

	public void setDescCrLinePartitionType(String descCrLinePartitionType) {
		this.descCrLinePartitionType = descCrLinePartitionType;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
}
