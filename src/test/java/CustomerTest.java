import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CustomerTest</code> contains tests for the class <code>{@link Customer}</code>.
 *
 * @generatedBy CodePro at 3/9/15 8:02 PM
 * @author Mohit
 * @version $Revision: 1.0 $
 */
public class CustomerTest {
	/**
	 * Run the int compareTo(Customer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 8:02 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		Customer fixture = new Customer();
		fixture.position = 1;
		fixture.items = new Float(1.0f);
		fixture.arrivalTime = new Integer(1);
		fixture.type = new Integer(1);
		Customer o = new Customer();
		o.arrivalTime = new Integer(1);

		int result = fixture.compareTo(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: Customer
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(Customer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 8:02 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		Customer fixture = new Customer();
		fixture.position = 1;
		fixture.items = new Float(1.0f);
		fixture.arrivalTime = new Integer(1);
		fixture.type = new Integer(1);
		Customer o = new Customer();
		o.items = new Float(1.0f);
		o.arrivalTime = new Integer(1);

		int result = fixture.compareTo(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: Customer
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(Customer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 8:02 PM
	 */
	@Test
	public void testCompareTo_3()
		throws Exception {
		Customer fixture = new Customer();
		fixture.position = 1;
		fixture.items = new Float(1.0f);
		fixture.arrivalTime = new Integer(1);
		fixture.type = new Integer(1);
		Customer o = new Customer();
		o.items = new Float(1.0f);
		o.arrivalTime = new Integer(1);
		o.type = new Integer(1);

		int result = fixture.compareTo(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: Customer
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.net.URLClassLoader$1.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(Unknown Source)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(Unknown Source)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/9/15 8:02 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/9/15 8:02 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/9/15 8:02 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CustomerTest.class);
	}
}