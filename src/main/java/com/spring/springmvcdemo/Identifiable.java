package com.spring.springmvcdemo;

public interface Identifiable extends org.springframework.hateoas.Identifiable<Long> {
    void setId(Long id);
}
