
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

package com.pts.entitys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.Objects;

import com.pts.entitys.Rol;


@Entity
@Table(name = "user")
public class User implements Serializable {

private static final long serialVersionUID = -6408409138843526350L;

		@Id
		@GeneratedValue(generator = "sequence_mat_id_generator")
		@SequenceGenerator(name="sequence_mat_id_generator", initialValue= 25, allocationSize=1000)
		@Column(name = "idUser", updatable = true, nullable = false, length = 25)
		private Long idUser;


		@Column(name = "userCode", updatable = true, nullable = true, length = 200)
		private String userCode;


		@Column(name = "userFirsName", updatable = true, nullable = true, length = 200)
		private String userFirsName;


		@Column(name = "userLastName", updatable = true, nullable = true, length = 200)
		private String userLastName;


		@Column(name = "fullName", updatable = true, nullable = true, length = 200)
		private String fullName;


		@Column(name = "userName", updatable = true, nullable = true, length = 200)
		private String userName;


		@Column(name = "mail", updatable = true, nullable = true, length = 200)
		private String mail;


		@Column(name = "password", updatable = true, nullable = true, length = 200)
		private String password;


		@Column(name = "imagen", updatable = true, nullable = true, length = 200)
		private String imagen;


		@Column(name = "accountNonExpired", updatable = true, nullable = true, length = 200)
		private Boolean accountNonExpired;


		@Column(name = "accountNonLocked", updatable = true, nullable = true, length = 200)
		private Boolean accountNonLocked;


		@Column(name = "credentialsNonExpired", updatable = true, nullable = true, length = 200)
		private Boolean credentialsNonExpired;


		@Column(name = "enabled", updatable = true, nullable = true, length = 200)
		private Boolean enabled;


		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = false)

		private   List<Rol>rol= new ArrayList<>();

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
		public List<Rol> getrol() { 
			return rol;
		}
		public void setrol( List<Rol>  rol) {
			this.rol = rol;
		}
			public boolean equalsUser(Object o) {
				if (this == o) return true;
				if (o == null || getClass() != o.getClass()) return false;
					User user = (User) o;
						return 			Objects.equals(idUser, user.idUser) ||
			Objects.equals(userCode, user.userCode) ||
			Objects.equals(userFirsName, user.userFirsName) ||
			Objects.equals(userLastName, user.userLastName) ||
			Objects.equals(fullName, user.fullName) ||
			Objects.equals(userName, user.userName) ||
			Objects.equals(mail, user.mail) ||
			Objects.equals(password, user.password) ||
			Objects.equals(imagen, user.imagen) ||
			Objects.equals(accountNonExpired, user.accountNonExpired) ||
			Objects.equals(accountNonLocked, user.accountNonLocked) ||
			Objects.equals(credentialsNonExpired, user.credentialsNonExpired) ||
			Objects.equals(enabled, user.enabled);

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

