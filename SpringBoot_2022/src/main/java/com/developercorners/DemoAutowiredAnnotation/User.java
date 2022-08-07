package com.developercorners.DemoAutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Autowired
	CompStud stud;
	
	public void name()
	{
		stud.sub();
	}

}
