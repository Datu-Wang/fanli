package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.ProductImage;
import com.datu.fanli.bean.ProductImageExample;
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

/**
 * @author: datu
 * @date: 2020/1/15
 */
public interface ProductImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductImageSqlProvider.class, method="countByExample")
    long countByExample(ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @DeleteProvider(type=ProductImageSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pms_product_image",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pms_product_image (product_id, img_name, ",
        "img_url)",
        "values (#{productId,jdbcType=BIGINT}, #{imgName,jdbcType=VARCHAR}, ",
        "#{imgUrl,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(ProductImage record);

    /**
     * 带id插入
     * @param record
     * @return
     */
    @Insert({
            "insert into pms_product_image (id, product_id, img_name, ",
            "img_url)",
            "values (#{id,jdbcType=BIGINT}, #{productId,jdbcType=BIGINT}, #{imgName,jdbcType=VARCHAR}, ",
            "#{imgUrl,jdbcType=VARCHAR})"
    })
    int insertWithId(ProductImage record);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @InsertProvider(type=ProductImageSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductImageSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="product_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="img_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="img_url", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ProductImage> selectByExample(ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, product_id, img_name, img_url",
        "from pms_product_image",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="product_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="img_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="img_url", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ProductImage selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductImageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ProductImage record, @Param("example") ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductImageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ProductImage record, @Param("example") ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductImageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbg.generated
     */
    @Update({
        "update pms_product_image",
        "set product_id = #{productId,jdbcType=BIGINT},",
          "img_name = #{imgName,jdbcType=VARCHAR},",
          "img_url = #{imgUrl,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ProductImage record);
}