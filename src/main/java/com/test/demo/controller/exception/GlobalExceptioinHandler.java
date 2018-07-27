package com.test.demo.controller.exception;

import java.util.HashMap;
import java.util.Map;

public class GlobalExceptioinHandler {

    public Map<String,Object> defaultExceptionHandler(Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", 500);
        map.put("msg", e.getMessage());
        return map;
    }
}
