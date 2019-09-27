package com.mobiquityinc.exception;

public class APIException extends RuntimeException {

    public APIException (String message) {

        super(message);




    }

    public APIException(String message, Throwable cause) {



        super(message, cause);
    }



}

/*
* Additional constraints:
1. Max weight that a package can take is ≤ 100
2. There might be up to 15 items you need to choose from
3. Max weight and cost of an item is ≤ 100
* */
