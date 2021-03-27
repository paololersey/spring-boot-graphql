package com.spring.graphql.exceptions;

import graphql.kickstart.spring.error.ThrowableGraphQLError;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class GraphqlExceptionHandler {

    @ExceptionHandler(GraphqlException.class)
    public ThrowableGraphQLError handle(GraphqlException e){
        return new ThrowableGraphQLError(e);
    }
    @ExceptionHandler(RuntimeException.class)
    public ThrowableGraphQLError handle(RuntimeException e){
        return new ThrowableGraphQLError(e, "Internal server error");
    }
}
