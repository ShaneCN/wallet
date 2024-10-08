package com.cobo.wallet.infras.dao.entity;

import lombok.Builder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Builder
public class UserAccountDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.user_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.gmt_create
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.gmt_modified
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account.currency
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_account
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.id
     *
     * @return the value of user_account.id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.id
     *
     * @param id the value for user_account.id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.user_id
     *
     * @return the value of user_account.user_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.user_id
     *
     * @param userId the value for user_account.user_id
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.amount
     *
     * @return the value of user_account.amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.amount
     *
     * @param amount the value for user_account.amount
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.gmt_create
     *
     * @return the value of user_account.gmt_create
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.gmt_create
     *
     * @param gmtCreate the value for user_account.gmt_create
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.gmt_modified
     *
     * @return the value of user_account.gmt_modified
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.gmt_modified
     *
     * @param gmtModified the value for user_account.gmt_modified
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account.currency
     *
     * @return the value of user_account.currency
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account.currency
     *
     * @param currency the value for user_account.currency
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
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
        sb.append(", userId=").append(userId);
        sb.append(", amount=").append(amount);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", currency=").append(currency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
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
        UserAccountDO other = (UserAccountDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbg.generated Fri Aug 09 22:55:58 CST 2024
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        return result;
    }
}