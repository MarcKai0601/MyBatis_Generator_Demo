package com.example.myBatisGenerator;

import com.example.myBatisGenerator.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Apr 30 18:13:11 CST 2024
     */
    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Apr 30 18:13:11 CST 2024
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Apr 30 18:13:11 CST 2024
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Apr 30 18:13:11 CST 2024
     */
    User selectByPrimaryKey(@Param("host") String host, @Param("user") String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Apr 30 18:13:11 CST 2024
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Apr 30 18:13:11 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Apr 30 18:13:11 CST 2024
     */
    int updateByPrimaryKey(User record);
}