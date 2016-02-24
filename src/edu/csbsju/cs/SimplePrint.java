/**
 * 
 */
package edu.csbsju.cs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author makounniyom
 *
 */
public class SimplePrint implements ActionListener {

	private String name;
	private int age;
	
	public SimplePrint(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println("args[ " + i + " } = " + args[i]);
		}
	}

}
