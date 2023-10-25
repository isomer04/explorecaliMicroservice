package com.isomer.ec.explorecali.repo;

import com.isomer.ec.explorecali.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "packages", path="packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    Optional<TourPackage> findByName(String name);

    @Override
    @RestResource
    <S extends TourPackage> S save(S entity);

    @Override
    @RestResource
    <S extends TourPackage> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource
    void deleteById(String s);

    @Override
    @RestResource
    void delete(TourPackage entity);

    @Override
    @RestResource
    void deleteAllById(Iterable<? extends String> strings);

    @Override
    @RestResource
    void deleteAll(Iterable<? extends TourPackage> entities);

    @Override
    @RestResource
    void deleteAll();
}
