package Grupo3.FINGESO.services;

import Grupo3.FINGESO.Model.AcademicoEntity;
import Grupo3.FINGESO.repository.AcademicoRepository;
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
public class AcademicoService implements AcademicoRepository {
    @Autowired
    private AcademicoRepository academicoRepository;

    @Override
    public List<AcademicoEntity> findAll() {
        return academicoRepository.findAll();
    }

    @Override
    public List<AcademicoEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AcademicoEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AcademicoEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(AcademicoEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends AcademicoEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends AcademicoEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends AcademicoEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<AcademicoEntity> findById(Long id) {
        return academicoRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends AcademicoEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends AcademicoEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<AcademicoEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public AcademicoEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public AcademicoEntity getById(Long id) {
        return academicoRepository.getById(id);
    }

    @Override
    public AcademicoEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends AcademicoEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends AcademicoEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends AcademicoEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends AcademicoEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AcademicoEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends AcademicoEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends AcademicoEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public AcademicoEntity getAcademicoEntityByUser_Id(Long id) {
        return academicoRepository.getAcademicoEntityByUser_Id(id);
    }
}
