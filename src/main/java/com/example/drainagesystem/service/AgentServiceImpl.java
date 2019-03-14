package com.example.drainagesystem.service;

import com.example.drainagesystem.dao.AgentMapper;
import com.example.drainagesystem.dao.DrainageMapper;
import com.example.drainagesystem.dao.SellerMapper;
import com.example.drainagesystem.entity.Agent;
import com.example.drainagesystem.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentMapper agentMapper;

    @Autowired
    private DrainageMapper drainageMapper;

    @Autowired
    private SellerMapper sellerMapper;

    @Override
    public Map<Integer, Seller> getSeller(String sn, String province) {
        Map<Integer,Seller> map = new HashMap<>();
        Seller seller = null;
        String resultCompany = null;
        Agent agent = null;
        //获取到Agent表的pn和company
        System.out.println("111"+sn);
        List<Agent> agentList = agentMapper.getSelectAgent(sn);
        System.out.println("agentList="+agentList);
        //agentList不为空且有元素
        if (agentList != null && !agentList.isEmpty()) {
            // map.key = 0
            //获取到agentList的第一个元素
            agent = agentList.get(0);
            String pn = agent.getaPn();
            String company = agent.getaCompanyName();
            System.out.println("company="+company);
            System.out.println("pn:"+pn);
            System.out.println("province:"+province);
            List<String> companyList = drainageMapper.getSelectDrainage(pn, province);
            System.out.println("companyList="+companyList);
            List<String> sellerComanyName = sellerMapper.getCompanyName(province);
            //sellerComanyName =  sellerComanyName.get(0);

            //if (companyList != null && !companyList.isEmpty()) {
            if (sellerComanyName != null) {  // && !companyList.isEmpty()

                if (sellerComanyName.contains(company)) {
                    // 判断3表中是否包含1表的公司
                    resultCompany = company;
                    System.out.println("company1"+company);
                } else if (!companyList.isEmpty()){
                    // 全面引流，默认取第一个
                    resultCompany = companyList.get(0);
                    System.out.println("resultCompany"+resultCompany);
                }
            } else {
                // 在用户所在省份中未找到合适的代理商，则SUBK
                System.out.println("SUBK");

            }
            // 查询表3，获取公司的详细信息返回给前端
            if (!StringUtils.isEmpty(resultCompany)) {
                // 利用公司名，找到表3的信息
                seller = sellerMapper.getSelectSeller(resultCompany);
                System.out.println("seller:"+seller);
            }
            map.put(0,seller);
        } else {
            // SN输入有误的情况, map.key = 1
            System.out.println("11111111");
            map.put(1,null);
        }
        System.out.println("return:"+seller);
        return map;
    }

}
