
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


package com.com.pts.repository;

import java.util.List;
import java.util.Date;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.com.pts.entitys.Prioritys;

public interface PrioritysRepository extends CrudRepository<Prioritys, Long> {

    public Optional<Prioritys> findByValue(String value);

    public List<Prioritys> findByValueContaining(String value);

    public Optional<Prioritys> findByDescription(String description);

    public List<Prioritys> findByDescriptionContaining(String description);

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


