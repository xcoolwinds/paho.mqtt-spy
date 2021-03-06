/***********************************************************************************
 * 
 * Copyright (c) 2016 Kamil Baczkowicz
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 * The Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * 
 *    Kamil Baczkowicz - initial API and implementation and/or initial documentation
 *    
 */

package pl.baczkowicz.spy.ui.storage;

import pl.baczkowicz.spy.messages.FormattedMessage;

public interface MessageAuditUtils
{
	String getCurrentMessageAsMessageLog(final BasicMessageStoreWithSummary<? extends FormattedMessage> store, final int messageIndex, final boolean encode);
	
	String getAllMessagesAsMessageLog(final BasicMessageStoreWithSummary<? extends FormattedMessage> store, final boolean encode);
}
