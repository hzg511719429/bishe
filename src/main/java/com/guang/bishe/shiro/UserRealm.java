package com.guang.bishe.shiro;

import com.guang.bishe.domain.User;
import com.guang.bishe.service.LoginService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: UserRealm
 * @Author: guang
 * @CreateDate: 2019/3/29 0:29
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private LoginService loginService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String email = (String) authenticationToken.getPrincipal();
        User user = loginService.findUserByEmail(email);
        String psw = user.getUserPassword();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(email, psw, this.getName());
        return info;
    }
}
