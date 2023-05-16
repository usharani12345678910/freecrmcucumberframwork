package junitknowledgeprograms;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

import cucumber.api.java.Before;

public class AssumeClass4 {
	@BeforeClass
	public static void assume_method1() {
		Assume.assumeTrue(false);
		System.out.println("assume_method1");
		}
	@Before
	public void assume_method12() {
		Assume.assumeTrue(false);
		System.out.println("assume_method12");
		}
	
	@Test
	public void assume_method2() {
			System.out.println("assume_method2");
			}
	@Test
	public void assume_method3() {
				System.out.println("assume_method3");
				}
}
/* OUTPUT:
org.junit.AssumptionViolatedException: got: <false>, expected: is <true>
	at org.junit.Assume.assumeThat(Assume.java:106)
	at org.junit.Assume.assumeTrue(Assume.java:50)
	at firstday.Assumetrue.assume_method1(Assumetrue.java:12)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.RunBefores.invokeMethod(RunBefores.java:33)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:24)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)*/
