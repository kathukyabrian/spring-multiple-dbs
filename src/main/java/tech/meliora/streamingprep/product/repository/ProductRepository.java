package tech.meliora.streamingprep.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.meliora.streamingprep.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
