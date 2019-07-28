package com.roku.cloudgo.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class SessionService {
    public Object getAttr(HttpSession session, String attr)
    {
        Object tmp = session.getAttribute(attr);
        if(tmp==null)
        {
            return null;
        }
        else
        {
            return tmp;
        }
    }

    public void setLoginUser(HttpSession session, String userName)
    {
        session.setAttribute("userName", userName);
    }

    public void setLoginSeller(HttpSession session, String sellerName)
    {
        session.setAttribute("sellerName", sellerName);
    }

    public void logout(HttpSession session)
    {
        session.removeAttribute("userName");
        session.removeAttribute("sellerName");
    }

    public boolean checkLogin(HttpSession session)
    {
        // 检查session确认是否登录
        String userName = (String)getAttr(session, "userName");
        String sellerName = (String)getAttr(session, "sellerName");
        if(userName==null && sellerName==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean checkUserLogin(HttpSession session)
    {
        // 检查session确认是否登录user
        String userName = (String)getAttr(session, "userName");
        if(userName==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean checkSellerLogin(HttpSession session)
    {
        // 检查session确认是否登录seller
        String sellerName = (String)getAttr(session, "sellerName");
        if(sellerName==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
