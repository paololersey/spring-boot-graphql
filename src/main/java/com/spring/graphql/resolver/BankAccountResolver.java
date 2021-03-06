package com.spring.graphql.resolver;

import com.spring.graphql.domain.bank.BankAccount;
import com.spring.graphql.domain.bank.Client;
import com.spring.graphql.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id){
        System.out.println("retrieve bank account id {} " + id);
        Client client = Client.builder().firstName("Paul").lastName("Spash").id(id).build();
        return BankAccount.builder().id(id).currency(Currency.USD).client(client).name("Paul").build();
    }
}
