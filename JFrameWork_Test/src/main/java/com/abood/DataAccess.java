package com.abood;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DataAccess {
    JKDataAccess service = JKDataAccessFactory.getDataAccessService();

    public void add(Model person) {
        String sql = "INSERT INTO person (national_id,name,email,address) VALUES (?,?,?,?)";
        service.execute(sql, person.getNationalId(), person.getName(), person.getEmail(), person.getAddress());
    }

    public Model find(int id) {
        return service.find("SELECT * FROM person WHERE id=?", this::populatePerson, id);
    }

    public boolean delete(int id) {
        return service.execute("DELETE FROM person WHERE id=?", id) == 1;
    }

    public boolean update(Model person) {
        String sql = "UPDATE person SET national_id=?,name=?,email=?,address=? WHERE id=?";
        int records = service.execute(sql, person.getNationalId(), person.getName(), person.getEmail(),
                person.getAddress(), person.getId());
        return records == 1;

    }

    public List<Model> getAll() {
        return service.getList("SELECT * FROM person", this::populatePerson);
    }

    protected Model populatePerson(ResultSet rs) throws SQLException {
        Model person = new Model();
        person.setId((Integer) rs.getObject("id"));
        person.setNationalId((String) rs.getObject("national_id"));
        person.setName((String) rs.getObject("name"));
        person.setEmail((String) rs.getObject("email"));
        person.setAddress((String) rs.getObject("address"));
        return person;
    }

}