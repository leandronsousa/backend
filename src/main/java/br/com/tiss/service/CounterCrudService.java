package br.com.tiss.service;

import org.bson.types.ObjectId;

import br.com.tiss.model.Counter;

public interface CounterCrudService extends CrudService<Counter, ObjectId> {

}
