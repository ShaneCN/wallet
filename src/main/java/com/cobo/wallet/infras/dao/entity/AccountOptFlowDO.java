package com.cobo.wallet.infras.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AccountOptFlowDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.biz_no
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private String bizNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.user_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.account_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.type
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.after_amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private BigDecimal afterAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.modified_amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private BigDecimal modifiedAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.gmt_create
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.gmt_modified
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_opt_flow.currency
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_opt_flow
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.id
     *
     * @return the value of account_opt_flow.id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.id
     *
     * @param id the value for account_opt_flow.id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.biz_no
     *
     * @return the value of account_opt_flow.biz_no
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public String getBizNo() {
        return bizNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.biz_no
     *
     * @param bizNo the value for account_opt_flow.biz_no
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.user_id
     *
     * @return the value of account_opt_flow.user_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.user_id
     *
     * @param userId the value for account_opt_flow.user_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.account_id
     *
     * @return the value of account_opt_flow.account_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.account_id
     *
     * @param accountId the value for account_opt_flow.account_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.type
     *
     * @return the value of account_opt_flow.type
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.type
     *
     * @param type the value for account_opt_flow.type
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.after_amount
     *
     * @return the value of account_opt_flow.after_amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public BigDecimal getAfterAmount() {
        return afterAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.after_amount
     *
     * @param afterAmount the value for account_opt_flow.after_amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setAfterAmount(BigDecimal afterAmount) {
        this.afterAmount = afterAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.modified_amount
     *
     * @return the value of account_opt_flow.modified_amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public BigDecimal getModifiedAmount() {
        return modifiedAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.modified_amount
     *
     * @param modifiedAmount the value for account_opt_flow.modified_amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setModifiedAmount(BigDecimal modifiedAmount) {
        this.modifiedAmount = modifiedAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.gmt_create
     *
     * @return the value of account_opt_flow.gmt_create
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.gmt_create
     *
     * @param gmtCreate the value for account_opt_flow.gmt_create
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.gmt_modified
     *
     * @return the value of account_opt_flow.gmt_modified
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.gmt_modified
     *
     * @param gmtModified the value for account_opt_flow.gmt_modified
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_opt_flow.currency
     *
     * @return the value of account_opt_flow.currency
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_opt_flow.currency
     *
     * @param currency the value for account_opt_flow.currency
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_opt_flow
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bizNo=").append(bizNo);
        sb.append(", userId=").append(userId);
        sb.append(", accountId=").append(accountId);
        sb.append(", type=").append(type);
        sb.append(", afterAmount=").append(afterAmount);
        sb.append(", modifiedAmount=").append(modifiedAmount);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", currency=").append(currency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_opt_flow
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AccountOptFlowDO other = (AccountOptFlowDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizNo() == null ? other.getBizNo() == null : this.getBizNo().equals(other.getBizNo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getAfterAmount() == null ? other.getAfterAmount() == null : this.getAfterAmount().equals(other.getAfterAmount()))
            && (this.getModifiedAmount() == null ? other.getModifiedAmount() == null : this.getModifiedAmount().equals(other.getModifiedAmount()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_opt_flow
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizNo() == null) ? 0 : getBizNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAfterAmount() == null) ? 0 : getAfterAmount().hashCode());
        result = prime * result + ((getModifiedAmount() == null) ? 0 : getModifiedAmount().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        return result;
    }
}