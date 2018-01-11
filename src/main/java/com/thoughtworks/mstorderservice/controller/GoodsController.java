package com.thoughtworks.mstorderservice.controller;

import com.thoughtworks.mstorderservice.clients.GoodsClient;
import com.thoughtworks.mstorderservice.data.GoodsData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    private GoodsClient goodsClient;

    GoodsController(GoodsClient goodsClient) {
        this.goodsClient = goodsClient;
    }

    @GetMapping("/{id}")
    public GoodsData getGoodsById(@PathVariable Long id) {
        return goodsClient.getGoods(id);
    }

    @PostMapping("/{id}/buy/{count}")
    public String getGoodsById(@PathVariable Long id, @PathVariable Long count) {
        return goodsClient.buyGoods(id, count);
    }
}
