package contracts.order.examples

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'PATCH'
        url '/dealers/testDealer/orders/1'
        headers {
            contentType('application/json')
            header('X-OTR-AS-USER-ID', 'D8CHUXIN')
            header('X-OTR-AS-ROLE-ID', 'ASSA')
            header('X-OTR-AS-DEALER-ID', 'testDealer')
            header("X-OTR-AS-COMMAND", "companyId")
        }
        body([
                'companyId': '59953972adf81c008e31e8bb'
        ])
    }
    response {
        status 200
        body([
                'companyId': '59953972adf81c008e31e8bb'
        ])
        headers {
            contentType('application/json')
        }
    }
}