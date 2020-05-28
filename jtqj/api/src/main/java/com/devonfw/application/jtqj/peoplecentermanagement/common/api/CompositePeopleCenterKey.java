package com.devonfw.application.jtqj.peoplecentermanagement.common.api;

import java.io.Serializable;

/**
 * @author cvanmoor
 *
 */
public class CompositePeopleCenterKey implements Serializable {

  private Long id_people;

  private Long id_center;

  public CompositePeopleCenterKey() {

  }

  public CompositePeopleCenterKey(String mixed) {

    super();
    String[] stringVar = mixed.split(",");
    this.id_people = Long.parseLong(stringVar[0]);
    this.id_center = Long.parseLong(stringVar[1]);
  }

  public CompositePeopleCenterKey(Long id_people, Long id_center) {

    super();
    this.id_people = id_people;
    this.id_center = id_center;
  }

  /**
   * @return id_people
   */
  public Long getId_people() {

    return this.id_people;
  }

  /**
   * @param id_people new value of {@link #getid_people}.
   */
  public void setId_people(Long id_people) {

    this.id_people = id_people;
  }

  /**
   * @return id_center
   */
  public Long getId_center() {

    return this.id_center;
  }

  /**
   * @param id_center new value of {@link #getid_center}.
   */
  public void setId_center(Long id_center) {

    this.id_center = id_center;
  }

}
