package com.datu.fanli.bean;

import java.io.Serializable;

public class ProductSaleAttrValue implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_sale_attr_value.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_sale_attr_value.product_id
     *
     * @mbg.generated
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_sale_attr_value.sale_attr_id
     *
     * @mbg.generated
     */
    private String saleAttrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_sale_attr_value.sale_attr_value_name
     *
     * @mbg.generated
     */
    private String saleAttrValueName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    public ProductSaleAttrValue(String id, String productId, String saleAttrId, String saleAttrValueName) {
        this.id = id;
        this.productId = productId;
        this.saleAttrId = saleAttrId;
        this.saleAttrValueName = saleAttrValueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    public ProductSaleAttrValue() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_sale_attr_value.id
     *
     * @return the value of pms_product_sale_attr_value.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_sale_attr_value.id
     *
     * @param id the value for pms_product_sale_attr_value.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_sale_attr_value.product_id
     *
     * @return the value of pms_product_sale_attr_value.product_id
     *
     * @mbg.generated
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_sale_attr_value.product_id
     *
     * @param productId the value for pms_product_sale_attr_value.product_id
     *
     * @mbg.generated
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_sale_attr_value.sale_attr_id
     *
     * @return the value of pms_product_sale_attr_value.sale_attr_id
     *
     * @mbg.generated
     */
    public String getSaleAttrId() {
        return saleAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_sale_attr_value.sale_attr_id
     *
     * @param saleAttrId the value for pms_product_sale_attr_value.sale_attr_id
     *
     * @mbg.generated
     */
    public void setSaleAttrId(String saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_sale_attr_value.sale_attr_value_name
     *
     * @return the value of pms_product_sale_attr_value.sale_attr_value_name
     *
     * @mbg.generated
     */
    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_sale_attr_value.sale_attr_value_name
     *
     * @param saleAttrValueName the value for pms_product_sale_attr_value.sale_attr_value_name
     *
     * @mbg.generated
     */
    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
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
        sb.append(", productId=").append(productId);
        sb.append(", saleAttrId=").append(saleAttrId);
        sb.append(", saleAttrValueName=").append(saleAttrValueName);
        sb.append("]");
        return sb.toString();
    }
}