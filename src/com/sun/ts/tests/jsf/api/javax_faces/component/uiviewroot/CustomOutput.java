/*
 * Copyright (c) 2009, 2018 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id$
 */
package com.sun.ts.tests.jsf.api.javax_faces.component.uiviewroot;

import javax.faces.component.UIOutput;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ComponentSystemEvent;

public class CustomOutput extends UIOutput {

  private boolean processEventInvoked;

  private ComponentSystemEvent event;

  private String myValue = "Default_Test_Value";

  public void processEvent(ComponentSystemEvent event)
      throws AbortProcessingException {
    processEventInvoked = true;
    this.event = event;
  }

  public void reset() {
    processEventInvoked = false;
    event = null;
  }

  public boolean isProcessEventInvoked() {
    return processEventInvoked;
  }

  public ComponentSystemEvent getEvent() {
    return event;
  }

  @Override
  public String getValue() {
    return myValue;
  }

  public void setValue(Object s) {
    myValue = s.toString();
  }
}
