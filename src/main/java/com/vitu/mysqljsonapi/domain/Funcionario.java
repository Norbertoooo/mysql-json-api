package com.vitu.mysqljsonapi.domain;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "funcionario")
@TypeDef(
        name = "json",
        typeClass = JsonType.class
)
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Endereco endereco;

}
