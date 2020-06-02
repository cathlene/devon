package com.devonfw.application.jtqj.peoplecentermanagement.logic.api.usecase;

import com.devonfw.application.jtqj.peoplecentermanagement.logic.api.to.PeopleCenterEto;

/**
 * Interface of UcManagePeopleCenter to centralize documentation and signatures of methods.
 */
public interface UcManagePeopleCenter {

  /**
   * Deletes a peopleCenter from the database by its id 'peopleCenterId'.
   *
   * @param peopleCenterId Id of the peopleCenter to delete
   * @return boolean <code>true</code> if the peopleCenter can be deleted, <code>false</code> otherwise
   */
  boolean deletePeopleCenter(long peopleCenterId);

  /**
   * Saves a peopleCenter and store it in the database.
   *
   * @param peopleCenter the {@link PeopleCenterEto} to create.
   * @return the new {@link PeopleCenterEto} that has been saved with ID and version.
   */
  PeopleCenterEto savePeopleCenter(PeopleCenterEto peopleCenter);

}
