package com.roku.cloudgo.service;

import org.springframework.stereotype.Service;

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

    public void logout(HttpSession session)
    {
        session.removeAttribute("userName");
    }
}
