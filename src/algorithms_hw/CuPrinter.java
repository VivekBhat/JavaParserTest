package algorithms_hw;

import java.io.FileInputStream;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class CuPrinter {

	public static void main(String[] args) throws Exception {
		// creates an input stream for the file to be parsed
		FileInputStream in = new FileInputStream(
				"/Users/vivekbhat/Google Drive/MACBOOK/Downloads/SamplePrograms/src/algorithms_hw/PracticeProgram.java");

		// parse the file
		CompilationUnit cu = JavaParser.parse(in);

		// prints the resulting compilation unit to default system output
		// System.out.println(cu.toString());

		// visit and print the methods names
		new MethodVisitor().visit(cu, null);
		new IfStmtVisitor().visit(cu, null);

	}

	/**
	 * Simple visitor implementation for visiting MethodDeclaration nodes.
	 */
	private static class MethodVisitor extends VoidVisitorAdapter<Void> {
		@Override
		public void visit(MethodDeclaration n, Void arg) {
			/*
			 * here you can access the attributes of the method. this method
			 * will be called for all methods in this CompilationUnit, including
			 * inner class methods
			 */
			System.out.println(n.getName());
			super.visit(n, arg);
		}
	}

	/**
	 * Simple visitor implementation for visiting MethodDeclaration nodes.
	 */
	private static class IfStmtVisitor extends VoidVisitorAdapter<Void> {
		@Override
		public void visit(IfStmt n, Void arg) {
			/*
			 * here you can access the attributes of the method. this method
			 * will be called for all methods in this CompilationUnit, including
			 * inner class methods
			 */
			System.out.println(n.getCondition());
			if (n.getCondition().toString().contains(">")) {
				System.out.println(" YES > is present \n");
				String inp = n.getCondition().toString();
				// System.out.println(inp);
				String inp2 = inp.replace(">", "!=");
				// n.setCondition();
			}
			super.visit(n, arg);
		}
	}
}
