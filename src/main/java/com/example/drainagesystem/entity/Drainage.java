package com.example.drainagesystem.entity;

public class Drainage {


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drainage_info.d_id
     *
     * @mbggenerated
     */
    private Integer dId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drainage_info.d_province
     *
     * @mbggenerated
     */
    private String dProvince;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drainage_info.d_company_name
     *
     * @mbggenerated
     */
    private String dCompanyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drainage_info.d_pn
     *
     * @mbggenerated
     */
    private String dPn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drainage_info.d_id
     *
     * @return the value of drainage_info.d_id
     *
     * @mbggenerated
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drainage_info.d_id
     *
     * @param dId the value for drainage_info.d_id
     *
     * @mbggenerated
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drainage_info.d_province
     *
     * @return the value of drainage_info.d_province
     *
     * @mbggenerated
     */
    public String getdProvince() {
        return dProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drainage_info.d_province
     *
     * @param dProvince the value for drainage_info.d_province
     *
     * @mbggenerated
     */
    public void setdProvince(String dProvince) {
        this.dProvince = dProvince == null ? null : dProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drainage_info.d_company_name
     *
     * @return the value of drainage_info.d_company_name
     *
     * @mbggenerated
     */
    public String getdCompanyName() {
        return dCompanyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drainage_info.d_company_name
     *
     * @param dCompanyName the value for drainage_info.d_company_name
     *
     * @mbggenerated
     */
    public void setdCompanyName(String dCompanyName) {
        this.dCompanyName = dCompanyName == null ? null : dCompanyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drainage_info.d_pn
     *
     * @return the value of drainage_info.d_pn
     *
     * @mbggenerated
     */
    public String getdPn() {
        return dPn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drainage_info.d_pn
     *
     * @param dPn the value for drainage_info.d_pn
     *
     * @mbggenerated
     */
    public void setdPn(String dPn) {
        this.dPn = dPn == null ? null : dPn.trim();
    }
}