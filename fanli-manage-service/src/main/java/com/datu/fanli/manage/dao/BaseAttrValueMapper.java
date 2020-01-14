package com.datu.fanli.manage.dao;

import com.datu.fanli.bean.BaseAttrValue;
import com.datu.fanli.bean.BaseAttrValueExample;
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

public interface BaseAttrValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @SelectProvider(type=BaseAttrValueSqlProvider.class, method="countByExample")
    long countByExample(BaseAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @DeleteProvider(type=BaseAttrValueSqlProvider.class, method="deleteByExample")
    int deleteByExample(BaseAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @Delete({
        "delete from pms_base_attr_value",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @Insert({
        "insert into pms_base_attr_value (value_name, attr_id, ",
        "is_enabled)",
        "values (#{valueName,jdbcType=VARCHAR}, #{attrId,jdbcType=BIGINT}, ",
        "#{isEnabled,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(BaseAttrValue record);

    /**
     * 已设置id插入
     * @param record
     * @return
     */
    @Insert({
            "insert into pms_base_attr_value (id, value_name, attr_id, ",
            "is_enabled)",
            "values (#{id, jdbcType=BIGINT}, #{valueName,jdbcType=VARCHAR}, #{attrId,jdbcType=BIGINT}, ",
            "#{isEnabled,jdbcType=VARCHAR})"
    })
    int insertWithId(BaseAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @InsertProvider(type=BaseAttrValueSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(BaseAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @SelectProvider(type=BaseAttrValueSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="value_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="attr_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_enabled", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<BaseAttrValue> selectByExample(BaseAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, value_name, attr_id, is_enabled",
        "from pms_base_attr_value",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=String.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="value_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="attr_id", javaType=String.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_enabled", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    BaseAttrValue selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BaseAttrValueSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BaseAttrValue record, @Param("example") BaseAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BaseAttrValueSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BaseAttrValue record, @Param("example") BaseAttrValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BaseAttrValueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BaseAttrValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_base_attr_value
     *
     * @mbg.generated
     */
    @Update({
        "update pms_base_attr_value",
        "set value_name = #{valueName,jdbcType=VARCHAR},",
          "attr_id = #{attrId,jdbcType=BIGINT},",
          "is_enabled = #{isEnabled,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(BaseAttrValue record);

    /**
     * 改变属性值启用状态
     * @param id 属性值id
     * @param isEnabled 是否启用
     * @return 成功码
     */
    @Update({
        "update pms_base_attr_value",
        "set is_enabled = #{isEnabled,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int changeAttrValueStatus(String id, String isEnabled);
}