package com.jerry.mobile.designpattern.create.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
public class FunModuleFactor extends IModule{
    @Override
    public List<IFunctionModule> getMoudleFun(String permission) {
        switch (permission){
            case "VIP" :
                List<IFunctionModule> vipList=new ArrayList<>();
                vipList.add(new PlayMusicImpl());
                vipList.add(new PlayVideoImpl());
                vipList.add(new NewsImpl());
                return vipList;
            default:
                List<IFunctionModule> kipList=new ArrayList<>();
                kipList.add(new PlayMusicImpl());
                kipList.add(new NewsImpl());
                return kipList;
        }
    }
}
/**
 * @Test
 *     public void test7() {
 *         FunModuleFactor funModuleFactor = new FunModuleFactor();
 *         List<IFunctionModule> vip = funModuleFactor.getMoudleFun("VIP");
 *         System.out.println("VIP:" + vip.size());
 *
 *         List<IFunctionModule> kip = funModuleFactor.getMoudleFun("KIP");
 *         System.out.println("KIP:" + kip.size());
 *
 *     }
 *
 */
