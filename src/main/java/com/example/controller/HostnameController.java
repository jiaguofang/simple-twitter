package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Jiaguo Fang (pue626)
 */
@RestController
public class HostnameController {
    
    @RequestMapping(value = "/hostname", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map hostname() throws UnknownHostException {
        Map<String, Object> map = new HashMap<>();
        map.put("hostname", InetAddress.getLocalHost().getHostName());
        map.put("random", new Random().nextInt());
        return map;
    }
}
