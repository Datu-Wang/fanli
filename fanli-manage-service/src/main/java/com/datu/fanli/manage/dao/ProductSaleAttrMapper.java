package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.ProductSaleAttr;
import com.datu.fanli.bean.ProductSaleAttrExample;
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

public interface ProductSaleAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductSaleAttrSqlProvider.class, method="countByExample")
    long countByExample(ProductSaleAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @DeleteProvider(type=ProductSaleAttrSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProductSaleAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pms_product_sale_attr",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pms_product_sale_attr (product_id, sale_attr_id, ",
        "sale_attr_name)",
        "values (#{productId,jdbcType=BIGINT}, #{saleAttrId,jdbcType=BIGINT}, ",
        "#{saleAttrName,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(ProductSaleAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @InsertProvider(type=ProductSaleAttrSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(ProductSaleAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductSaleAttrSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="product_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ProductSaleAttr> selectByExample(ProductSaleAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, product_id, sale_attr_id, sale_attr_name",
        "from pms_product_sale_attr",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="product_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sale_attr_name", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ProductSaleAttr selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSaleAttrSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ProductSaleAttr record, @Param("example") ProductSaleAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSaleAttrSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ProductSaleAttr record, @Param("example") ProductSaleAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductSaleAttrSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProductSaleAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_sale_attr
     *
     * @mbg.generated
     */
    @Update({
        "update pms_product_sale_attr",
        "set product_id = #{productId,jdbcType=BIGINT},",
          "sale_attr_id = #{saleAttrId,jdbcType=BIGINT},",
          "sale_attr_name = #{saleAttrName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ProductSaleAttr record);
}