package Grupo3.FINGESO.services;

import Grupo3.FINGESO.Model.CompromisoEntity;
import Grupo3.FINGESO.repository.CompromisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CompromisoService implements CompromisoRepository {
    @Autowired
    CompromisoRepository compromisoRepository;
    @Override
    public List<CompromisoEntity> getCompromisoEntitiesByAcademico_Id(Long id) {
        return compromisoRepository.getCompromisoEntitiesByAcademico_Id(id);
    }

    @Override
    public List<CompromisoEntity> findAll() {
        return compromisoRepository.findAll();
    }

    @Override
    public List<CompromisoEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CompromisoEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CompromisoEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(CompromisoEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CompromisoEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CompromisoEntity> S save(S entity) {
        return compromisoRepository.save(entity);
    }

    @Override
    public <S extends CompromisoEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CompromisoEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends CompromisoEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CompromisoEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CompromisoEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CompromisoEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public CompromisoEntity getById(Long aLong) {
        return null;
    }

    @Override
    public CompromisoEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends CompromisoEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CompromisoEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CompromisoEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CompromisoEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CompromisoEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CompromisoEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CompromisoEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
