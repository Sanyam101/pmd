
 /**
  * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
  */
 package test.net.sourceforge.pmd.rules.strictexception;
 
 import net.sourceforge.pmd.Rule;

import org.junit.Before;
import org.junit.Test;

import test.net.sourceforge.pmd.testframework.SimpleAggregatorTst;
 
 public class ExceptionSignatureDeclarationRuleTest extends SimpleAggregatorTst {
 
     private Rule rule;
 
     @Before
     public void setUp() {
         rule = findRule("strictexception", "SignatureDeclareThrowsException");
     }
 
     @Test
     public void testAll() {
         runTests(rule);
     }

     public static junit.framework.Test suite() {
         return new junit.framework.JUnit4TestAdapter(ExceptionSignatureDeclarationRuleTest.class);
     }
 }
