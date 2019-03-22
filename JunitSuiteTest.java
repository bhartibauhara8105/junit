package com.niit.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SuiteTest2.class, SuitTest1.class })
public class JunitSuiteTest {

}
