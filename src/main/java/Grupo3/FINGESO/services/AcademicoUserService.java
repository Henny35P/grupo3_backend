package Grupo3.FINGESO.Services;

import Grupo3.FINGESO.Model.Academico_User_Entity;
import Grupo3.FINGESO.Repository.AcademicoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service
public class AcademicoUserService implements AcademicoUserRepository {
    @Autowired
    private AcademicoUserRepository academicoUserRepository;

    @Override
    public List<Academico_User_Entity> findAll() {
        return academicoUserRepository.findAll();
    }

    @Override
    public List<Academico_User_Entity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Academico_User_Entity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Academico_User_Entity> findAllById(Iterable<Long> longs) {
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
    public void delete(Academico_User_Entity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Academico_User_Entity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Academico_User_Entity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Academico_User_Entity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Academico_User_Entity> findById(Long aLong) {
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
    public <S extends Academico_User_Entity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Academico_User_Entity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Academico_User_Entity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Academico_User_Entity getOne(Long aLong) {
        return null;
    }

    @Override
    public Academico_User_Entity getById(Long aLong) {
        return null;
    }

    @Override
    public Academico_User_Entity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Academico_User_Entity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Academico_User_Entity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Academico_User_Entity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Academico_User_Entity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Academico_User_Entity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Academico_User_Entity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Academico_User_Entity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
