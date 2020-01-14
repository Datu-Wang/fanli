package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.ProductSaleAttrValue;
import com.datu.fanli.bean.ProductSaleAttrValueExample;
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

public interface ProductSaleAttrValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductSaleAttrValueSqlProvider.class, method="countByExample")
    long countByExample(ProductSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @DeleteProvider(type=ProductSaleAttrValueSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProductSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pms_product_sale_attr_value",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pms_product_sale_attr_value (product_id, sale_attr_id, ",
        "sale_attr_value_name)",
        "values (#{productId,jdbcType=BIGINT}, #{saleAttrId,jdbcType=BIGINT}, ",
        "#{saleAttrValueName,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(ProductSaleAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @InsertProvider(type=ProductSaleAttrValueSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(ProductSaleAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductSaleAttrValueSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="product_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_value_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ProductSaleAttrValue> selectByExample(ProductSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, product_id, sale_attr_id, sale_attr_value_name",
        "from pms_product_sale_attr_value",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="product_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_value_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ProductSaleAttrValue selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSaleAttrValueSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ProductSaleAttrValue record, @Param("example") ProductSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSaleAttrValueSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ProductSaleAttrValue record, @Param("example") ProductSaleAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSaleAttrValueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProductSaleAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr_value
     *
     * @mbg.generated
     */
    @Update({
        "update pms_product_sale_attr_value",
        "set product_id = #{productId,jdbcType=BIGINT},",
          "sale_attr_id = #{saleAttrId,jdbcType=BIGINT},",
          "sale_attr_value_name = #{saleAttrValueName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ProductSaleAttrValue record);
}