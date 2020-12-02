package com.binarios.poc.dynamictable.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class TableConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "tableConfig")
    private List<ColumnConfig> columnConfigList;

    public TableConfig() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ColumnConfig> getColumnConfigList() {
        return columnConfigList;
    }

    public void setColumnConfigList(List<ColumnConfig> columnConfigList) {
        this.columnConfigList = columnConfigList;
    }
}
