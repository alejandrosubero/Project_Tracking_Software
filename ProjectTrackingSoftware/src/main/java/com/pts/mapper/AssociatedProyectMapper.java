

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


package com.pts.mapper;
import com.pts.entitys.AssociatedProyect;
import com.pts.pojo.AssociatedProyectPojo;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;

    @Component
    public class AssociatedProyectMapper {

    public AssociatedProyect pojoToEntity(AssociatedProyectPojo pojo) {
		ModelMapper modelMapper = new ModelMapper();
        AssociatedProyect entity = null;

		if ( pojo != null) {
   		entity = modelMapper.map(pojo, AssociatedProyect.class);
		}
	return  entity;
}
    
    
    public AssociatedProyectPojo entityToPojo(AssociatedProyect entity) {
 		ModelMapper modelMapper = new ModelMapper();
 		AssociatedProyectPojo pojo = null;

		if ( entity != null) {
   		pojo = modelMapper.map(entity, AssociatedProyectPojo.class);
		}
	return  pojo;
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


