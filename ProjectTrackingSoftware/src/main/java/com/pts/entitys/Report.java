
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

import com.pts.entitys.TypeReport;
import com.pts.entitys.AssociatedProyect;
import com.pts.entitys.TimeReport;
import com.pts.entitys.TimeAssigned;


@Entity
@Table(name = "report")
public class Report implements Serializable {

private static final long serialVersionUID = -2510701842067538213L;

		@Id
		@GeneratedValue(generator = "sequence_mat_id_generator")
		@SequenceGenerator(name="sequence_mat_id_generator", initialValue= 25, allocationSize=1000)
		@Column(name = "idReport", updatable = true, nullable = false, length = 25)
		private Long idReport;


		@Column(name = "userCode", updatable = true, nullable = true, length = 200)
		private String userCode;


		@Column(name = "userAssigned", updatable = true, nullable = true, length = 200)
		private String userAssigned;


		@Column(name = "client", updatable = true, nullable = true, length = 200)
		private String client;


		@Column(name = "codeReports", updatable = true, nullable = true, length = 200)
		private String codeReports;


		@Column(name = "title", updatable = true, nullable = true, length = 200)
		private String title;


		@Column(name = "description", updatable = true, nullable = true, length = 200)
		private String description;


		@Column(name = "comentarios", updatable = true, nullable = true, length = 200)
		private Byte comentarios;


		@Column(name = "state", updatable = true, nullable = true, length = 200)
		private String state;


		@Column(name = "stateReport", updatable = true, nullable = true, length = 200)
		private String stateReport;


		@Column(name = "timeDedicate", updatable = true, nullable = true, length = 200)
		private Long timeDedicate;


		@Column(name = "startDate", updatable = true, nullable = true, length = 200)
		private Date startDate;


		@Column(name = "commitmentDate", updatable = true, nullable = true, length = 200)
		private Date commitmentDate;


		@Column(name = "priority", updatable = true, nullable = true, length = 200)
		private String priority;


		@Column(name = "linkAcceso", updatable = true, nullable = true, length = 200)
		private String linkAcceso;


		@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER )
		private TypeReport typeReport;

		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = false)
		private   List<AssociatedProyect>associatedProyects= new ArrayList<AssociatedProyect>();

		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = false)
		private   List<TimeReport>times = new ArrayList<TimeReport>();

		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = false)
		private List<TimeAssigned> assigmeds= new ArrayList<TimeAssigned>();

		
		public Long getIdreport() { 
			return idReport;
		}
		public void setIdreport(Long  idReport) {
			this.idReport = idReport;
		}
		public String getUsercode() { 
			return userCode;
		}
		public void setUsercode(String  userCode) {
			this.userCode = userCode;
		}
		public String getUserassigned() { 
			return userAssigned;
		}
		public void setUserassigned(String  userAssigned) {
			this.userAssigned = userAssigned;
		}
		public String getClient() { 
			return client;
		}
		public void setClient(String  client) {
			this.client = client;
		}
		public String getCodereports() { 
			return codeReports;
		}
		public void setCodereports(String  codeReports) {
			this.codeReports = codeReports;
		}
		public String getTitle() { 
			return title;
		}
		public void setTitle(String  title) {
			this.title = title;
		}
		public String getDescription() { 
			return description;
		}
		public void setDescription(String  description) {
			this.description = description;
		}
		public Byte getComentarios() { 
			return comentarios;
		}
		public void setComentarios(Byte  comentarios) {
			this.comentarios = comentarios;
		}
		public String getState() { 
			return state;
		}
		public void setState(String  state) {
			this.state = state;
		}
		public String getStatereport() { 
			return stateReport;
		}
		public void setStatereport(String  stateReport) {
			this.stateReport = stateReport;
		}
		public Long getTimededicate() { 
			return timeDedicate;
		}
		public void setTimededicate(Long  timeDedicate) {
			this.timeDedicate = timeDedicate;
		}
		public Date getStartdate() { 
			return startDate;
		}
		public void setStartdate(Date  startDate) {
			this.startDate = startDate;
		}
		public Date getCommitmentdate() { 
			return commitmentDate;
		}
		public void setCommitmentdate(Date  commitmentDate) {
			this.commitmentDate = commitmentDate;
		}
		public String getPriority() { 
			return priority;
		}
		public void setPriority(String  priority) {
			this.priority = priority;
		}
		public String getLinkacceso() { 
			return linkAcceso;
		}
		public void setLinkacceso(String  linkAcceso) {
			this.linkAcceso = linkAcceso;
		}
		public TypeReport gettypeReport() { 
			return typeReport;
		}
		public void settypeReport(TypeReport  typeReport) {
			this.typeReport = typeReport;
		}
		public List<AssociatedProyect> getassociatedProyects() { 
			return associatedProyects;
		}
		public void setassociatedProyects( List<AssociatedProyect>  associatedProyects) {
			this.associatedProyects = associatedProyects;
		}
		public List<TimeReport> gettimes () { 
			return times ;
		}
		public void settimes ( List<TimeReport>  times ) {
			this.times  = times ;
		}
		public List<TimeAssigned> getassigmeds() { 
			return assigmeds;
		}
		public void setassigmeds( List<TimeAssigned>  assigmeds) {
			this.assigmeds = assigmeds;
		}
			public boolean equalsReport(Object o) {
				if (this == o) return true;
				if (o == null || getClass() != o.getClass()) return false;
					Report report = (Report) o;
						return 			Objects.equals(idReport, report.idReport) ||
			Objects.equals(userCode, report.userCode) ||
			Objects.equals(userAssigned, report.userAssigned) ||
			Objects.equals(client, report.client) ||
			Objects.equals(codeReports, report.codeReports) ||
			Objects.equals(title, report.title) ||
			Objects.equals(description, report.description) ||
			Objects.equals(comentarios, report.comentarios) ||
			Objects.equals(state, report.state) ||
			Objects.equals(stateReport, report.stateReport) ||
			Objects.equals(timeDedicate, report.timeDedicate) ||
			Objects.equals(startDate, report.startDate) ||
			Objects.equals(commitmentDate, report.commitmentDate) ||
			Objects.equals(priority, report.priority) ||
			Objects.equals(linkAcceso, report.linkAcceso);

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

