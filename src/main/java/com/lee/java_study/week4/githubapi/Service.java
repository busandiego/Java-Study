package com.lee.java_study.week4.githubapi;

import java.io.IOException;
import java.util.Map;

public class Service {

    private Dao dao;


    public Service() throws IOException{
        this.dao = new Dao();
    }

    // 레포지토리 세팅
    public boolean setRepo(String repo) throws IOException{
        return this.dao.setRepo(repo);
    }


    // userid로 출석율 검색
    public void findByName(String name){
        Double rate = this.dao.getAttendenceRateByName(name);
        if(rate==0) return;
        System.out.println(name + ":" + String.format("%.2f", rate) + "%" + "\n");
    }

    // 모든 유저의 출석율 검색, 출석율 높은순으로 정렬
    public void findAll(){
        Map<String, Double> allRate = this.dao.getAllAttendenceRate();
        int idx = 1;
        for (String id : allRate.keySet()){
            Double rate = allRate.get(id);
            System.out.println(idx + ".");
            String r = String.format("%20s", id);
            System.out.println(r + "->" + rate + "%");
            idx += 1;
        }
        System.out.println("\n");
    }
}
