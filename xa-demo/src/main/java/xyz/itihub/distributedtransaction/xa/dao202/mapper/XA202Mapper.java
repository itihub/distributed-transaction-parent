package xyz.itihub.distributedtransaction.xa.dao202.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.itihub.distributedtransaction.xa.dao202.model.XA202;
import xyz.itihub.distributedtransaction.xa.dao202.model.XA202Example;

public interface XA202Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    long countByExample(XA202Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    int deleteByExample(XA202Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    int insert(XA202 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    int insertSelective(XA202 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    List<XA202> selectByExample(XA202Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    XA202 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    int updateByExampleSelective(@Param("record") XA202 record, @Param("example") XA202Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    int updateByExample(@Param("record") XA202 record, @Param("example") XA202Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    int updateByPrimaryKeySelective(XA202 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xa_202
     *
     * @mbg.generated Sun Jul 26 13:10:05 CST 2020
     */
    int updateByPrimaryKey(XA202 record);
}