
/*
Create on Sun Oct 31 21:31:49 ART 2021
*Copyright (C) 121.
@author Alejandro Subero
@author Subero Alejandro
@author ANACODE AND IVANCODE
@since 11.0
@version1.0.0.0
@version  %I%, %G%
*<p>Description: This project tracking software </p>
*/

package com.com.pts.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.Objects;



public class AssociatedProyectPojo implements Serializable {

private static final long serialVersionUID = -3086651865920031671L;

		private Long idProyect;

		private Long idReport;

		private Long idAssociatedProyect;

		public Long getIdproyect() { 
			return idProyect;
		}
		public void setIdproyect(Long  idProyect) {
			this.idProyect = idProyect;
		}
		public Long getIdreport() { 
			return idReport;
		}
		public void setIdreport(Long  idReport) {
			this.idReport = idReport;
		}
		public Long getIdassociatedproyect() { 
			return idAssociatedProyect;
		}
		public void setIdassociatedproyect(Long  idAssociatedProyect) {
			this.idAssociatedProyect = idAssociatedProyect;
		}
			public boolean equalsAssociatedProyectPojo(Object o) {
				if (this == o) return true;
				if (o == null || getClass() != o.getClass()) return false;
					AssociatedProyectPojo associatedproyectpojo = (AssociatedProyectPojo) o;
						return 			Objects.equals(idProyect, associatedproyectpojo.idProyect) ||
			Objects.equals(idReport, associatedproyectpojo.idReport) ||
			Objects.equals(idAssociatedProyect, associatedproyectpojo.idAssociatedProyect);

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

