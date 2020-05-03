package io.github.kevinoshea.skeletonreactspring.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

	private String userId;

	private String socialId;
	private String socialLogin;
	private LoginType loginType;

	private String display;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(final String userId) {
		this.userId = userId;
	}

	public String getSocialId() {
		return this.socialId;
	}

	public void setSocialId(final String socialId) {
		this.socialId = socialId;
	}

	public String getSocialLogin() {
		return this.socialLogin;
	}

	public void setSocialLogin(final String socialLogin) {
		this.socialLogin = socialLogin;
	}

	public LoginType getLoginType() {
		return this.loginType;
	}

	public void setLoginType(final LoginType loginType) {
		this.loginType = loginType;
	}

	public String getDisplay() {
		return this.display;
	}

	public void setDisplay(final String display) {
		this.display = display;
	}
}