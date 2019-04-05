package com.devglan.assignment;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface SubQuestionRepository extends Repository<SubQuestion, Integer> {

    void delete(SubQuestion subQuestion);

    List<SubQuestion> findAll();

    SubQuestion findOne(int id);

    SubQuestion save(SubQuestion subQuestion);
}
