
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



public class TimeAssignedPojo implements Serializable {

private static final long serialVersionUID = -9035384744686908746L;

		private Long idTimeAssigned;

		private Date assignedDate;

		private String stateAssigned;

		private String stateReport;

		private String userCode;

		private Long idReport;

		private String userAssigned;

		public Long getIdtimeassigned() { 
			return idTimeAssigned;
		}
		public void setIdtimeassigned(Long  idTimeAssigned) {
			this.idTimeAssigned = idTimeAssigned;
		}
		public Date getAssigneddate() { 
			return assignedDate;
		}
		public void setAssigneddate(Date  assignedDate) {
			this.assignedDate = assignedDate;
		}
		public String getStateassigned() { 
			return stateAssigned;
		}
		public void setStateassigned(String  stateAssigned) {
			this.stateAssigned = stateAssigned;
		}
		public String getStatereport() { 
			return stateReport;
		}
		public void setStatereport(String  stateReport) {
			this.stateReport = stateReport;
		}
		public String getUsercode() { 
			return userCode;
		}
		public void setUsercode(String  userCode) {
			this.userCode = userCode;
		}
		public Long getIdreport() { 
			return idReport;
		}
		public void setIdreport(Long  idReport) {
			this.idReport = idReport;
		}
		public String getUserassigned() { 
			return userAssigned;
		}
		public void setUserassigned(String  userAssigned) {
			this.userAssigned = userAssigned;
		}
			public boolean equalsTimeAssignedPojo(Object o) {
				if (this == o) return true;
				if (o == null || getClass() != o.getClass()) return false;
					TimeAssignedPojo timeassignedpojo = (TimeAssignedPojo) o;
						return 			Objects.equals(idTimeAssigned, timeassignedpojo.idTimeAssigned) ||
			Objects.equals(assignedDate, timeassignedpojo.assignedDate) ||
			Objects.equals(stateAssigned, timeassignedpojo.stateAssigned) ||
			Objects.equals(stateReport, timeassignedpojo.stateReport) ||
			Objects.equals(userCode, timeassignedpojo.userCode) ||
			Objects.equals(idReport, timeassignedpojo.idReport) ||
			Objects.equals(userAssigned, timeassignedpojo.userAssigned);

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

