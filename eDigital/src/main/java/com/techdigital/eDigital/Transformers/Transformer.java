package com.techdigital.eDigital.Transformers;

public interface Transformer<T, E> {
	
	T transform (E transferObject);
}
