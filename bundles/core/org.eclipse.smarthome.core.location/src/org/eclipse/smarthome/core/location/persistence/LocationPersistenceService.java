/**
 * 
 */
package org.eclipse.smarthome.core.location.persistence;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.persistence.FilterCriteria;
import org.eclipse.smarthome.core.persistence.HistoricItem;
import org.eclipse.smarthome.core.persistence.QueryablePersistenceService;

public class LocationPersistenceService implements QueryablePersistenceService {

	/* (non-Javadoc)
	 * @see org.eclipse.smarthome.core.persistence.PersistenceService#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.smarthome.core.persistence.QueryablePersistenceService#query(org.eclipse.smarthome.core.persistence.FilterCriteria)
	 */
	@Override
	public Iterable<HistoricItem> query(FilterCriteria filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void store(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void store(Item item, String alias) {
		// TODO Auto-generated method stub
		
	}

}
