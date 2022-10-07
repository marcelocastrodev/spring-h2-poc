package com.marcelocastro.h2poc.model;

import org.springframework.data.annotation.Id;

public record Customer(@Id Integer id, String firstName, String lastName) {
}
