package com.thoughtworks.mstorderservice.clients;

import com.thoughtworks.mstorderservice.data.GoodsData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient(name = "mst-users-service", url = "${feignClientUrl.mst-goods:localhost:8090}")
public interface UserClient {

    @GetMapping("/api/user/names")
    List<String> getUserNames();

}
