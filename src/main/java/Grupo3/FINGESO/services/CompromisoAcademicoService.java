package Grupo3.FINGESO.services;

import Grupo3.FINGESO.Model.Compromiso_Academico;
import Grupo3.FINGESO.repository.CompromisoAcademicoRepository;
import Grupo3.FINGESO.repository.CompromisoRepository;
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
public class CompromisoAcademicoService implements CompromisoAcademicoRepository {
    @Autowired
    private CompromisoAcademicoRepository compromisoAcademicoRepository;

    @Override
    public List<Compromiso_Academico> findAll() {
        return null;
    }

    @Override
    public List<Compromiso_Academico> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Compromiso_Academico> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Compromiso_Academico> findAllById(Iterable<Long> longs) {
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
    public void delete(Compromiso_Academico entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Compromiso_Academico> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Compromiso_Academico> S save(S entity) {
        return compromisoAcademicoRepository.save(entity);
    }

    @Override
    public <S extends Compromiso_Academico> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Compromiso_Academico> findById(Long aLong) {
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
    public <S extends Compromiso_Academico> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Compromiso_Academico> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Compromiso_Academico> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Compromiso_Academico getOne(Long aLong) {
        return null;
    }

    @Override
    public Compromiso_Academico getById(Long aLong) {
        return null;
    }

    @Override
    public Compromiso_Academico getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Compromiso_Academico> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Compromiso_Academico> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Compromiso_Academico> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Compromiso_Academico> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Compromiso_Academico> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Compromiso_Academico> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Compromiso_Academico, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<Compromiso_Academico> findByAcademico_Id(Long id) {
        return compromisoAcademicoRepository.findByAcademico_Id(id);
    }
}
