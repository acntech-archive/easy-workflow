package no.acntech.workflow.core.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Action {

    private String id;
    private String name;
    private String type;
    private Step step;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID")
    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }
}
