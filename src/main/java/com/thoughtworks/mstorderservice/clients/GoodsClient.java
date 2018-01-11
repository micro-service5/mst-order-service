package com.thoughtworks.mstorderservice.clients;

import com.thoughtworks.mstorderservice.data.GoodsData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient(name = "mst-goods", url = "${feignClientUrl.mst-goods:localhost:12306}")
public interface GoodsClient {

    @RequestMapping(value = "/goods/{id}", method = GET, consumes = APPLICATION_JSON_UTF8_VALUE)
    GoodsData getGoods(@PathVariable("id") Long id);

    @RequestMapping(value = "/goods/{id}/buy/{count}", method = POST)
    String buyGoods(@PathVariable("id") Long id, @PathVariable("count") Long count);
}
