package com.plyaljx.dao;

import com.plyaljx.entity.sc;

public interface scMapper {
    int deleteByPrimaryKey(String trxTrxSeq);

    int insert(sc record);

    int insertSelective(sc record);

    sc selectByPrimaryKey(String trxTrxSeq);

    int updateByPrimaryKeySelective(sc record);

    int updateByPrimaryKey(sc record);
}