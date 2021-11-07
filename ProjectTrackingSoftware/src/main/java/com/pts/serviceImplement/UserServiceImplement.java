
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


package com.pts.serviceImplement;

import com.pts.service.UserService;
import com.pts.repository.UserRepository;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.pts.entitys.User;
import com.pts.entitys.Rol;


@Service
public class UserServiceImplement implements UserService {

    protected static final Log logger = LogFactory.getLog(UserServiceImplement.class);

    @Value("${keyAdmin}")
    private String keyAd;

    @Autowired
    private UserRepository userrepository;


    @Override
    public boolean newUser(User user , String Key) {
        logger.info("Save a new User");

        try {
            if( Key != null && Key.equals(keyAd)){
                user.getrol().add(new Rol("ADMIN", "user administrative"));
                userrepository.save(user);
            }else{
                user.getrol().add(new Rol("USER", "normal user"));
                userrepository.save(user);
            }
            return true;
        } catch (DataAccessException e) {
            logger.error(" ERROR : " + e);
            return false;
        }
    }


    @Override
    public User findByUserCode(String userCode) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByUserCode(userCode);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByUserFirsName(String userFirsName) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByUserFirsName(userFirsName);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByUserLastName(String userLastName) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByUserLastName(userLastName);

        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByFullName(String fullName) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByFullName(fullName);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByUserName(String userName) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByUserName(userName);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByMail(String mail) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByMail(mail);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByPassword(String password) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByPassword(password);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByImagen(String imagen) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByImagen(imagen);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByAccountNonExpired(Boolean accountNonExpired) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByAccountNonExpired(accountNonExpired);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByAccountNonLocked(Boolean accountNonLocked) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByAccountNonLocked(accountNonLocked);

        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByCredentialsNonExpired(Boolean credentialsNonExpired) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByCredentialsNonExpired(credentialsNonExpired);

        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }

    @Override
    public User findByEnabled(Boolean enabled) {

        logger.info("Starting getUser");
        User userEntity = new User();
        Optional<User> fileOptional1 = userrepository.findByEnabled(enabled);
        if (fileOptional1.isPresent()) {
            try {
                userEntity = fileOptional1.get();
            } catch (DataAccessException e) {
                logger.error(" ERROR : " + e);
            }
        }
        return userEntity;
    }


    @Override
    public List<User> getAllUser() {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        userrepository.findAll().forEach(user -> listaUser.add(user));
        return listaUser;
    }


    @Override
    public boolean saveUser(User user) {
        logger.info("Save Proyect");
        try {
            userrepository.save(user);
            return true;
        } catch (DataAccessException e) {
            logger.error(" ERROR : " + e);
            return false;
        }
    }


    @Override
    public boolean deleteUser(Long id) {
        logger.info("Delete Proyect");
        boolean clave = false;
        try {
            userrepository.deleteById(id);
            clave = true;
        } catch (DataAccessException e) {
            logger.error(" ERROR : " + e);
            clave = false;
        }
        return clave;
    }


    @Override
    public User findById(Long id) {
        return userrepository.findById(id).get();
    }


    @Override
    public List<User> findByUserCodeContaining(String usercode) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByUserCodeContaining(usercode);
        return listaUser;
    }

    @Override
    public List<User> findByUserFirsNameContaining(String userfirsname) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByUserFirsNameContaining(userfirsname);
        return listaUser;
    }

    @Override
    public List<User> findByUserLastNameContaining(String userlastname) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByUserLastNameContaining(userlastname);
        return listaUser;
    }

    @Override
    public List<User> findByFullNameContaining(String fullname) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByFullNameContaining(fullname);
        return listaUser;
    }

    @Override
    public List<User> findByUserNameContaining(String username) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByUserNameContaining(username);
        return listaUser;
    }

    @Override
    public List<User> findByMailContaining(String mail) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByMailContaining(mail);
        return listaUser;
    }

    @Override
    public List<User> findByPasswordContaining(String password) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByPasswordContaining(password);
        return listaUser;
    }

    @Override
    public List<User> findByImagenContaining(String imagen) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByImagenContaining(imagen);
        return listaUser;
    }

    @Override
    public List<User> findByAccountNonExpiredContaining(Boolean accountnonexpired) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByAccountNonExpiredContaining(accountnonexpired);
        return listaUser;
    }

    @Override
    public List<User> findByAccountNonLockedContaining(Boolean accountnonlocked) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByAccountNonLockedContaining(accountnonlocked);
        return listaUser;
    }

    @Override
    public List<User> findByCredentialsNonExpiredContaining(Boolean credentialsnonexpired) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByCredentialsNonExpiredContaining(credentialsnonexpired);
        return listaUser;
    }

    @Override
    public List<User> findByEnabledContaining(Boolean enabled) {
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        listaUser = userrepository.findByEnabledContaining(enabled);
        return listaUser;
    }


    @Override
    public List<User> findByRolContaining(Rol rol) {
        logger.info("metodo: metodContainingRelacion NEW ");
        logger.info("Get allProyect");
        List<User> listaUser = new ArrayList<User>();
        for (User user : this.getAllUser()) {
            for (Rol rolx : user.getrol()) {
                if (rolx.equalsRol(rol)) {
                    listaUser.add(user);
                }
            }
        }
        return listaUser;
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


}
