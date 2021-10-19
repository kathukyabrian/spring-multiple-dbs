package tech.meliora.streamingprep.product.model;

import javax.persistence.*;

@Entity
@Table(schema = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double price;
}
