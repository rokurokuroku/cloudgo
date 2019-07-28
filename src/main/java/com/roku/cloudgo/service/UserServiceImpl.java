package com.roku.cloudgo.service;

import com.roku.cloudgo.DAO.mapper.BankRecordMapper;
import com.roku.cloudgo.DAO.mapper.UserMapper;
import com.roku.cloudgo.pojo.BankRecord;
import com.roku.cloudgo.pojo.User;
import com.roku.cloudgo.pojo.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private BankRecordMapper bankRecordMapper;

    @Override
    public boolean checkPassword(String userName, String passwd) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(passwd);
        return !userMapper.selectByExample(example).isEmpty();
    }

    @Override
    public boolean userRegister(User user, String paymentCode) {
        boolean flag = false;
        int countUser = userMapper.insertSelective(user);
        if(countUser==0)
        {
            flag = false;
        }
        else
        {
            UserExample example = new UserExample();
            example.createCriteria().andUserNameEqualTo(user.getUserName());
            Long userId = userMapper.selectByExample(example).get(0).getUserId();

            BankRecord bankRecord = new BankRecord();
            bankRecord.setUserId(userId);
            bankRecord.setPaymentCode(paymentCode);
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
    public boolean editUser(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(user.getUserName());
        return userMapper.updateByExampleSelective(user, example)!=0;
    }

    @Override
    public boolean checkUserName(String userName) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        return userMapper.selectByExample(example).isEmpty();
    }

    @Override
    public User getUser(String name) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(name);
        List<User> userList = userMapper.selectByExample(example);
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
