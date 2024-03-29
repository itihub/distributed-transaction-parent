package xyz.itihub.distributedtransaction.localmsg.dao202.model;

import java.util.Date;

public class PaymentMsg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_msg.id
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_msg.order_id
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_msg.status
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_msg.falure_cnt
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    private Integer falureCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_msg.create_time
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_msg.create_user
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    private Integer createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_msg.update_time
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_msg.update_user
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    private Integer updateUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_msg.id
     *
     * @return the value of payment_msg.id
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_msg.id
     *
     * @param id the value for payment_msg.id
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_msg.order_id
     *
     * @return the value of payment_msg.order_id
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_msg.order_id
     *
     * @param orderId the value for payment_msg.order_id
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_msg.status
     *
     * @return the value of payment_msg.status
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_msg.status
     *
     * @param status the value for payment_msg.status
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_msg.falure_cnt
     *
     * @return the value of payment_msg.falure_cnt
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public Integer getFalureCnt() {
        return falureCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_msg.falure_cnt
     *
     * @param falureCnt the value for payment_msg.falure_cnt
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public void setFalureCnt(Integer falureCnt) {
        this.falureCnt = falureCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_msg.create_time
     *
     * @return the value of payment_msg.create_time
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_msg.create_time
     *
     * @param createTime the value for payment_msg.create_time
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_msg.create_user
     *
     * @return the value of payment_msg.create_user
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_msg.create_user
     *
     * @param createUser the value for payment_msg.create_user
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_msg.update_time
     *
     * @return the value of payment_msg.update_time
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_msg.update_time
     *
     * @param updateTime the value for payment_msg.update_time
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_msg.update_user
     *
     * @return the value of payment_msg.update_user
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_msg.update_user
     *
     * @param updateUser the value for payment_msg.update_user
     *
     * @mbg.generated Sun Jul 26 18:33:41 CST 2020
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}