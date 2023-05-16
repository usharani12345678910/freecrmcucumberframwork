package junitknowledgeprograms;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MethodwiserunClass2 {

	@BeforeClass 
		public  static void method1() {
			System.out.println("Beforeclass");}
		@Before
		public void method2() {
			System.out.println("before");}
		@After
		public void method3() {
			System.out.println("after");}
		@AfterClass 
		public static void method4() {
			System.out.println("afterclass");}
		@Test
		public void method5() {
			System.out.println("testcase5");}
		@Test
		public void method6() {
			System.out.println("testcase6");}
		@Test
			public void method7() {
				System.out.println("testcase7");}
		@Test @Ignore
				public void method8() {
					System.out.println("testcase8");}

					public void method9() {
						System.out.println("method9");}
		}
/*output:
Beforeclass
testcase5
testcase6
testcase7
afterclass*/
