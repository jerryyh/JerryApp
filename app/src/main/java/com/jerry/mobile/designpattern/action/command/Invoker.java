package com.jerry.mobile.designpattern.action.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:请求者角色类
 */
public class Invoker {

    //开发过程中没有此属性，此处作为示例，用来便利和撤销操作
    private static List<Commend> list = new ArrayList<Commend>();

    private Commend commend;

    public Invoker(Commend commend) {
        this.commend = commend;
        list.add(commend);
    }
    public void action(){
        commend.execute();
    }

    public void removeAction(Commend command){
        if(list.contains(command)){
            System.out.println(command.getClass().getName()+"被移除");
            list.remove(command);
        }
    }

    public void allAction(){
        if(list.size()>0){
            for (Commend mCommand : list)
            {
                mCommand.execute();
            }
        }
    }

}
/**
 * 总结：敏捷开发告诉我们，不要为了添加基于猜测的、实际不需要的功能，如果不清楚一个系统是否需要命令模式，
 * 一般就不要着急去实现它，事实上，在需要的时候通过重构实现这个模式并不困难，只有在真正需要撤销/恢复操作等功能时，
 * 把原来的代码重构为命令模式才有意义。
 */
