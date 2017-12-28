package com.youda.serviceImpl.statistics;

import com.youda.dao.statistics.UserNewMapper;
import com.youda.request.statistics.UserStatisticsRequest;
import com.youda.response.ResponseStatusCode;
import com.youda.response.admin.UserNewStatisticsResponse;
import com.youda.service.statistics.UserNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Chencongye
 * @Date 2017/12/14 13:05
 * @Version 1.0.0
 * @Instructions 实现用户数据统计
 */

@Service
public class UserNewServiceImpl implements UserNewService {

    /*实现用户统计的自动依赖注入*/
    @Autowired
    UserNewMapper userStatisticsMapper;

    /*实现自定义日期新增用户统计*/
    @Override
    public ResponseEntity customTime(UserStatisticsRequest userStatisticsRequest) {

        List<UserNewStatisticsResponse> userNewStatisticsRespons = userStatisticsMapper.cudtomTime(userStatisticsRequest);
        return ResponseStatusCode.putOrGetSuccess(userNewStatisticsRespons);
    }

    /*实现所用新增用户统计*/
    @Override
    public ResponseEntity all(UserStatisticsRequest userStatisticsRequest) {
        List<UserNewStatisticsResponse> userNewStatisticsRespons = userStatisticsMapper.all(userStatisticsRequest);
        return ResponseStatusCode.putOrGetSuccess(userNewStatisticsRespons);
    }
}