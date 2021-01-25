package com.stephen.canal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@Slf4j
@Component
@CanalTable(value = "users")
public class UserHandler implements EntryHandler<Users> {

    @Override
    public void insert(Users user) {
        log.info("insert message  {}", user);
    }

    @Override
    public void update(Users before, Users after) {
        log.info("update before {} ", before);
        log.info("update after {}", after);
    }
    @Override
    public void delete(Users user) {
        log.info("delete  {}", user);
    }
}