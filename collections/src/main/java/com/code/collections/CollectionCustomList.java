package com.code.collections;

import java.util.*;
import java.util.logging.Logger;
public class CollectionCustomList 
{
	@SuppressWarnings("rawtypes")
	ArrayList List = new ArrayList();
	final static Logger logger = Logger.getLogger("CollectionCustomList.java");
	@SuppressWarnings("unchecked")
	
	 int Add(String i)
	 {
		 List.add(i);
		 return 1;
	 }
	
	 Object Print()
	 {
		return List;
	 }

	 int Remove(String r)
	 {
		 if(List.contains(r)) 
		 {
			 List.remove(r);
			 return 1;
		 }
		 else
			 return 0;
	 }

	 Object Fetch(int index)
	 {
		 logger.info("Index should be greater than Zero");
		 if(index<0)
		 {
			 logger.warning("Index can't be Negative\n");
		 }
		 return List.get(index-1);
	 }
}
