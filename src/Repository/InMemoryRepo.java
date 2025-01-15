package Repository;

import Model.HasID;

import Repository.IRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepo<T extends HasID> implements IRepository<T> {
    private final Map<Integer, T> data=new HashMap<>();
    public void create(T obj) {data.putIfAbsent(obj.getID(),obj);}
    public T get(int id) {return data.get(id);}
    public void update(T obj) {data.replace(obj.getID(),obj);}
    public void delete(int id) {data.remove(id);}
    public List<T> getAll() {return new ArrayList<>(data.values());}


}



//public class Repository <T> {
//    private final List<T> repository;
//
//    public Repository(List<T> repository) {
//        this.repository = repository;
//    }
//    public Repository() {
//        this.repository = new ArrayList<T>();
//    }
//
//    public void addElement(T t) {
//        repository.add(t);
//    }
//
//    public List<T> getAllElements() {
//        return repository;
//    }
//
//    public T getElement(int index) {
//        return repository.get(index);
//    }
//
//    public void updateElement(int index,T t) {
//        repository.set(index, t);
//    }
//
//    public void remove(T t) {
//        repository.remove(t);
//    }
//
//}