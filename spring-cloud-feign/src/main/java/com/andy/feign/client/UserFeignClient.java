package com.andy.feign.client;

import com.andy.feign.entity.User;
import com.andy.feign.pojo.UserAddVO;
import com.andy.feign.pojo.UserEditVO;
import com.andy.feign.pojo.UserVO;
import feign.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * @author Leone
 * @since 2018-03-13
 **/
@FeignClient(value = "user"/*, url = "http://127.0.0.1/user"*/)
public interface UserFeignClient {

    @RequestLine("GET /user/{id}")
    User find(@Param("id") Long id, @HeaderMap Map<String, String> header);

    @RequestLine("GET /user/list")
    @Headers("name-Type: james")
    List<User> list();

    @RequestLine("PUT /user")
    UserVO update(@RequestBody UserEditVO user);

    @RequestLine("POST /user")
    UserVO save(@RequestBody UserAddVO user);

    @RequestLine("DELETE /user")
    void delete(@QueryMap Map<String, Long> query);

    @RequestLine("POST /user/upload")
    String upload(MultipartFile file);

}
