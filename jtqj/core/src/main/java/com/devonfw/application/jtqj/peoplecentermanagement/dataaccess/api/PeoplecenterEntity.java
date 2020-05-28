package com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devonfw.application.jtqj.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.jtqj.peoplecentermanagement.common.api.Peoplecenter;

/**
 * @author cvanmoor
 */
@Entity
@Table(name = "people_center")
public class PeoplecenterEntity extends ApplicationPersistenceEntity<CompositePeopleCenterKeyImpl>
    implements Peoplecenter<CompositePeopleCenterKeyImpl> {

  private CompositePeopleCenterKeyImpl id;

  private static final long serialVersionUID = 1L;

  @Override
  @EmbeddedId
  @AttributeOverrides({ @AttributeOverride(name = "id_people", column = @Column(name = "id_people", length = 10)),
  @AttributeOverride(name = "id_center", column = @Column(name = "id_center", length = 10)), })
  public CompositePeopleCenterKeyImpl getId() {

    return this.id;
  }

  @Override
  public void setId(CompositePeopleCenterKeyImpl id) {

    this.id = id;
  }

}
