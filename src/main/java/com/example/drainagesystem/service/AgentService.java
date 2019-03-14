package com.example.drainagesystem.service;

import com.example.drainagesystem.entity.Seller;

import java.util.Map;


public interface AgentService {
    Map<Integer,Seller> getSeller(String sn, String province);
}
