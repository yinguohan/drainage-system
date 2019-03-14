package com.example.drainagesystem.controller;

import com.example.drainagesystem.entity.Seller;
import com.example.drainagesystem.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/drainage")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @RequestMapping("/seller")
    @ResponseBody
    public Map<Integer,Seller> sellersList(String sn, String province) {
        System.out.println(sn+province);
        return agentService.getSeller(sn, province);
    }
    /*@RequestMapping("/seller")
    @ResponseBody
    public String sellersList(String sn, String province, Model model) {
        Seller seller = agentService.getSeller(sn, province);
            model.addAttribute("seller",seller);
        return "list";
    }*/
}
