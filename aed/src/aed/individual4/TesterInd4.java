
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2023/10/4 -- 21:16:22
// Seed: {1696,446980,853809}
//
//////////////////////////////////////////////////////////////////////



package aed.individual4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterInd4 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(43,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,9,0) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_01")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] {  }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_02")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 4,16,4,16,17,18,9,12,1,12,18,9,11,13,10,17,11 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_03")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 6,2,5,14,14,12,2,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_04")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 9,20,4,12,2,17,4,8 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_05")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 10,12,15,18,4,14,3,20,12,17,11,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_06")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 17,4,4,12,17,15 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_07")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 7,3,4 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(7) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_08")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 18,2,17,8,2,20,4 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_09")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 19,7,4,16,2,19,10,8,5,5,20,12,8,8,4,8,13 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_10")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,17,2,19,2 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_11")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 4,15,6,14,15,20,9,19,12,13,20,6 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_12")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,3,20,15,6,3,17,19,1,20 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_13")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 14,16,1,12,11,15,2,3,5,11 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(14) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(16) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_14")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 4,13,18,3,5,18,14,19,20 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(4) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_15")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 5,18,6,13,6,10,7,11,18,3,6,3,6,5,18,5,12 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_16")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,17,13,1,1,1,19,19,17 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_17")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 2,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(7) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_18")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 4,17,2,3,6,7,3,20,14,6,14 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(4) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_19")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 13,16,8,1,20,9,15,13,16,17,4,4,9 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_20")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] {  }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_21")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 5,3,3,12,2 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(5) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(12) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(5) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_22")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 9,20,15,11,4,15,20,13,4,9,13,1,15,2,16,18,7,1,3 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_23")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 10,1,7,13,7,20,1,5,3,13,4,4,12 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_24")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_25")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 19,7,9,16,11,7,9 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_25")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_26")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,2,3 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_26")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_27")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 1,2,3 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(1) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_27")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_28")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 11,14,9,4,16,20,16,17,17,19,4,13,13,2 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(11) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(14) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_28")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_29")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 6,16,18,4,9,1,6,11,18,18,7 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(6) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_9).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_29")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_30")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 9,17,12,11,6,11,19,2,13,8,1 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_30")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_31")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 6,19,4,3,20,15,7,14,5,12,10,17 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(6) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_31")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_32")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] {  }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_32")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_33")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 16,5,4,14,18,10,17,9,1,7,5 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_33")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_34")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 3,3,13,19,8,8,1,15,11,14,16,9,15,15,14,16,9,6,13 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(13) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(3) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(13) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_34")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_35")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 10,10,6,1,12 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(12) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(12) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(10) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(10) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_35")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_36")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 9,8,20,18,6,5,6,1,8,6,14,20,4 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_36")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TestResult<Iterator<Integer>,Void> v_12 = null ;
Iterator<Integer> v_13 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_37")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 19,9,16,11,20,5,20,9,10,13,5,12,1,18,7,20,20,5,18,13 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_9).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
{
  v_12 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_12.checkResult(null) ;
}
if (ok_sofar)
  v_13 = v_12.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_37")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_38")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 16,15,13,7,14,5,4,12,11,16 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(16) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(16) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_38")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_39")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 17,3,6,10,11,3,11,4,5,9,17,17,7,14,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(17) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_9).doCall().checkResult(true) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_11).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(17) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_39")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_40")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 9,14,10,3,4,5,8,20,12,20,8,14 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(14) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(14) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(14) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_40")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_41")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 9,18,5,17 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(9) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(18) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_41")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TestResult<Iterator<Integer>,Void> v_12 = null ;
Iterator<Integer> v_13 = null ;
TestResult<Iterator<Integer>,Void> v_14 = null ;
Iterator<Integer> v_15 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_42")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] {  }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_5).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
{
  v_12 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_12.checkResult(null) ;
}
if (ok_sofar)
  v_13 = v_12.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_14 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_14.checkResult(null) ;
}
if (ok_sofar)
  v_15 = v_14.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_42")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<Iterator<Integer>,Void> v_2 = null ;
Iterator<Integer> v_3 = null ;
TestResult<Iterator<Integer>,Void> v_4 = null ;
Iterator<Integer> v_5 = null ;
TestResult<Iterator<Integer>,Void> v_6 = null ;
Iterator<Integer> v_7 = null ;
TestResult<Iterator<Integer>,Void> v_8 = null ;
Iterator<Integer> v_9 = null ;
TestResult<Iterator<Integer>,Void> v_10 = null ;
Iterator<Integer> v_11 = null ;
TestResult<Iterator<Integer>,Void> v_12 = null ;
Iterator<Integer> v_13 = null ;
TestResult<Iterator<Integer>,Void> v_14 = null ;
Iterator<Integer> v_15 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_43")) ;
if (ok_sofar)
{
  v_0 = new Construct_list(new Integer[] { 2,19,12,7,1,8,13,20,12,18,20,20,17,6,19 }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
{
  v_2 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_2.checkResult(null) ;
}
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_4 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_4.checkResult(null) ;
}
if (ok_sofar)
  v_5 = v_4.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
{
  v_6 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_6.checkResult(null) ;
}
if (ok_sofar)
  v_7 = v_6.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_8 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_8.checkResult(null) ;
}
if (ok_sofar)
  v_9 = v_8.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_9).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
{
  v_10 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_10.checkResult(null) ;
}
if (ok_sofar)
  v_11 = v_10.getValue() ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new Next(v_11).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(2) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_7).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_9).doCall().checkResult(19) ;
if (ok_sofar)
  ok_sofar = new Next(v_7).doCall().checkResult(20) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
  ok_sofar = new HasNext(v_3).doCall().checkResult(false) ;
if (ok_sofar)
{
  v_12 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_12.checkResult(null) ;
}
if (ok_sofar)
  v_13 = v_12.getValue() ;
if (ok_sofar)
{
  v_14 = new Construct_iterator(v_1).doCall() ;
  ok_sofar = v_14.checkResult(null) ;
}
if (ok_sofar)
  v_15 = v_14.getValue() ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_5).doCall().checkResult(new java.util.NoSuchElementException()) ;
if (ok_sofar)
  ok_sofar = new Next(v_3).doCall().checkResult(new java.util.NoSuchElementException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_43")) ;
    ResultsHandler.add_result(new String("iterator"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd4";
}


static class NIteratorUtils {
  static HashMap<Object,String> names = null;
  static Integer nameCounter = 0;

  public static void resetPrinter() {
    names = null;
    nameCounter = 0;
  }

  static String getName(Object obj, String nameType) {
    if (names == null)
      names = new HashMap<Object,String>();
    String name = names.get(obj);
    if (name == null) {
      name = nameType+"_"+nameCounter.toString();
      names.put(obj,name);
      nameCounter++;
    }
    return name;
  }

  public static String printer(Object obj) {
    if (obj instanceof OrderedIterator) {
      return getName(obj, "iterator");
    } else if (obj instanceof PositionList<?>) {
      return getName(obj, "positionlist");
    } else return TestUtils.printer(obj, x -> printer(x));
  }

}




























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";

    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  TestData.message("the call to "+msg+" raised the exception "+exc+
			     " although it should not have");
	  break;
      default:
	  TestData.message(" -- the exception "+exc+" was raised although it "+
			     "should not have been\n"+msg);
	  break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
      
    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
				     TestResult<E,F> result,
				     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
	("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2)) 
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }
  
  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {
    
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();
    
    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
            (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input list "+TestUtils.print(original)+
	     "; it has now the elements "+TestUtils.print(l));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input array "+TestUtils.print(original)+
	       "; it has now the elements "+TestUtils.print(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;
    
    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
	(Integer) majorMethod.invoke(null);
      aedlibMinor = 
	(Integer) minorMethod.invoke(null);
      aedlibPatchlevel = 
	(Integer) patchlevelMethod.invoke(null);

      isOk =
	((aedlibMajor > major)
	 || ((aedlibMajor == major) &&
	     ((aedlibMinor > minor)
	      || ((aedlibMinor == minor) &&
		  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
	("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
	"*** ERROR: aedlib is too old. Minimum version needed is "+
	major+"."+minor+"."+patchlevel+"; your version is "+
	aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
	". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true; 	      
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
	return callString + "  =>  " + getException();
      else
	{
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));
    
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] original, Object[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] original, int[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] original, char[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }
    
    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.LAST,
	   "\nthe call to "+this+" returned null, "+
	   "but should have returned "+TestUtils.print(expected));
	return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
	 "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }      
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}


static class Construct_iterator extends TestCall<Iterator<Integer>,Void>
{
  es.upm.aedlib.positionlist.NodePositionList<Integer> x_1;
  es.upm.aedlib.positionlist.NodePositionList<Integer> x_1_orig;
  
  public Construct_iterator (es.upm.aedlib.positionlist.NodePositionList<Integer> x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new es.upm.aedlib.positionlist.NodePositionList<Integer>(x_1) ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new Iterator<Integer>")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Iterator<Integer> call () 
  {
    return new OrderedIterator(x_1) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    return true ;
  }
  
}


static class Construct_list extends TestCall<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void>
{
  Integer[] x_1;
  Integer[] x_1_orig;
  
  public Construct_list (Integer[] x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = x_1.clone() ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new es.upm.aedlib.positionlist.NodePositionList<Integer>")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.positionlist.NodePositionList<Integer> call () 
  {
    return new es.upm.aedlib.positionlist.NodePositionList<Integer>(x_1) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!unchanged_array(x_1,x_1_orig))
      return false ;
    return true ;
  }
  
}


static class HasNext extends TestCall<Boolean,Boolean>
{
  java.util.Iterator<Integer> x_1;
  
  public HasNext (java.util.Iterator<Integer> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".hasNext")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return x_1.hasNext() ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Next extends TestCall<Integer,Object>
{
  java.util.Iterator<Integer> x_1;
  
  public Next (java.util.Iterator<Integer> x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".next")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return x_1.next() ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}









 
static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
    runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath) 
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);
 
    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) 
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }
 
    return sb.toString();
  }
  
}


static class TesterCode
{
  
  public static void resetPrinter () 
  {
    NIteratorUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return NIteratorUtils.printer(obj) ;
  }
  
}


}
