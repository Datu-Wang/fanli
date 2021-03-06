package com.datu.fanli.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: datu
 * @date: 2020/1/11
 */
public class BaseCatalog1 implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_base_catalog1.id
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
     * This field corresponds to the database column pms_base_catalog1.name
     *
     * @mbg.generated
     */
    @Column
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_base_catalog1
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog1
     *
     * @mbg.generated
     */
    public BaseCatalog1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog1
     *
     * @mbg.generated
     */
    public BaseCatalog1() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_catalog1.id
     *
     * @return the value of pms_base_catalog1.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_catalog1.id
     *
     * @param id the value for pms_base_catalog1.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_base_catalog1.name
     *
     * @return the value of pms_base_catalog1.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_base_catalog1.name
     *
     * @param name the value for pms_base_catalog1.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog1
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
        sb.append("]");
        return sb.toString();
    }
}