package com.thoughtworks.mstorderservice.clients;

import com.thoughtworks.mstorderservice.data.GoodsData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "mst-goods")
public interface GoodsClient {

    @RequestMapping(value = "/goods/{id}", method = GET, consumes = APPLICATION_JSON_UTF8_VALUE)
    GoodsData getGoods(@RequestParam Long goodsId);
}
