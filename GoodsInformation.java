package com.suka.zgyh.entity;
stdwieroqwir

import java.math.BigDecimal;
import java.util.Date;

/**
 * InnoDB free: 164864 kB
 * @author hjh
 * @version 1.0 2017-12-28
 */
public class GoodsInformation {
    private Integer id;

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品所属大类
     */
    private String goodsBigClass;

    /**
     * 商品所属子类
     */
    private String goodsSmallClass;

    /**
     * 可使用商户
     */
    private String merchantsId;

    /**
     * 价格
     */
    private BigDecimal sellPrice;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 有效期开始时间
     */
    private Date startTime;

    /**
     * 有效期结束时间
     */
    private Date endTime;

    /**
     * 秒杀标识0：不秒杀，1：秒杀
     */
    private Integer secondsKill;

    /**
     * 商品描述1
     */
    private String describe1;

    /**
     * 商品描述2
     */
    private String describe2;

    /**
     * 商品描述3
     */
    private String describe3;

    /**
     * 商品描述4
     */
    private String describe4;

    /**
     * 商品描述5
     */
    private String describe5;

    /**
     * 商品描述6
     */
    private String describe6;

    /**
     * 商品描述7
     */
    private String describe7;

    /**
     * 商品描述8
     */
    private String describe8;

    /**
     * 商品描述9
     */
    private String describe9;

    /**
     * 商品描述10
     */
    private String describe10;

    /**
     * 预留域1
     */
    private String expand1;

    /**
     * 预留域2
     */
    private String expand2;

    /**
     * 预留域3
     */
    private String expand3;
    /**
     * 现金券0: 积分券1:
     */
    private Integer expand4;

    public Integer getExpand4() {
		return expand4;
	}

	public void setExpand4(Integer expand4) {
		this.expand4 = expand4;
	}

	/**
     * 获取 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 商品ID
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置 商品ID
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * 获取 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 获取 商品所属大类
     */
    public String getGoodsBigClass() {
        return goodsBigClass;
    }

    /**
     * 设置 商品所属大类
     */
    public void setGoodsBigClass(String goodsBigClass) {
        this.goodsBigClass = goodsBigClass == null ? null : goodsBigClass.trim();
    }

    /**
     * 获取 商品所属子类
     */
    public String getGoodsSmallClass() {
        return goodsSmallClass;
    }

    /**
     * 设置 商品所属子类
     */
    public void setGoodsSmallClass(String goodsSmallClass) {
        this.goodsSmallClass = goodsSmallClass == null ? null : goodsSmallClass.trim();
    }

    /**
     * 获取 可使用商户
     */
    public String getMerchantsId() {
        return merchantsId;
    }

    /**
     * 设置 可使用商户
     */
    public void setMerchantsId(String merchantsId) {
        this.merchantsId = merchantsId == null ? null : merchantsId.trim();
    }

    /**
     * 获取 价格
     */
    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    /**
     * 设置 价格
     */
    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * 获取 积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 设置 积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 获取 有效期开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置 有效期开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取 有效期结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置 有效期结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取 秒杀标识0：不秒杀，1：秒杀
     */
    public Integer getSecondsKill() {
        return secondsKill;
    }

    /**
     * 设置 秒杀标识0：不秒杀，1：秒杀
     */
    public void setSecondsKill(Integer secondsKill) {
        this.secondsKill = secondsKill;
    }

    /**
     * 获取 商品描述1
     */
    public String getDescribe1() {
        return describe1;
    }

    /**
     * 设置 商品描述1
     */
    public void setDescribe1(String describe1) {
        this.describe1 = describe1 == null ? null : describe1.trim();
    }

    /**
     * 获取 商品描述2
     */
    public String getDescribe2() {
        return describe2;
    }

    /**
     * 设置 商品描述2
     */
    public void setDescribe2(String describe2) {
        this.describe2 = describe2 == null ? null : describe2.trim();
    }

    /**
     * 获取 商品描述3
     */
    public String getDescribe3() {
        return describe3;
    }

    /**
     * 设置 商品描述3
     */
    public void setDescribe3(String describe3) {
        this.describe3 = describe3 == null ? null : describe3.trim();
    }

    /**
     * 获取 商品描述4
     */
    public String getDescribe4() {
        return describe4;
    }

    /**
     * 设置 商品描述4
     */
    public void setDescribe4(String describe4) {
        this.describe4 = describe4 == null ? null : describe4.trim();
    }

    /**
     * 获取 商品描述5
     */
    public String getDescribe5() {
        return describe5;
    }

    /**
     * 设置 商品描述5
     */
    public void setDescribe5(String describe5) {
        this.describe5 = describe5 == null ? null : describe5.trim();
    }

    /**
     * 获取 商品描述6
     */
    public String getDescribe6() {
        return describe6;
    }

    /**
     * 设置 商品描述6
     */
    public void setDescribe6(String describe6) {
        this.describe6 = describe6 == null ? null : describe6.trim();
    }

    /**
     * 获取 商品描述7
     */
    public String getDescribe7() {
        return describe7;
    }

    /**
     * 设置 商品描述7
     */
    public void setDescribe7(String describe7) {
        this.describe7 = describe7 == null ? null : describe7.trim();
    }

    /**
     * 获取 商品描述8
     */
    public String getDescribe8() {
        return describe8;
    }

    /**
     * 设置 商品描述8
     */
    public void setDescribe8(String describe8) {
        this.describe8 = describe8 == null ? null : describe8.trim();
    }

    /**
     * 获取 商品描述9
     */
    public String getDescribe9() {
        return describe9;
    }

    /**
     * 设置 商品描述9
     */
    public void setDescribe9(String describe9) {
        this.describe9 = describe9 == null ? null : describe9.trim();
    }

    /**
     * 获取 商品描述10
     */
    public String getDescribe10() {
        return describe10;
    }

    /**
     * 设置 商品描述10
     */
    public void setDescribe10(String describe10) {
        this.describe10 = describe10 == null ? null : describe10.trim();
    }

    /**
     * 获取 预留域1
     */
    public String getExpand1() {
        return expand1;
    }

    /**
     * 设置 预留域1
     */
    public void setExpand1(String expand1) {
        this.expand1 = expand1 == null ? null : expand1.trim();
    }

    /**
     * 获取 预留域2
     */
    public String getExpand2() {
        return expand2;
    }

    /**
     * 设置 预留域2
     */
    public void setExpand2(String expand2) {
        this.expand2 = expand2 == null ? null : expand2.trim();
    }

    /**
     * 获取 预留域3
     */
    public String getExpand3() {
        return expand3;
    }

    /**
     * 设置 预留域3
     */
    public void setExpand3(String expand3) {
        this.expand3 = expand3 == null ? null : expand3.trim();
    }

	@Override
	public String toString() {
		return "GoodsInformation [id=" + id + ", goodsId=" + goodsId
				+ ", goodsName=" + goodsName + ", goodsBigClass="
				+ goodsBigClass + ", goodsSmallClass=" + goodsSmallClass
				+ ", merchantsId=" + merchantsId + ", sellPrice=" + sellPrice
				+ ", integral=" + integral + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", secondsKill=" + secondsKill
				+ ", describe1=" + describe1 + ", describe2=" + describe2
				+ ", describe3=" + describe3 + ", describe4=" + describe4
				+ ", describe5=" + describe5 + ", describe6=" + describe6
				+ ", describe7=" + describe7 + ", describe8=" + describe8
				+ ", describe9=" + describe9 + ", describe10=" + describe10
				+ ", expand1=" + expand1 + ", expand2=" + expand2
				+ ", expand3=" + expand3 + ", expand4=" + expand4 + "]";
	}
}