
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


package com.com.pts.service;

import com.com.pts.entitys.AssociatedProyect;

import java.util.List;


public interface AssociatedProyectService {

    public AssociatedProyect findByIdProyect(Long idProyect);

    public AssociatedProyect findByIdReport(Long idReport);

    public List<AssociatedProyect> findByIdProyectContaining(Long idProyect);

    public List<AssociatedProyect> findByIdReportContaining(Long idReport);

    public AssociatedProyect findById(Long id);

    public boolean saveAssociatedProyect(AssociatedProyect associatedproyect);

    public List<AssociatedProyect> getAllAssociatedProyect();

    public boolean deleteAssociatedProyect(Long id);

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


