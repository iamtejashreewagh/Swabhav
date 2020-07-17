package com.techlabs.model;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class OrgHierarchyFrame extends JFrame{
	public OrgHierarchyFrame() throws Exception {
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(new UrlLoader());
		Employee emp = builder.getPresident();
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(emp.getEmployeeName());
		generateHierarchyFrame(emp, node);
		JTree tree = new JTree(node);
		this.add(tree);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void generateHierarchyFrame(Employee emp, DefaultMutableTreeNode node) {
		for(Employee employee : emp.getEmployees()) {
			DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(employee.getEmployeeName());
			generateHierarchyFrame(employee, newNode);
			node.add(newNode);
		}
	}

}

