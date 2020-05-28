package com.devonfw.application.jtqj.peoplecentermanagement.dataaccess.api;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;

@Embeddable
public class CompositePeopleCenterKeyImpl extends CompositePeopleCenterKey implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id_people;

  private Long id_center;

  public CompositePeopleCenterKeyImpl() {

  }

  public CompositePeopleCenterKeyImpl(String mixed) {

    super();
    String[] stringVar = mixed.split(",");
    this.id_people = Long.parseLong(stringVar[0]);
    this.id_center = Long.parseLong(stringVar[1]);
  }

  public CompositePeopleCenterKeyImpl(CompositePeopleCenterKey compositePeopleCenterKey) {

    super();
    this.id_people = compositePeopleCenterKey.getId_people();
    this.id_center = compositePeopleCenterKey.getId_people();
  }

  public CompositePeopleCenterKeyImpl(Long id_people, Long id_center) {

    super();
    this.id_people = id_people;
    this.id_center = id_center;
  }

  /**
   * @return id_people
   */
  @Override
  public Long getId_people() {

    return this.id_people;
  }

  /**
   * @param id_people new value of {@link #getid_people}.
   */
  @Override
  public void setId_people(Long id_people) {

    this.id_people = id_people;
  }

  /**
   * @return id_center
   */
  @Override
  public Long getId_center() {

    return this.id_center;
  }

  /**
   * @param id_center new value of {@link #getid_center}.
   */
  @Override
  public void setId_center(Long id_center) {

    this.id_center = id_center;
  }

  @Override
  public boolean equals(Object other) {

    if (this == other)
      return true;
    if (!(other instanceof CompositePeopleCenterKeyImpl))
      return false;

    final CompositePeopleCenterKeyImpl compositePeopleCenterKeyImpl = (CompositePeopleCenterKeyImpl) other;

    if (!compositePeopleCenterKeyImpl.getId_people().equals(getId_people()))
      return false;
    if (!compositePeopleCenterKeyImpl.getId_center().equals(getId_center()))
      return false;

    return true;
  }

  @Override
  public int hashCode() {

    int result;
    result = getId_people().hashCode();
    result = 29 * result + getId_center().hashCode();
    return result;
  }
}