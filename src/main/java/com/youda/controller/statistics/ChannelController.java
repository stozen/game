package com.youda.controller.statistics;

import com.youda.annotation.CurrentAdmin;
import com.youda.annotation.CurrentChannel;
import com.youda.request.channel.GameRequest;
import com.youda.request.channel.LoginRequest;
import com.youda.request.channel.RegisterRequest;
import com.youda.response.ResponseStatusCode;
import com.youda.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author chencongye
 * @version 1.0.0
 * @date 2017-11-28
 * @introduce 定义游戏渠道控制器
 */

@RestController
@RequestMapping(value = "/statistics/channel")
@CrossOrigin(maxAge = 3600, origins = "*")
public class ChannelController {
    @Autowired
    private ChannelService channelService;

    @ResponseBody
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public ResponseEntity register(@RequestBody RegisterRequest request) {
        if (request.isEmpty()) {
            return ResponseStatusCode.nullPointerError();
        }
        return channelService.register(request);
    }

    @RequestMapping(value = "user", method = RequestMethod.PUT)
    public ResponseEntity login(@RequestBody LoginRequest request) {
        if (request.isEmpty()) {
            return ResponseStatusCode.nullPointerError();
        }
        return channelService.login(request);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity upDataInfo() {
        return null;
    }

    @RequestMapping(value = "bind/{gameId}", method = RequestMethod.PUT)
    public ResponseEntity bindGame(@PathVariable Long gameId, @RequestHeader("channelId") Long channelId) {
        return channelService.bindGame(channelId, gameId);
    }

    @CurrentChannel
    @RequestMapping(value = "add/game", method = RequestMethod.POST)
    public ResponseEntity addGames(@RequestHeader("channelId") Long channelId, @RequestBody GameRequest gameRequest) {
        if (gameRequest.isEmpty()) {
            return ResponseStatusCode.nullPointerError();
        }
        return channelService.addGame(channelId, gameRequest);
    }

    @CurrentChannel
    @RequestMapping(value = "games", method = RequestMethod.GET)
    public ResponseEntity getAllGames(@RequestHeader("channelId") Long channelId) {
        return channelService.getAllGame(channelId);
    }

    @CurrentAdmin
    @CurrentChannel
    @RequestMapping(value = "channels", method = RequestMethod.GET)
    public ResponseEntity getChannels() {
        return channelService.getChannels();
    }
}
