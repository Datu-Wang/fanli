package com.datu.fanli.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class SkuInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.id
     *
     * @mbg.generated
     */
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.product_id
     *
     * @mbg.generated
     */
    @Column
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.price
     *
     * @mbg.generated
     */
    @Column
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.sku_name
     *
     * @mbg.generated
     */
    @Column
    private String skuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.sku_desc
     *
     * @mbg.generated
     */
    @Column
    private String skuDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.weight
     *
     * @mbg.generated
     */
    @Column
    private Double weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.tm_id
     *
     * @mbg.generated
     */
    @Column
    private String tmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.catalog3_id
     *
     * @mbg.generated
     */
    @Column
    private String catalog3Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_sku_info.sku_default_img
     *
     * @mbg.generated
     */
    @Column
    private String skuDefaultImg;

    @Transient
    private List<SkuAttrValue> skuAttrValueList;

    @Transient
    private List<SkuSaleAttrValue> skuSaleAttrValueList;

    public List<SkuAttrValue> getSkuAttrValueList() {
        return skuAttrValueList;
    }

    public void setSkuAttrValueList(List<SkuAttrValue> skuAttrValueList) {
        this.skuAttrValueList = skuAttrValueList;
    }

    public List<SkuSaleAttrValue> getSkuSaleAttrValueList() {
        return skuSaleAttrValueList;
    }

    public void setSkuSaleAttrValueList(List<SkuSaleAttrValue> skuSaleAttrValueList) {
        this.skuSaleAttrValueList = skuSaleAttrValueList;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public SkuInfo(Long id, String productId, Double price, String skuName, String skuDesc, Double weight, String tmId, String catalog3Id, String skuDefaultImg) {
        this.id = id;
        this.productId = productId;
        this.price = price;
        this.skuName = skuName;
        this.skuDesc = skuDesc;
        this.weight = weight;
        this.tmId = tmId;
        this.catalog3Id = catalog3Id;
        this.skuDefaultImg = skuDefaultImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    public SkuInfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.id
     *
     * @return the value of pms_sku_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.id
     *
     * @param id the value for pms_sku_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.product_id
     *
     * @return the value of pms_sku_info.product_id
     *
     * @mbg.generated
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.product_id
     *
     * @param productId the value for pms_sku_info.product_id
     *
     * @mbg.generated
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.price
     *
     * @return the value of pms_sku_info.price
     *
     * @mbg.generated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.price
     *
     * @param price the value for pms_sku_info.price
     *
     * @mbg.generated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.sku_name
     *
     * @return the value of pms_sku_info.sku_name
     *
     * @mbg.generated
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.sku_name
     *
     * @param skuName the value for pms_sku_info.sku_name
     *
     * @mbg.generated
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.sku_desc
     *
     * @return the value of pms_sku_info.sku_desc
     *
     * @mbg.generated
     */
    public String getSkuDesc() {
        return skuDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.sku_desc
     *
     * @param skuDesc the value for pms_sku_info.sku_desc
     *
     * @mbg.generated
     */
    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.weight
     *
     * @return the value of pms_sku_info.weight
     *
     * @mbg.generated
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.weight
     *
     * @param weight the value for pms_sku_info.weight
     *
     * @mbg.generated
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.tm_id
     *
     * @return the value of pms_sku_info.tm_id
     *
     * @mbg.generated
     */
    public String getTmId() {
        return tmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.tm_id
     *
     * @param tmId the value for pms_sku_info.tm_id
     *
     * @mbg.generated
     */
    public void setTmId(String tmId) {
        this.tmId = tmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.catalog3_id
     *
     * @return the value of pms_sku_info.catalog3_id
     *
     * @mbg.generated
     */
    public String getCatalog3Id() {
        return catalog3Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.catalog3_id
     *
     * @param catalog3Id the value for pms_sku_info.catalog3_id
     *
     * @mbg.generated
     */
    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_sku_info.sku_default_img
     *
     * @return the value of pms_sku_info.sku_default_img
     *
     * @mbg.generated
     */
    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_sku_info.sku_default_img
     *
     * @param skuDefaultImg the value for pms_sku_info.sku_default_img
     *
     * @mbg.generated
     */
    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
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
        sb.append(", price=").append(price);
        sb.append(", skuName=").append(skuName);
        sb.append(", skuDesc=").append(skuDesc);
        sb.append(", weight=").append(weight);
        sb.append(", tmId=").append(tmId);
        sb.append(", catalog3Id=").append(catalog3Id);
        sb.append(", skuDefaultImg=").append(skuDefaultImg);
        sb.append("]");
        return sb.toString();
    }
}