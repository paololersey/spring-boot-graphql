package com.spring.graphql.resolver.bank;

import com.spring.graphql.domain.bank.BankAccount;
import com.spring.graphql.domain.bank.Client;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    public Client client(BankAccount bankAccount){
        log.info("requesting client data for bank account id = " + bankAccount.getId());
        return Client.builder().id(UUID.randomUUID()).firstName("Paul").lastName("Spash").build();
    }
}