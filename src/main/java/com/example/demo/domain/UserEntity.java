package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
@Generated
public class UserEntity implements Serializable {

    @Column(name="name", columnDefinition="varchar(255)")
    @JsonProperty("name")
    private String name;

    @Column(name="name", columnDefinition="varchar(255)")
    @JsonProperty("UUID")
    private String UUID;

    @Column(name="name", columnDefinition="timestamp")
    @JsonProperty("birthDate")
    private Date birthDate;

    @Column(name="name", columnDefinition="timestamp")
    @JsonProperty("createDate")
    private Date createDate;

    @Column(name="name", columnDefinition="timestamp")
    @JsonProperty("updateDate")
    private Date updateDate;

}
