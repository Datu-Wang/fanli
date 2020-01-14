package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.BaseCatalog3;
import com.datu.fanli.bean.BaseCatalog3Example;
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

public interface BaseCatalog3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @SelectProvider(type=BaseCatalog3SqlProvider.class, method="countByExample")
    long countByExample(BaseCatalog3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @DeleteProvider(type=BaseCatalog3SqlProvider.class, method="deleteByExample")
    int deleteByExample(BaseCatalog3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pms_base_catalog3",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pms_base_catalog3 (name, catalog2_id)",
        "values (#{name,jdbcType=VARCHAR}, #{catalog2Id,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(BaseCatalog3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @InsertProvider(type=BaseCatalog3SqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(BaseCatalog3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @SelectProvider(type=BaseCatalog3SqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="catalog2_id", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<BaseCatalog3> selectByExample(BaseCatalog3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, name, catalog2_id",
        "from pms_base_catalog3",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="catalog2_id", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    BaseCatalog3 selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BaseCatalog3SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BaseCatalog3 record, @Param("example") BaseCatalog3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BaseCatalog3SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BaseCatalog3 record, @Param("example") BaseCatalog3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BaseCatalog3SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BaseCatalog3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_catalog3
     *
     * @mbg.generated
     */
    @Update({
        "update pms_base_catalog3",
        "set name = #{name,jdbcType=VARCHAR},",
          "catalog2_id = #{catalog2Id,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(BaseCatalog3 record);
}