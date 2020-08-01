package com.plyaljx.dao;

import com.plyaljx.entity.PtnTrxDat;

public interface PtnTrxDatMapper {
    int deleteByPrimaryKey(String trxTrxSeq);

    int insert(PtnTrxDat record);

    int insertSelective(PtnTrxDat record);

    PtnTrxDat selectByPrimaryKey(String trxTrxSeq);

    int updateByPrimaryKeySelective(PtnTrxDat record);

    int updateByPrimaryKey(PtnTrxDat record);
}