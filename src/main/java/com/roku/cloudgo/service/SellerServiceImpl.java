package com.roku.cloudgo.service;

import com.roku.cloudgo.DAO.mapper.BankRecordMapper;
import com.roku.cloudgo.DAO.mapper.SellerMapper;
import com.roku.cloudgo.pojo.BankRecord;
import com.roku.cloudgo.pojo.Seller;
import com.roku.cloudgo.pojo.SellerExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {
    @Resource
    private SellerMapper sellerMapper;
    @Resource
    private BankRecordMapper bankRecordMapper;
    @Override
    public boolean checkPassword(String sellerName, String passwd) {
        SellerExample example = new SellerExample();
        example.createCriteria().andSellerNameEqualTo(sellerName).andSellerPasswordEqualTo(passwd);
        return !sellerMapper.selectByExample(example).isEmpty();
    }

    @Override
    public boolean sellerRegister(Seller seller) {
        boolean flag = false;
        int countUser = sellerMapper.insertSelective(seller);
        if(countUser==0)
        {
            flag = false;
        }
        else
        {
            SellerExample example = new SellerExample();
            example.createCriteria().andSellerNameEqualTo(seller.getSellerName());
            Long userId = sellerMapper.selectByExample(example).get(0).getSellerId();

            BankRecord bankRecord = new BankRecord();
            bankRecord.setUserId(userId);
            bankRecord.setPaymentCode("000000");
            int countBank = bankRecordMapper.insertSelective(bankRecord);
            if(countBank==0)
            {
                flag = false;
            }
            else
            {
                flag = true;
            }
        }

        return flag;
    }

    @Override
    public boolean editSeller(Seller seller) {
        SellerExample example = new SellerExample();
        example.createCriteria().andSellerNameEqualTo(seller.getSellerName());
        return sellerMapper.updateByExampleSelective(seller, example)!=0;
    }

    @Override
    public boolean checkSellerName(String sellerName) {
        SellerExample example = new SellerExample();
        example.createCriteria().andSellerNameEqualTo(sellerName);
        return sellerMapper.selectByExample(example).isEmpty();
    }

    @Override
    public Seller getSeller(String name) {
        SellerExample example = new SellerExample();
        example.createCriteria().andSellerNameEqualTo(name);
        List<Seller> userList = sellerMapper.selectByExample(example);
        if(userList.isEmpty())
        {
            return null;
        }
        else
        {
            return userList.get(0);
        }
    }

    @Override
    public Seller getSellerById(Long sellerId) {
        SellerExample example = new SellerExample();
        example.createCriteria().andSellerIdEqualTo(sellerId);
        List<Seller> userList = sellerMapper.selectByExample(example);
        if(userList.isEmpty())
        {
            return null;
        }
        else
        {
            return userList.get(0);
        }
    }
}
