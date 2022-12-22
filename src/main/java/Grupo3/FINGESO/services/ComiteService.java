package Grupo3.FINGESO.services;

import Grupo3.FINGESO.Model.AcademicoEntity;
import Grupo3.FINGESO.Model.ComiteEntity;
import Grupo3.FINGESO.repository.ComiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

@Service
public class ComiteService implements ComiteRepository {
    @Autowired
    private ComiteRepository comiteRepository;

    @Override
    public List<ComiteEntity> findAll() {
        return comiteRepository.findAll();
    }

    @Override
    public List<ComiteEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ComiteEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<ComiteEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        comiteRepository.deleteById(id);
    }

    @Override
    public void delete(ComiteEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ComiteEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ComiteEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ComiteEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ComiteEntity> findById(Long aLong) {
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
    public <S extends ComiteEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ComiteEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<ComiteEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ComiteEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public ComiteEntity getById(Long aLong) {
        return null;
    }

    @Override
    public ComiteEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends ComiteEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ComiteEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ComiteEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ComiteEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ComiteEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ComiteEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ComiteEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<ComiteEntity> getComiteEntitiesByEvaluado_Id(Long id) {
        return comiteRepository.getComiteEntitiesByEvaluado_Id(id);
    }

    @Override
    public List<ComiteEntity> getComiteEntitiesByIntegrantesIsContaining(AcademicoEntity integrante) {
        return comiteRepository.getComiteEntitiesByIntegrantesIsContaining(integrante);
    }

    @Override
    public Boolean deleteComiteEntityByEvaluado_Id(Long id) {
        return comiteRepository.deleteComiteEntityByEvaluado_Id(id);
    }
}
