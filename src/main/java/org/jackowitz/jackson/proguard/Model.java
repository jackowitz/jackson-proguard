package org.jackowitz.jackson.proguard;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class Model {

	@JsonProperty("used")
	private String mUsedXX;

	@JsonProperty("unused")
	private String mUnusedXX;

	public Model(
		@JsonProperty("used") final String used,
		@JsonProperty("unused") final String unused
	) {
		mUsedXX = used; mUnusedXX = unused;
	}

	@JsonProperty("used")
	public String getUsedXX() {
		return mUsedXX;
	}

	@JsonProperty("unused")
	public String getUnusedXX() {
		return mUnusedXX;
	}
}
