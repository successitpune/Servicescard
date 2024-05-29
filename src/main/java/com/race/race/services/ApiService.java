package com.race.race.services;

import com.race.race.dao.ApiRepository;
//import com.race.race.dao.JarRepository;
import com.race.race.entites.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

 @Service
 public class ApiService {
 @Autowired
  private ApiRepository apiRepository;
 //GetAlluser
 public List<Api> getallUser(){
 List<Api> list=(List<Api>) this.apiRepository.findAll();
 return list;
 }
  //getby id
  public Api getbyidUser(long id){
  Api api=null;
  api=this.apiRepository.findById(id);
 return api;
 }
  public Api addUser(Api a){
 Api result=apiRepository.save(a);
 return result;
 }

 //delete User
 public void deleteUser(long aId){
 apiRepository.deleteById(aId);
 }
  public void updateUser(Api api,long apiid) {
      api.setId(apiid);
      apiRepository.save(api);
  }
  }
























