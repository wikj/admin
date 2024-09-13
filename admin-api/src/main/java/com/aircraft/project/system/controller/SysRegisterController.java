package com.aircraft.project.system.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.aircraft.common.utils.StringUtils;
import com.aircraft.framework.security.RegisterBody;
import com.aircraft.framework.security.service.SysRegisterService;
import com.aircraft.framework.web.controller.BaseController;
import com.aircraft.framework.web.domain.AjaxResult;
import com.aircraft.project.system.service.ISysConfigService;

/**
 * 注册验证
 * 
 
 */
@RestController
public class SysRegisterController extends BaseController
{
    @Resource
    private SysRegisterService registerService;

    @Resource
    private ISysConfigService configService;

    @PostMapping("/register")
    public AjaxResult register(@RequestBody RegisterBody user)
    {
        if (!("true".equals(configService.selectConfigByKey("sys.account.registerUser"))))
        {
            return error("当前系统没有开启注册功能！");
        }
        String msg = registerService.register(user);
        return StringUtils.isEmpty(msg) ? success() : error(msg);
    }
}
