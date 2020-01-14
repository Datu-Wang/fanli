package com.datu.fanli.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class BaseCatalog2 implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_base_catalog2.id
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
     * This field corresponds to the database column pms_base_catalog2.name
     *
     * @mbg.generated
     */
    @Column
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_base_catalog2.catalog1_id
     *
     * @mbg.generated
     */
    @Column
    private Integer catalog1Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_base_catalog2
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog2
     *
     * @mbg.generated
     */
    public BaseCatalog2(String id, String name, Integer catalog1Id) {
        this.id = id;
        this.name = name;
        this.catalog1Id = catalog1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog2
     *
     * @mbg.generated
     */
    public BaseCatalog2() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_catalog2.id
     *
     * @return the value of pms_base_catalog2.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_catalog2.id
     *
     * @param id the value for pms_base_catalog2.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_catalog2.name
     *
     * @return the value of pms_base_catalog2.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_catalog2.name
     *
     * @param name the value for pms_base_catalog2.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_catalog2.catalog1_id
     *
     * @return the value of pms_base_catalog2.catalog1_id
     *
     * @mbg.generated
     */
    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_catalog2.catalog1_id
     *
     * @param catalog1Id the value for pms_base_catalog2.catalog1_id
     *
     * @mbg.generated
     */
    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog2
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
        sb.append(", name=").append(name);
        sb.append(", catalog1Id=").append(catalog1Id);
        sb.append("]");
        return sb.toString();
    }
}