package com.spring.graphql.resolver.bank;

import com.spring.graphql.domain.bank.BankAccount;
import com.spring.graphql.domain.bank.Client;
import com.spring.graphql.exceptions.GraphqlException;
import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    /*public Client client(BankAccount bankAccount){
        log.info("requesting client data for bank account id = " + bankAccount.getId());
        // new RuntimeException("Spring exception");
        //throw new GraphqlException("Client unavailable");
        return Client.builder().id(UUID.randomUUID()).firstName("Paul").lastName("Spash").build();
    }*/

    public DataFetcherResult<Client> client(BankAccount bankAccount) {
        log.info("requesting client data for bank account id = " + bankAccount.getId());

        return DataFetcherResult.<Client>newResult()
                .data(Client.builder().id(UUID.randomUUID()).firstName("Paul").lastName("Spash").build())
        .error(new GenericGraphQLError("could not get sub client id"))
        .build();
    }
}

