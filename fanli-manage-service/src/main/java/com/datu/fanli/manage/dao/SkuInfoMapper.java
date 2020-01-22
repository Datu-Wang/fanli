package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.SkuInfo;
import com.datu.fanli.bean.SkuInfoExample;
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

public interface SkuInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @SelectProvider(type=SkuInfoSqlProvider.class, method="countByExample")
    long countByExample(SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @DeleteProvider(type=SkuInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pms_sku_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pms_sku_info (product_id, price, ",
        "sku_name, sku_desc, ",
        "weight, tm_id, catalog3_id, ",
        "sku_default_img)",
        "values (#{productId,jdbcType=BIGINT}, #{price,jdbcType=DOUBLE}, ",
        "#{skuName,jdbcType=VARCHAR}, #{skuDesc,jdbcType=VARCHAR}, ",
        "#{weight,jdbcType=DOUBLE}, #{tmId,jdbcType=BIGINT}, #{catalog3Id,jdbcType=BIGINT}, ",
        "#{skuDefaultImg,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(SkuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @InsertProvider(type=SkuInfoSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(SkuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @SelectProvider(type=SkuInfoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="product_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="price", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="sku_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sku_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="weight", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="tm_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="catalog3_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sku_default_img", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SkuInfo> selectByExample(SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, product_id, price, sku_name, sku_desc, weight, tm_id, catalog3_id, sku_default_img",
        "from pms_sku_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="product_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="price", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="sku_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sku_desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="weight", javaType=Double.class, jdbcType=JdbcType.DOUBLE),
        @Arg(column="tm_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="catalog3_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sku_default_img", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    SkuInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SkuInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SkuInfo record, @Param("example") SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SkuInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SkuInfo record, @Param("example") SkuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @UpdateProvider(type=SkuInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SkuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_sku_info
     *
     * @mbg.generated
     */
    @Update({
        "update pms_sku_info",
        "set product_id = #{productId,jdbcType=BIGINT},",
          "price = #{price,jdbcType=DOUBLE},",
          "sku_name = #{skuName,jdbcType=VARCHAR},",
          "sku_desc = #{skuDesc,jdbcType=VARCHAR},",
          "weight = #{weight,jdbcType=DOUBLE},",
          "tm_id = #{tmId,jdbcType=BIGINT},",
          "catalog3_id = #{catalog3Id,jdbcType=BIGINT},",
          "sku_default_img = #{skuDefaultImg,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SkuInfo record);
}