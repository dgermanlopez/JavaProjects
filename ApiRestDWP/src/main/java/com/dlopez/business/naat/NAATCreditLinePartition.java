package com.dlopez.business.naat;

import java.io.Serializable;

public class NAATCreditLinePartition implements Serializable {
	private static final long serialVersionUID = -9007967844674912396L;

	private NAATCreditLinePartitionInfo creditLinePartition;

	public NAATCreditLinePartitionInfo getCreditLinePartition() {
		return creditLinePartition;
	}

	public void setCreditLinePartition(NAATCreditLinePartitionInfo creditLinePartition) {
		this.creditLinePartition = creditLinePartition;
	}
}