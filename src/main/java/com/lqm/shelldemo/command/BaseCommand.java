package com.lqm.shelldemo.command;

import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/****
 * author:lqm
 * 2019-07-02
 **/
@ShellComponent
@ShellCommandGroup("菜单命令")
public class BaseCommand {


    @ShellMethod(value = "展示全部菜单", key = "show")
    public void showMenu() {
        System.out.println("我收到了.");
    }
}
