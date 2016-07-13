package org.onem2m.sdt.datapoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.onem2m.sdt.impl.AccessException;
import org.onem2m.sdt.impl.DataPointException;
import org.onem2m.sdt.types.DataType;

public abstract class EnumDataPoint<T> extends ValuedDataPoint<T> {
	
	private List<T> values;

	public EnumDataPoint(String name) {
		super(name, DataType.Enum);
		values = new ArrayList<T>();
	}
	
	public EnumDataPoint(String name, DataType type) {
		super(name, type);
		values = new ArrayList<T>();
	}
	
	public void setValue(T v) throws DataPointException, AccessException {
		if (! values.contains(v))
			throw new DataPointException("Unknown value");
		super.setValue(v);
	}
	
	public void setValidValues(T[] v) {
		this.values = Arrays.asList(v);
	}
	
	public void setValidValues(Collection<T> v) {
		this.values.clear();
		this.values.addAll(v);
	}

	public List<T> getValidValues() {
		return values;
	}
	
}