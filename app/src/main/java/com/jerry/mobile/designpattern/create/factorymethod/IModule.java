package com.jerry.mobile.designpattern.create.factorymethod;

import java.util.List;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:抽象的业务模块类
 */
public abstract class IModule {

    /**
     * 根据不同的权限 拿到功能模块
     * @param permission
     * @return
     */
    public abstract List<IFunctionModule> getMoudleFun(String permission);
}
