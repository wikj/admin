package com.aircraft.project.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aircraft.framework.web.domain.R;
import com.aircraft.project.system.domain.vo.RouterVo;
import org.springframework.web.bind.annotation.*;
import com.aircraft.common.utils.SecurityUtils;
import com.aircraft.framework.security.service.SysPermissionService;
import com.aircraft.project.system.domain.SysMenu;
import com.aircraft.project.system.domain.SysUser;
import com.aircraft.project.system.service.ISysMenuService;

import javax.annotation.Resource;

/**
 * 登录验证
 * 
 
 */
@RestController
public class IndexController {

    @Resource
    private ISysMenuService menuService;

    @Resource
    private SysPermissionService permissionService;


    /**
     * 获取用户信息
     * 
     * @return 用户信息
     */
    @GetMapping("/system/getInfo")
    public R<Map<String,Object>> getInfo()
    {
        SysUser user = SecurityUtils.getLoginUser().getUser();
        // 角色集合
        Set<String> roles = permissionService.getRolePermission(user);
        // 权限集合
        Set<String> permissions = permissionService.getMenuPermission(user);
        return R.ok(new HashMap<String,Object>(){{
            put("user", user);
            put("roles", roles);
            put("permissions", permissions);
        }});
    }

    /**
     * 获取路由信息
     * 
     * @return 路由信息
     */
    @GetMapping("/system/getRouters")
    public R<List<RouterVo>> getRouters()
    {
        Long userId = SecurityUtils.getUserId();
        List<SysMenu> menus = menuService.selectMenuTreeByUserId(userId);
        return R.ok(menuService.buildMenus(menus));
    }
}
