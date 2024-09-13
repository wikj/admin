package com.aircraft.project.common;

import com.aircraft.common.constant.UserConstants;
import com.aircraft.framework.security.LoginBody;
import com.aircraft.framework.security.service.SysLoginService;
import com.aircraft.framework.web.controller.BaseController;
import com.aircraft.framework.web.domain.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController extends BaseController {
    @Resource
    private SysLoginService loginService;

    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public R<String> login(@RequestBody LoginBody loginBody)
    {
        if(!UserConstants.LOGIN_TYPE.contains(loginBody.getType())){
            return R.fail("登录类型错误");
        }
        // 生成令牌
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
                loginBody.getUuid(),loginBody.getType());
        return R.ok(token);
    }
}
