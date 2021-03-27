package com.spring.graphql.exceptions;

public class GraphqlException extends RuntimeException{

    public GraphqlException(){}

    public GraphqlException(String message){
        super(message);
    }

    public GraphqlException(Throwable cause){
        super(cause);
    }

    public GraphqlException(String message, Throwable cause){
        super(message, cause);
    }


}
