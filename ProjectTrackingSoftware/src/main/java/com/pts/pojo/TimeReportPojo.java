
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



public class TimeReportPojo implements Serializable {

private static final long serialVersionUID = -8663840051215204032L;

		private Long idTimeReport;

		private Date timeDedicate;

		private Date timeDedicateTotal;

		private Long idReport;

		private String userCode;

		public Long getIdtimereport() { 
			return idTimeReport;
		}
		public void setIdtimereport(Long  idTimeReport) {
			this.idTimeReport = idTimeReport;
		}
		public Date getTimededicate() { 
			return timeDedicate;
		}
		public void setTimededicate(Date  timeDedicate) {
			this.timeDedicate = timeDedicate;
		}
		public Date getTimededicatetotal() { 
			return timeDedicateTotal;
		}
		public void setTimededicatetotal(Date  timeDedicateTotal) {
			this.timeDedicateTotal = timeDedicateTotal;
		}
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
			public boolean equalsTimeReportPojo(Object o) {
				if (this == o) return true;
				if (o == null || getClass() != o.getClass()) return false;
					TimeReportPojo timereportpojo = (TimeReportPojo) o;
						return 			Objects.equals(idTimeReport, timereportpojo.idTimeReport) ||
			Objects.equals(timeDedicate, timereportpojo.timeDedicate) ||
			Objects.equals(timeDedicateTotal, timereportpojo.timeDedicateTotal) ||
			Objects.equals(idReport, timereportpojo.idReport) ||
			Objects.equals(userCode, timereportpojo.userCode);

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

