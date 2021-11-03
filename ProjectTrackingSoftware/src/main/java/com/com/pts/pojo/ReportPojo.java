
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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class ReportPojo implements Serializable {

    private static final long serialVersionUID = -3556717284106486871L;

    private Long idReport;

    private String userCode;

    private String userAssigned;

    private String client;

    private String codeReports;

    private String title;

    private String description;

    private Byte[] comentarios;

    private String state;

    private String stateReport;

    private Long timeDedicate;

    private Date startDate;

    private Date commitmentDate;

    private String priority;

    private String linkAcceso;

    private TypeReportPojo typeReport;

    private List<AssociatedProyectPojo> associatedProyects = new ArrayList<>();

    private List<TimeReportPojo> times = new ArrayList<>();

    private List<TimeAssignedPojo> assigmeds = new ArrayList<>();



    public Long getIdreport() {
        return idReport;
    }

    public void setIdreport(Long idReport) {
        this.idReport = idReport;
    }

    public String getUsercode() {
        return userCode;
    }

    public void setUsercode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserassigned() {
        return userAssigned;
    }

    public void setUserassigned(String userAssigned) {
        this.userAssigned = userAssigned;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCodereports() {
        return codeReports;
    }

    public void setCodereports(String codeReports) {
        this.codeReports = codeReports;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte[] getComentarios() {
        return comentarios;
    }

    public void setComentarios(Byte[] comentarios) {
        this.comentarios = comentarios;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatereport() {
        return stateReport;
    }

    public void setStatereport(String stateReport) {
        this.stateReport = stateReport;
    }

    public Long getTimededicate() {
        return timeDedicate;
    }

    public void setTimededicate(Long timeDedicate) {
        this.timeDedicate = timeDedicate;
    }

    public Date getStartdate() {
        return startDate;
    }

    public void setStartdate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCommitmentdate() {
        return commitmentDate;
    }

    public void setCommitmentdate(Date commitmentDate) {
        this.commitmentDate = commitmentDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getLinkacceso() {
        return linkAcceso;
    }

    public void setLinkacceso(String linkAcceso) {
        this.linkAcceso = linkAcceso;
    }

    public TypeReportPojo gettypeReport() {
        return typeReport;
    }

    public void settypeReport(TypeReportPojo typeReport) {
        this.typeReport = typeReport;
    }

    public List<AssociatedProyectPojo> getassociatedProyects() {
        return associatedProyects;
    }

    public void setassociatedProyects(List<AssociatedProyectPojo> associatedProyects) {
        this.associatedProyects = associatedProyects;
    }

    public List<TimeReportPojo> gettimes() {
        return times;
    }

    public void settimes(List<TimeReportPojo> times) {
        this.times = times;
    }

    public List<TimeAssignedPojo> getassigmeds() {
        return assigmeds;
    }

    public void setassigmeds(List<TimeAssignedPojo> assigmeds) {
        this.assigmeds = assigmeds;
    }

    public boolean equalsReportPojo(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReportPojo reportpojo = (ReportPojo) o;
        return Objects.equals(idReport, reportpojo.idReport) ||
                Objects.equals(userCode, reportpojo.userCode) ||
                Objects.equals(userAssigned, reportpojo.userAssigned) ||
                Objects.equals(client, reportpojo.client) ||
                Objects.equals(codeReports, reportpojo.codeReports) ||
                Objects.equals(title, reportpojo.title) ||
                Objects.equals(description, reportpojo.description) ||
                Objects.equals(comentarios, reportpojo.comentarios) ||
                Objects.equals(state, reportpojo.state) ||
                Objects.equals(stateReport, reportpojo.stateReport) ||
                Objects.equals(timeDedicate, reportpojo.timeDedicate) ||
                Objects.equals(startDate, reportpojo.startDate) ||
                Objects.equals(commitmentDate, reportpojo.commitmentDate) ||
                Objects.equals(priority, reportpojo.priority) ||
                Objects.equals(linkAcceso, reportpojo.linkAcceso);

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

