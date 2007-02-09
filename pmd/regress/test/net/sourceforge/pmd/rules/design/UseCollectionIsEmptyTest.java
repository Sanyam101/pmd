/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package test.net.sourceforge.pmd.rules.design;

import org.junit.Before;
import org.junit.Test;

import net.sourceforge.pmd.Rule;
import test.net.sourceforge.pmd.testframework.SimpleAggregatorTst;

/**
 * Adding this test to validate current working code doesn't break I've been
 * trying to locate the article referenced. The below code stresses the NPath
 * rule, and according to its current style, runs 2 tests, one pass and one
 * fail.
 * 
 * @author Allan Caplan
 */
public class UseCollectionIsEmptyTest extends SimpleAggregatorTst{

    private Rule rule;

    @Before
    public void setUp() {
        rule = findRule("design", "UseCollectionIsEmpty");
    }

    @Test
    public void testAll() {
        runTests(rule);
    }


    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(UseCollectionIsEmptyTest.class);
    }
}

