package com.datu.fanli.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class SkuAttrValue implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_attr_value.id
     *
     * @mbg.generated
     */
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_attr_value.attr_id
     *
     * @mbg.generated
     */
    @Column
    private String attrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_attr_value.value_id
     *
     * @mbg.generated
     */
    @Column
    private String valueId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_attr_value.sku_id
     *
     * @mbg.generated
     */
    @Column
    private String skuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_sku_attr_value
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_attr_value
     *
     * @mbg.generated
     */
    public SkuAttrValue(String id, String attrId, String valueId, String skuId) {
        this.id = id;
        this.attrId = attrId;
        this.valueId = valueId;
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_attr_value
     *
     * @mbg.generated
     */
    public SkuAttrValue() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_attr_value.id
     *
     * @return the value of pms_sku_attr_value.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_attr_value.id
     *
     * @param id the value for pms_sku_attr_value.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_attr_value.attr_id
     *
     * @return the value of pms_sku_attr_value.attr_id
     *
     * @mbg.generated
     */
    public String getAttrId() {
        return attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_attr_value.attr_id
     *
     * @param attrId the value for pms_sku_attr_value.attr_id
     *
     * @mbg.generated
     */
    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_attr_value.value_id
     *
     * @return the value of pms_sku_attr_value.value_id
     *
     * @mbg.generated
     */
    public String getValueId() {
        return valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_attr_value.value_id
     *
     * @param valueId the value for pms_sku_attr_value.value_id
     *
     * @mbg.generated
     */
    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_attr_value.sku_id
     *
     * @return the value of pms_sku_attr_value.sku_id
     *
     * @mbg.generated
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_attr_value.sku_id
     *
     * @param skuId the value for pms_sku_attr_value.sku_id
     *
     * @mbg.generated
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_attr_value
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
        sb.append(", attrId=").append(attrId);
        sb.append(", valueId=").append(valueId);
        sb.append(", skuId=").append(skuId);
        sb.append("]");
        return sb.toString();
    }
}