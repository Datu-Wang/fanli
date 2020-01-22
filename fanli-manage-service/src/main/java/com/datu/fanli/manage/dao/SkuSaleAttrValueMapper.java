package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.SkuSaleAttrValue;
import com.datu.fanli.bean.SkuSaleAttrValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SkuSaleAttrValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @SelectProvider(type=SkuSaleAttrValueSqlProvider.class, method="countByExample")
    long countByExample(SkuSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @DeleteProvider(type=SkuSaleAttrValueSqlProvider.class, method="deleteByExample")
    int deleteByExample(SkuSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pms_sku_sale_attr_value",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pms_sku_sale_attr_value (sku_id, sale_attr_id, ",
        "sale_attr_value_id, sale_attr_name, ",
        "sale_attr_value_name)",
        "values (#{skuId,jdbcType=BIGINT}, #{saleAttrId,jdbcType=BIGINT}, ",
        "#{saleAttrValueId,jdbcType=BIGINT}, #{saleAttrName,jdbcType=VARCHAR}, ",
        "#{saleAttrValueName,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(SkuSaleAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @InsertProvider(type=SkuSaleAttrValueSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(SkuSaleAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @SelectProvider(type=SkuSaleAttrValueSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="sku_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_value_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sale_attr_value_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SkuSaleAttrValue> selectByExample(SkuSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, sku_id, sale_attr_id, sale_attr_value_id, sale_attr_name, sale_attr_value_name",
        "from pms_sku_sale_attr_value",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="sku_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_value_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sale_attr_value_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    SkuSaleAttrValue selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SkuSaleAttrValueSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SkuSaleAttrValue record, @Param("example") SkuSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SkuSaleAttrValueSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SkuSaleAttrValue record, @Param("example") SkuSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SkuSaleAttrValueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SkuSaleAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_sale_attr_value
     *
     * @mbg.generated
     */
    @Update({
        "update pms_sku_sale_attr_value",
        "set sku_id = #{skuId,jdbcType=BIGINT},",
          "sale_attr_id = #{saleAttrId,jdbcType=BIGINT},",
          "sale_attr_value_id = #{saleAttrValueId,jdbcType=BIGINT},",
          "sale_attr_name = #{saleAttrName,jdbcType=VARCHAR},",
          "sale_attr_value_name = #{saleAttrValueName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SkuSaleAttrValue record);
}