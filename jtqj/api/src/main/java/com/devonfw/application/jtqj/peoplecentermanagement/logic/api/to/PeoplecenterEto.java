package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to;

import com.devonfw.application.jtqj.general.common.api.to.AbstractGenericEto;
import com.devonfw.application.jtqj.peoplecentermanagement.common.api.CompositePeopleCenterKey;
import com.devonfw.application.jtqj.peoplecentermanagement.common.api.Peoplecenter;

/**
 * Entity transport object of Peoplecenter
 */
public class PeoplecenterEto<T> extends AbstractGenericEto<CompositePeopleCenterKey>
    implements Peoplecenter<CompositePeopleCenterKey> {

  private static final long serialVersionUID = 1L;

  private CompositePeopleCenterKey id;

  @Override
  public CompositePeopleCenterKey getId() {

    return this.id;
  }

  @Override
  public void setId(CompositePeopleCenterKey id) {

    this.id = id;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    PeoplecenterEto other = (PeoplecenterEto) obj;
    if (this.id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!this.id.equals(other.id)) {
      return false;
    }

    return true;
  }
}
