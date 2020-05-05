package com.techlabs.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}
	
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = null;
		if (spec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
		}else if(spec instanceof MandolinSpec) {
			instrument=new Mandolin(serialNumber, price, (MandolinSpec)spec);
		}
		inventory.add(instrument);
	}
	
	public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}
	
	public List search(MandolinSpec searchSpec) {
		List matchingMandolins=new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Mandolin mandolin = (Mandolin) i.next();
			if(mandolin.getSpec().matches(searchSpec))
				matchingMandolins.add(mandolin);
		}
		return matchingMandolins;
	}

	public List search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			GuitarSpec guitarspec = (GuitarSpec) guitar.getSpec();

			if (searchSpec.getBuilder() != guitarspec.getBuilder()) {
				continue;
			}
			String model = searchSpec.getModel().toLowerCase();
			if ((model != null) && (!model.equals(" ")) && (!model.equals(guitarspec.getModel().toLowerCase()))) {
				continue;
			}
			if (searchSpec.getType() != guitarspec.getType()) {
				continue;
			}
			if (searchSpec.getTopwood() != guitarspec.getTopwood()) {
				continue;
			}
			if (searchSpec.getBackwood() != guitarspec.getBackwood()) {
				continue;
			}
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

}
