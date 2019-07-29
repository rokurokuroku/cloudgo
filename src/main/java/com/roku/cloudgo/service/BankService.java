package com.roku.cloudgo.service;

import com.roku.cloudgo.DAO.mapper.BankRecordMapper;
import com.roku.cloudgo.pojo.BankRecord;
import com.roku.cloudgo.pojo.BankRecordExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BankService {
    @Resource
    private BankRecordMapper bankRecordMapper;
    public BankRecord getBankRecord(Long userId)
    {
        BankRecordExample example = new BankRecordExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<BankRecord> bankRecordList = bankRecordMapper.selectByExample(example);
        if(!bankRecordList.isEmpty())
        {
            return bankRecordList.get(0);
        }
        else
        {
            return null;
        }
    }
    public boolean editBankRecord(BankRecord bankRecord)
    {
        BankRecordExample example = new BankRecordExample();
        example.createCriteria().andUserIdEqualTo(bankRecord.getUserId());
        return bankRecordMapper.updateByExampleSelective(bankRecord, example)!=0;
    }
}
