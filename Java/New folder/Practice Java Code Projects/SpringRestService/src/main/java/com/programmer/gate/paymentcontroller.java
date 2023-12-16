package com.programmer.gate;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    @RequestMapping("/payment")
    public class paymentcontroller {

        private final String sharedkey = "shared_key";
        private static final String success_status = "success";
        private static final String error_status = "error";
        private static final int code_success = 100;
        private static final int auth_failure = 102;

        @RequestMapping(value = "/pay", method = RequestMethod.POST)
        public baseresponse pay(@RequestParam(value = "key") String key, @RequestBody paymentrequest request) {

            baseresponse response = new baseresponse();
            if (sharedkey.equalsIgnoreCase(key)) {
                int userid = request.getUserid();
                String itemid = request.getItemid();
                double discount = request.getDiscount();

                // process the request
                // ....
                // return success response to the client.

                response.setstatus(success_status);
                response.setcode(code_success);
            } else {
                response.setstatus(error_status);
                response.setcode(auth_failure);
            }
            return response;
        }

}
