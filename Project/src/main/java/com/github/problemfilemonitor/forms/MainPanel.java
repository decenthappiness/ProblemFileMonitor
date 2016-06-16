package com.github.problemfilemonitor.forms;

import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;


public class MainPanel extends JPanel {
	public MainPanel() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		tabbedPane1 = new JTabbedPane();

		//======== this ========
		setLayout(new FormLayout(
			"default:grow",
			"fill:default:grow"));
		add(tabbedPane1, CC.xy(1, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JTabbedPane tabbedPane1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
