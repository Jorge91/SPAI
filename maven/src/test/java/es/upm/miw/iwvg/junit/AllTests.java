package es.upm.miw.iwvg.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DecimalCollectionTest.class, FractionTest.class, PointTest.class, UserTest.class})
public class AllTests {

}
