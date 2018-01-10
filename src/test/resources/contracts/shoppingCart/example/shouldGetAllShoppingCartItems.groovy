package shoppingCart.example

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/shopping-cart/all'
    }
    response {
        status 200
        headers {
            contentType('application/json')
        }
        body([
                [
                        userId: 1111,
                        goodsId: 4444,
                        count: 1,
                ],
                [
                        userId: 2222,
                        goodsId: 5555,
                        count: 3,
                ],
                [
                        userId: 3333,
                        goodsId: 6666,
                        count: 5,
                ]
        ])
    }
}