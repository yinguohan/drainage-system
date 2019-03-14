package com.example.drainagesystem.dao;

import com.example.drainagesystem.entity.Seller;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerMapper {
    List<String> getCompanyName(@Param("province") String province);
    Seller getSelectSeller(@Param("resultCompany") String resultCompany);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_info
     *
     * @mbggenerated
     */
    int insert(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_info
     *
     * @mbggenerated
     */
    int insertSelective(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_info
     *
     * @mbggenerated
     */
//    Seller selectByPrimaryKey(Integer sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Seller record);
}