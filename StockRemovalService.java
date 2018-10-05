package com.exercise.test.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.exercise.test.entity.StockRemoval;

public interface StockRemovalService {
	 int deleteByPrimaryKey(Integer id);

	    int insert(StockRemoval record);

	    int insertSelective(StockRemoval record);

	    StockRemoval selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(StockRemoval record);

	    int updateByPrimaryKey(StockRemoval record);

	    List<StockRemoval> selectByObject(StockRemoval record);
	    
	    int updateTable(@Param(value = "goodsNumber") Integer goodsNumber,@Param(value = "id") Integer id);
}
