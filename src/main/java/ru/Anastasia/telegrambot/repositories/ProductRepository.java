package ru.Anastasia.telegrambot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.Anastasia.telegrambot.entities.Product;

import java.awt.print.Pageable;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "products",path = "products")
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByCategoryId(Long id);

    @Query("select product from OrderProduct where clientOrder =( from ClientOrder co where co.client.id = :id )")
    List<Product> getClientProducts(Long id);

    List<Product> findDistinctProductByNameContaining(String name);

    @Query("select product from OrderProduct group by product order by sum(productCount) desc")
    List<Product> getTopPopularProducts(Pageable pageable);

}