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


package com.com.pts.validation ;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;import java.util.Date;

import com.com.pts.entitys.Report;import java.util.regex.Pattern;
import org.springframework.stereotype.Service;
import com.com.pts.pojo.ReportPojo;import com.com.pts.entitys.TypeReport;
import com.com.pts.pojo.TypeReportPojo;
import com.com.pts.entitys.AssociatedProyect;
import com.com.pts.pojo.AssociatedProyectPojo;
import com.com.pts.entitys.TimeReport;
import com.com.pts.pojo.TimeReportPojo;
import com.com.pts.entitys.TimeAssigned;
import com.com.pts.pojo.TimeAssignedPojo;



    @Service
    public class ReportValidation {

        public ReportPojo valida(ReportPojo report) {
        ReportPojo pojo = null;
        try {
             if (report != null) {
              if (
        report.getUsercode() != null &&
        report.getUserassigned() != null &&
        report.getClient() != null &&
        report.getCodereports() != null &&
        report.getTitle() != null &&
        report.getDescription() != null &&
        report.getComentarios() != null &&
        report.getState() != null &&
        report.getStatereport() != null &&
        report.getTimededicate() != null &&
        report.getStartdate() != null &&
        report.getCommitmentdate() != null &&
        report.getPriority() != null &&
        report.getLinkacceso() != null        ) {
        pojo = report;
         }
        }
            return pojo;
        } catch (Exception e) {
            e.printStackTrace();
            return pojo;
        }
    }
// remplace de name of variable for you proyecte
    public Long valida_id( String poder) {
             Long id_Delete = 0l;        try {
          if (poder != null) {
          if (poder.length() > 0 && !Pattern.matches("[a-zA-Z]+", poder)) {
         id_Delete = Long.parseLong(poder);            }
        }
            return id_Delete;
        } catch (Exception e) {
            e.printStackTrace();
            return id_Delete;
        }
    }
    public <T> Object validation(T t) {
         T elemento = null;
        try {
        if (t != null) {
            elemento = t;
        }
            return elemento;
        } catch (Exception e) {
            e.printStackTrace();
            return elemento;
        }
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


