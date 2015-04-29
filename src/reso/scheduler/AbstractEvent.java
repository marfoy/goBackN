/*******************************************************************************
 * Copyright (c) 2011 Bruno Quoitin.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Bruno Quoitin - initial API and implementation
 ******************************************************************************/
package reso.scheduler;

public abstract class AbstractEvent
    implements Comparable<AbstractEvent>
{

	/** Time of occurence of this event. */
    private final double time;

    /**
     * Create a new simulation event.
     * @param time in seconds the event should occur.
     */
    public AbstractEvent(double time) {
    	this.time= time;
    }

    /**
     * @return the time in seconds this event is scheduled.
     */
    public final double getTime() {
    	return time;
    }

    /**
     * Compare two events based on their time of occurence.
     * 
     * @param evt is another event.
     */
    public final int compareTo(AbstractEvent evt) {
    	if (this.time < evt.time)
    		return -1;
    	else if (this.time > evt.time)
    		return 1;
    	return 0;
    }

    /**
     * This is the method that is called when an event is processed by the scheduler.
     * 
     * @throws Exception
     */
    public abstract void run() throws Exception;

}
