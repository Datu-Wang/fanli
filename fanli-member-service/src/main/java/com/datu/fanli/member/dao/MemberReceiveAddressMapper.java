package com.datu.fanli.member.dao;

import com.datu.fanli.bean.MemberReceiveAddress;
import com.datu.fanli.bean.MemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberReceiveAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    long countByExample(MemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    int deleteByExample(MemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    int insert(MemberReceiveAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    int insertSelective(MemberReceiveAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    List<MemberReceiveAddress> selectByExample(MemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    MemberReceiveAddress selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MemberReceiveAddress record, @Param("example") MemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MemberReceiveAddress record, @Param("example") MemberReceiveAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MemberReceiveAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_receive_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MemberReceiveAddress record);
}