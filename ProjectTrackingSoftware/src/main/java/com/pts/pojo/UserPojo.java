
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

		private   List<RolPojo>rol= new ArrayList<>();


		public Long getIduser() { 
			return idUser;
		}
		public void setIduser(Long  idUser) {
			this.idUser = idUser;
		}
		public String getUsercode() { 
			return userCode;
		}
		public void setUsercode(String  userCode) {
			this.userCode = userCode;
		}
		public String getUserfirsname() { 
			return userFirsName;
		}
		public void setUserfirsname(String  userFirsName) {
			this.userFirsName = userFirsName;
		}
		public String getUserlastname() { 
			return userLastName;
		}
		public void setUserlastname(String  userLastName) {
			this.userLastName = userLastName;
		}
		public String getFullname() { 
			return fullName;
		}
		public void setFullname(String  fullName) {
			this.fullName = fullName;
		}
		public String getUsername() { 
			return userName;
		}
		public void setUsername(String  userName) {
			this.userName = userName;
		}
		public String getMail() { 
			return mail;
		}
		public void setMail(String  mail) {
			this.mail = mail;
		}
		public String getPassword() { 
			return password;
		}
		public void setPassword(String  password) {
			this.password = password;
		}
		public String getImagen() { 
			return imagen;
		}
		public void setImagen(String  imagen) {
			this.imagen = imagen;
		}
		public Boolean getAccountnonexpired() { 
			return accountNonExpired;
		}
		public void setAccountnonexpired(Boolean  accountNonExpired) {
			this.accountNonExpired = accountNonExpired;
		}
		public Boolean getAccountnonlocked() { 
			return accountNonLocked;
		}
		public void setAccountnonlocked(Boolean  accountNonLocked) {
			this.accountNonLocked = accountNonLocked;
		}
		public Boolean getCredentialsnonexpired() { 
			return credentialsNonExpired;
		}
		public void setCredentialsnonexpired(Boolean  credentialsNonExpired) {
			this.credentialsNonExpired = credentialsNonExpired;
		}
		public Boolean getEnabled() { 
			return enabled;
		}
		public void setEnabled(Boolean  enabled) {
			this.enabled = enabled;
		}
		public List<RolPojo> getrol() { 
			return rol;
		}
		public void setrol( List<RolPojo>  rol) {
			this.rol = rol;
		}
			public boolean equalsUserPojo(Object o) {
				if (this == o) return true;
				if (o == null || getClass() != o.getClass()) return false;
					UserPojo userpojo = (UserPojo) o;
						return 			Objects.equals(idUser, userpojo.idUser) ||
			Objects.equals(userCode, userpojo.userCode) ||
			Objects.equals(userFirsName, userpojo.userFirsName) ||
			Objects.equals(userLastName, userpojo.userLastName) ||
			Objects.equals(fullName, userpojo.fullName) ||
			Objects.equals(userName, userpojo.userName) ||
			Objects.equals(mail, userpojo.mail) ||
			Objects.equals(password, userpojo.password) ||
			Objects.equals(imagen, userpojo.imagen) ||
			Objects.equals(accountNonExpired, userpojo.accountNonExpired) ||
			Objects.equals(accountNonLocked, userpojo.accountNonLocked) ||
			Objects.equals(credentialsNonExpired, userpojo.credentialsNonExpired) ||
			Objects.equals(enabled, userpojo.enabled);

}}
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

