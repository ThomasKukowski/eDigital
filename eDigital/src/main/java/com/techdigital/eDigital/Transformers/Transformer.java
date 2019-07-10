package com.techdigital.eDigital.Transformers;

@FunctionalInterface
public interface Transformer<T, E> {
	
	T transform (E transferObject);
}
