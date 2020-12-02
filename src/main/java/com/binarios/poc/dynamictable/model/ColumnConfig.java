package com.binarios.poc.dynamictable.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class ColumnConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Enumerated(EnumType.STRING)
    private RankType rankType;

    private Float percentSize;

    private Boolean visible;

    private Integer arrangement;

    @ManyToOne
    @JoinColumn(name = "table_config_id")
    private TableConfig tableConfig;

    public ColumnConfig() {
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

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public Float getPercentSize() {
        return percentSize;
    }

    public void setPercentSize(Float percentSize) {
        this.percentSize = percentSize;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Integer getArrangement() {
        return arrangement;
    }

    public void setArrangement(Integer order) {
        this.arrangement = order;
    }

    public TableConfig getTableConfig() {
        return tableConfig;
    }

    public void setTableConfig(TableConfig tableConfig) {
        this.tableConfig = tableConfig;
    }
}
