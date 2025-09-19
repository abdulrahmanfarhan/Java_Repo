package com.abood;

import java.util.List;
import java.util.Vector;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import com.jk.web.faces.controllers.JKWebController;

@Named("controller")
@ViewScoped
public class Controller extends JKWebController {
    DataAccess da = new DataAccess();
    Model model;
    List<Model> modelList;
    List<Model> filterList;

    public boolean isAllowAdd() {
        return getModel().getId() == null;
    }

    public String add() {
        da.add(model);
        refresh();
        success("Added Successfully");
        return null;
    }

    public boolean isAllowUpdate() {
        return getModel().getId() != null;
    }

    public String update() {
        da.update(model);
        int id = getModel().getId();
        success("Updated Successfully");
        refresh();
        // to ensure getting updated version from DB
        this.model = da.find(id);
        return null;
    }

    public boolean isAllowDelete() {
        return getModel().getId() != null;
    }

    public String delete() {
        da.delete(getModel().getId());
        success("Deleted Successfully");
        refresh();
        return null;
    }

    public String reset() {
        setModel(null);
        return null;
    }

    public Model getModel() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public List<Model> getModelList() {
        if (modelList == null) {
            modelList = da.getAll();
        }
        return modelList;
    }

    public List<Model> getFilterList() {
        return filterList;
    }

    public void setFilterList(Vector<Model> filterList) {
        this.filterList = filterList;
    }

    protected void refresh() {
        this.modelList = null;
        setModel(null);
    }
}