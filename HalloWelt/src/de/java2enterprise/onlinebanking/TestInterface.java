package de.java2enterprise.onlinebanking;

@FunctionalInterface
public interface TestInterface<T> 
{
	public abstract boolean test(T t);
}
