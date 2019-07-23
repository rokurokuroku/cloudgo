package com.roku.cloudgo.mapper;

import com.roku.cloudgo.pojo.BankRecord;
import com.roku.cloudgo.pojo.BankRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankRecordMapper {
    int countByExample(BankRecordExample example);

    int deleteByExample(BankRecordExample example);

    int insert(BankRecord record);

    int insertSelective(BankRecord record);

    List<BankRecord> selectByExample(BankRecordExample example);

    int updateByExampleSelective(@Param("record") BankRecord record, @Param("example") BankRecordExample example);

    int updateByExample(@Param("record") BankRecord record, @Param("example") BankRecordExample example);
}