package com.youda.controller.admin;

import com.youda.service.admin.UserStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chencongye
 * @Date 2017/12/13 16:08
 * @Version 1.0.0
 * @Instructions 实现用户统计功能
 */

@RestController
@RequestMapping(value = "userstatics")
public class UserStatisticsController {

    @Autowired
    UserStatisticsService userStatisticsService;

    /*新增用户统计，当日新增加的玩家账户数*/
    public void newUserStatistics() {

    }

    /*新增激活设备数，当日新增加的激活设备数*/
    public void newEquipmentStatistics() {

    }

    /*日增用户统计*/
    public void everyDayNewUserStatistics() {

    }

    /*周增用户统计*/
    public void everyWeekNewUserStatistics() {

    }

    /*月增用户统计*/
    public void everyMonthNewUserStatistics() {

    }

    /*当日活跃玩家统计，当日有开启过游戏的玩家数*/
    public void dengesActiveStatistics() {

    }

    /*当日付费玩家统计，当日进行充值的玩家数*/
    public void dengesPaymentStatistics() {

    }


    /*当日收入统计，当日玩家充值的货币总额*/
    public void dengesIncomeStatistics(){

    }

    /*新增用户留存*/
    public void newUsersRetained() {

    }

    /*激活设备留存*/
    public void newEquipmentRetained() {

    }

}