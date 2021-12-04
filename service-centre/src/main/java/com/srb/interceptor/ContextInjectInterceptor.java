package com.srb.interceptor;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class ContextInjectInterceptor implements AsyncHandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("application/json");
//        response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
//        response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "PUT, POST, GET, DELETE,OPTIONS");
//        response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,
//                "X-Requested-With, X-Access-Token, X-Upload-Auth-Token, Origin, Content-Type, token");
////        String path = request.getRequestURI();
////        if(path.equals("/rsgl/user/login")
////                || path.equals("/rsgl/user/register")
////                || path.contains("/upload")){
////            return true;
////        }
////        // token验证
////        String header = request.getHeader("token");
////        System.out.println(header+"==========:>");
////        return null != header && header.equals("codekiang");
//        return true;
//    }
//
//}
