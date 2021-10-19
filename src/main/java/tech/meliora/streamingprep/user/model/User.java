package tech.meliora.streamingprep.user.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

}
