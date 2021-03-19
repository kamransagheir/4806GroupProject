package Bookstore.repositories;

import Bookstore.Model.Bookstore;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookstores", path = "bookstores")
public interface BookstoreRepository extends PagingAndSortingRepository<Bookstore, Long>{
    Bookstore findById(long id);
    List<Bookstore> findByName(String name);
}
