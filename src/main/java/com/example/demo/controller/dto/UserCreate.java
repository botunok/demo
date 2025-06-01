package com.example.demo.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreate {

    @JsonProperty("name")
    private String name;

    @JsonProperty("UUID")
    private String UUID;

    @JsonProperty("birthDate")
    private Date birthDate;

    @JsonProperty("createDate")
    private Date createDate;

    @JsonProperty("updateDate")
    private Date updateDate;

}