package com.datu.fanli.bean;

import java.io.Serializable;

public class SkuSaleAttrValue implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.sku_id
     *
     * @mbg.generated
     */
    private String skuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.sale_attr_id
     *
     * @mbg.generated
     */
    private String saleAttrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.sale_attr_value_id
     *
     * @mbg.generated
     */
    private String saleAttrValueId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.sale_attr_name
     *
     * @mbg.generated
     */
    private String saleAttrName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_sale_attr_value.sale_attr_value_name
     *
     * @mbg.generated
     */
    private String saleAttrValueName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public SkuSaleAttrValue(Long id, String skuId, String saleAttrId, String saleAttrValueId, String saleAttrName, String saleAttrValueName) {
        this.id = id;
        this.skuId = skuId;
        this.saleAttrId = saleAttrId;
        this.saleAttrValueId = saleAttrValueId;
        this.saleAttrName = saleAttrName;
        this.saleAttrValueName = saleAttrValueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    public SkuSaleAttrValue() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.id
     *
     * @return the value of pms_sku_sale_attr_value.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.id
     *
     * @param id the value for pms_sku_sale_attr_value.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.sku_id
     *
     * @return the value of pms_sku_sale_attr_value.sku_id
     *
     * @mbg.generated
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.sku_id
     *
     * @param skuId the value for pms_sku_sale_attr_value.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.sale_attr_id
     *
     * @return the value of pms_sku_sale_attr_value.sale_attr_id
     *
     * @mbg.generated
     */
    public String getSaleAttrId() {
        return saleAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.sale_attr_id
     *
     * @param saleAttrId the value for pms_sku_sale_attr_value.sale_attr_id
     *
     * @mbg.generated
     */
    public void setSaleAttrId(String saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.sale_attr_value_id
     *
     * @return the value of pms_sku_sale_attr_value.sale_attr_value_id
     *
     * @mbg.generated
     */
    public String getSaleAttrValueId() {
        return saleAttrValueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.sale_attr_value_id
     *
     * @param saleAttrValueId the value for pms_sku_sale_attr_value.sale_attr_value_id
     *
     * @mbg.generated
     */
    public void setSaleAttrValueId(String saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.sale_attr_name
     *
     * @return the value of pms_sku_sale_attr_value.sale_attr_name
     *
     * @mbg.generated
     */
    public String getSaleAttrName() {
        return saleAttrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.sale_attr_name
     *
     * @param saleAttrName the value for pms_sku_sale_attr_value.sale_attr_name
     *
     * @mbg.generated
     */
    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_sale_attr_value.sale_attr_value_name
     *
     * @return the value of pms_sku_sale_attr_value.sale_attr_value_name
     *
     * @mbg.generated
     */
    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_sale_attr_value.sale_attr_value_name
     *
     * @param saleAttrValueName the value for pms_sku_sale_attr_value.sale_attr_value_name
     *
     * @mbg.generated
     */
    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", saleAttrId=").append(saleAttrId);
        sb.append(", saleAttrValueId=").append(saleAttrValueId);
        sb.append(", saleAttrName=").append(saleAttrName);
        sb.append(", saleAttrValueName=").append(saleAttrValueName);
        sb.append("]");
        return sb.toString();
    }
}