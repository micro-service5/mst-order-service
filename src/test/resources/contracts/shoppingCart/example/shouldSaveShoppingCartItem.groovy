package shoppingCart.example

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url $(consumer(regex('/shopping-cart')), producer('/shopping-cart')), {
            queryParameters {
                parameter userId: 1234
                parameter goodsId: 5678
                parameter goodsCount: 5
            }
        }
    }
    response {
        status 200
        headers {
            contentType('application/json')
        }
        body([
                userId: 1234,
                goodsId: 5678,
                count: 5,
        ])
    }
}