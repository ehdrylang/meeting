package org.meeting.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserVO {
	@NotNull
	@Size(min=4,max=20)
	@Pattern(regexp="^[a-zA-Z0-9]*$", message="username똑바로해라")
	private String username;
	@NotNull
	@Size(min=6,max=20)
	@Pattern(regexp="^[a-zA-Z0-9]*$", message="password똑바로해라")
	private String password;
	@NotNull
	private String displayname;
	@NotNull
	@Pattern(regexp="^[a-zA-Z0-9]*$", message="kakaoid똑바로해라")
	private String kakaoid;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	public String getKakaoid() {
		return kakaoid;
	}
	public void setKakaoid(String kakaoid) {
		this.kakaoid = kakaoid;
	}
	@Override
	public String toString() {
		return "UserVO [username=" + username + ", password=" + password + ", displayname=" + displayname + ", kakaoid="
				+ kakaoid + "]";
	}
}
