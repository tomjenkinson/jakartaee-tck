/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.tests.jpa.core.override.embeddable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BookStore implements Serializable {

  @Id
  private Integer id;

  @Embedded
  private Publisher publisher;

  public BookStore() {
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (this.getId() != null ? this.getId().hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not
    // set
    if (!(object instanceof BookStore)) {
      return false;
    }
    BookStore other = (BookStore) object;
    if (this.getId() != other.getId()
        && (this.getId() == null || !this.getId().equals(other.getId()))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "com.sun.ts.tests.jpa.core.override.embeddable." + "BookStore[id="
        + getId() + "]";
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
