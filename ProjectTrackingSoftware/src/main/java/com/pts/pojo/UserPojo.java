
/*
Create on Sun Nov 07 14:17:04 ART 2021
*Copyright (C) 121.
@author Alejandro Subero
@author Subero Alejandro
@author ANACODE AND IVANCODE
@since 11.0
@version1.0.0.0
@version  %I%, %G%
*<p>Description: This project tracking software </p>
*/

package com.pts.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.Objects;

import com.pts.pojo.RolPojo;


public class UserPojo implements Serializable {

private static final long serialVersionUID = 7851869393937062411L;

		private Long idUser;

		private String userCode;

		private String userFirsName;

		private String userLastName;

		private String fullName;

		private String userName;

		private String mail;

		private String password;

		private String imagen;

		private Boolean accountNonExpired;

		private Boolean accountNonLocked;

		private Boolean credentialsNonExpired;

		private Boolean enabled;

		private String rol;

	public UserPojo() {
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserFirsName() {
		return userFirsName;
	}

	public void setUserFirsName(String userFirsName) {
		this.userFirsName = userFirsName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Boolean getAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(Boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public Boolean getAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(Boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public Boolean getCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof UserPojo)) return false;
		UserPojo userPojo = (UserPojo) o;
		return Objects.equals(getIdUser(), userPojo.getIdUser()) && Objects.equals(getUserCode(), userPojo.getUserCode()) && Objects.equals(getUserFirsName(), userPojo.getUserFirsName()) && Objects.equals(getUserLastName(), userPojo.getUserLastName()) && Objects.equals(getFullName(), userPojo.getFullName()) && Objects.equals(getUserName(), userPojo.getUserName()) && Objects.equals(getMail(), userPojo.getMail()) && Objects.equals(getPassword(), userPojo.getPassword()) && Objects.equals(getImagen(), userPojo.getImagen()) && Objects.equals(getAccountNonExpired(), userPojo.getAccountNonExpired()) && Objects.equals(getAccountNonLocked(), userPojo.getAccountNonLocked()) && Objects.equals(getCredentialsNonExpired(), userPojo.getCredentialsNonExpired()) && Objects.equals(getEnabled(), userPojo.getEnabled()) && Objects.equals(getRol(), userPojo.getRol());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdUser(), getUserCode(), getUserFirsName(), getUserLastName(), getFullName(), getUserName(), getMail(), getPassword(), getImagen(), getAccountNonExpired(), getAccountNonLocked(), getCredentialsNonExpired(), getEnabled(), getRol());
	}
}
 /*
 Copyright (C) 2008 Google Inc.
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

