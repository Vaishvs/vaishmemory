package com.zensar.emdb.dao;
import java.util.ArrayList;

public interface daoInterface<T,P> {
				T insert(P obj);
				T delete(P obj);
				T modifySalary(P obj);
				T modifyDesignation(P obj);
				P DisplayOne(P obj);
				ArrayList<P> DisplayAll();
				
}
