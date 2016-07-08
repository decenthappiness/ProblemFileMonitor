package com.github.problemfilemonitor.forms;

import java.util.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;


public class MainPanel extends JPanel {
	public MainPanel() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		ResourceBundle bundle = ResourceBundle.getBundle("TranslationResources");
		mainTabPane = new JTabbedPane();
		scanSettingsPanel = new JPanel();
		searchParameterPanel = new JPanel();
		LookForLabel1 = new JLabel();
		longFilePathsCheckBox = new JCheckBox();
		longFilePathsGElabel = new JLabel();
		longFilePathsCharacterThresholdTextField = new JTextField();
		label4 = new JLabel();
		largeFilesCheckBox = new JCheckBox();
		largeFilesGElabel = new JLabel();
		largeFilesFilesizeTextField = new JTextField();
		largeFilesFilesizeUnitsComboBox = new JComboBox<>();
		smallFilesCheckBox = new JCheckBox();
		smallFilesLElabel = new JLabel();
		smallFilesFilesizeTextField = new JTextField();
		smallFilesFilesizeUnitsComboBox = new JComboBox<>();
		clumpsOfSmallFilesCheckBox = new JCheckBox();
		clumpsOfSmallFilesGElabel = new JLabel();
		clumpsOfSmallFilesClumpSizeThresholdTextField = new JTextField();
		clumpsOfSmallFilesSmallFilesLabel = new JLabel();
		programSettingsPanel = new JPanel();
		runScanButton = new JButton();
		saveDefaultSettingsButton = new JButton();
		helpButton = new JButton();
		rootDirectoriesLabel = new JLabel();
		addRootDirectoriesButton = new JButton();
		rootDirectoriesScrollPane = new JScrollPane();
		rootDirectoriesTextPanel = new JTextPane();
		ignoreDirectoriesLabel = new JLabel();
		addIgnoreDirectoriesButton1 = new JButton();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();

		//======== this ========
		setLayout(new FormLayout(
			"default:grow",
			"fill:default:grow"));

		//======== mainTabPane ========
		{

			//======== scanSettingsPanel ========
			{
				scanSettingsPanel.setLayout(new FormLayout(
					"default, 109dlu, default, 47dlu, 75dlu, default, 279dlu, 4*(default)",
					"7*(default), 65dlu, 3*(default), 15dlu, 5*(default)"));

				//======== searchParameterPanel ========
				{
					searchParameterPanel.setLayout(new FormLayout(
						"$ugap, 2*(pref), $rgap, 40dlu, $rgap, pref, $ugap",
						"5*($pgap, default), $pgap"));

					//---- LookForLabel1 ----
					LookForLabel1.setText(bundle.getString("MainForm.LookForLabel1.text"));
					searchParameterPanel.add(LookForLabel1, CC.xy(2, 2));

					//---- longFilePathsCheckBox ----
					longFilePathsCheckBox.setText(bundle.getString("MainForm.longFilePathsCheckBox.text"));
					searchParameterPanel.add(longFilePathsCheckBox, CC.xy(2, 4));

					//---- longFilePathsGElabel ----
					longFilePathsGElabel.setText(bundle.getString("MainForm.longFilePathsGElabel.text"));
					searchParameterPanel.add(longFilePathsGElabel, CC.xy(3, 4));
					searchParameterPanel.add(longFilePathsCharacterThresholdTextField, CC.xy(5, 4));

					//---- label4 ----
					label4.setText(bundle.getString("MainForm.label4.text"));
					searchParameterPanel.add(label4, CC.xy(7, 4));

					//---- largeFilesCheckBox ----
					largeFilesCheckBox.setText(bundle.getString("MainForm.largeFilesCheckBox.text"));
					searchParameterPanel.add(largeFilesCheckBox, CC.xy(2, 6));

					//---- largeFilesGElabel ----
					largeFilesGElabel.setText(bundle.getString("MainForm.largeFilesGElabel.text"));
					searchParameterPanel.add(largeFilesGElabel, CC.xy(3, 6));
					searchParameterPanel.add(largeFilesFilesizeTextField, CC.xy(5, 6));

					//---- largeFilesFilesizeUnitsComboBox ----
					largeFilesFilesizeUnitsComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
						"Bytes",
						"KB",
						"MB",
						"GB"
					}));
					largeFilesFilesizeUnitsComboBox.setSelectedIndex(2);
					searchParameterPanel.add(largeFilesFilesizeUnitsComboBox, CC.xy(7, 6));

					//---- smallFilesCheckBox ----
					smallFilesCheckBox.setText(bundle.getString("MainForm.smallFilesCheckBox.text"));
					searchParameterPanel.add(smallFilesCheckBox, CC.xy(2, 8));

					//---- smallFilesLElabel ----
					smallFilesLElabel.setText(bundle.getString("MainForm.smallFilesLElabel.text"));
					searchParameterPanel.add(smallFilesLElabel, CC.xy(3, 8));
					searchParameterPanel.add(smallFilesFilesizeTextField, CC.xy(5, 8));

					//---- smallFilesFilesizeUnitsComboBox ----
					smallFilesFilesizeUnitsComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
						"Bytes",
						"KB",
						"MB",
						"GB"
					}));
					smallFilesFilesizeUnitsComboBox.setSelectedIndex(0);
					searchParameterPanel.add(smallFilesFilesizeUnitsComboBox, CC.xy(7, 8));

					//---- clumpsOfSmallFilesCheckBox ----
					clumpsOfSmallFilesCheckBox.setText(bundle.getString("MainForm.clumpsOfSmallFilesCheckBox.text"));
					searchParameterPanel.add(clumpsOfSmallFilesCheckBox, CC.xy(2, 10));

					//---- clumpsOfSmallFilesGElabel ----
					clumpsOfSmallFilesGElabel.setText(bundle.getString("MainForm.clumpsOfSmallFilesGElabel.text"));
					searchParameterPanel.add(clumpsOfSmallFilesGElabel, CC.xy(3, 10));
					searchParameterPanel.add(clumpsOfSmallFilesClumpSizeThresholdTextField, CC.xy(5, 10));

					//---- clumpsOfSmallFilesSmallFilesLabel ----
					clumpsOfSmallFilesSmallFilesLabel.setText(bundle.getString("MainForm.clumpsOfSmallFilesSmallFilesLabel.text"));
					searchParameterPanel.add(clumpsOfSmallFilesSmallFilesLabel, CC.xy(7, 10));
				}
				scanSettingsPanel.add(searchParameterPanel, CC.xywh(2, 2, 4, 7));

				//======== programSettingsPanel ========
				{
					programSettingsPanel.setLayout(new FormLayout(
						"10*(default)",
						"11*(default)"));
				}
				scanSettingsPanel.add(programSettingsPanel, CC.xywh(7, 2, 1, 7));

				//---- runScanButton ----
				runScanButton.setText(bundle.getString("MainForm.runScanButton.text"));
				scanSettingsPanel.add(runScanButton, CC.xy(9, 3));

				//---- saveDefaultSettingsButton ----
				saveDefaultSettingsButton.setText(bundle.getString("MainForm.saveDefaultSettingsButton.text"));
				scanSettingsPanel.add(saveDefaultSettingsButton, CC.xy(9, 5));

				//---- helpButton ----
				helpButton.setText(bundle.getString("MainForm.helpButton.text"));
				scanSettingsPanel.add(helpButton, CC.xy(9, 7));

				//---- rootDirectoriesLabel ----
				rootDirectoriesLabel.setText(bundle.getString("MainForm.rootDirectoriesLabel.text"));
				scanSettingsPanel.add(rootDirectoriesLabel, CC.xy(2, 10));

				//---- addRootDirectoriesButton ----
				addRootDirectoriesButton.setText(bundle.getString("MainForm.addRootDirectoriesButton.text"));
				scanSettingsPanel.add(addRootDirectoriesButton, CC.xy(4, 10));

				//======== rootDirectoriesScrollPane ========
				{
					rootDirectoriesScrollPane.setViewportView(rootDirectoriesTextPanel);
				}
				scanSettingsPanel.add(rootDirectoriesScrollPane, CC.xywh(2, 12, 9, 1));

				//---- ignoreDirectoriesLabel ----
				ignoreDirectoriesLabel.setText(bundle.getString("MainForm.ignoreDirectoriesLabel.text"));
				scanSettingsPanel.add(ignoreDirectoriesLabel, CC.xy(2, 14));

				//---- addIgnoreDirectoriesButton1 ----
				addIgnoreDirectoriesButton1.setText(bundle.getString("MainForm.addIgnoreDirectoriesButton1.text"));
				scanSettingsPanel.add(addIgnoreDirectoriesButton1, CC.xy(4, 14));

				//======== scrollPane1 ========
				{
					scrollPane1.setViewportView(textPane1);
				}
				scanSettingsPanel.add(scrollPane1, CC.xywh(2, 16, 9, 1));
			}
			mainTabPane.addTab(bundle.getString("MainForm.scanSettingsPanel.tab.title"), scanSettingsPanel);
		}
		add(mainTabPane, CC.xy(1, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JTabbedPane mainTabPane;
	private JPanel scanSettingsPanel;
	private JPanel searchParameterPanel;
	private JLabel LookForLabel1;
	private JCheckBox longFilePathsCheckBox;
	private JLabel longFilePathsGElabel;
	private JTextField longFilePathsCharacterThresholdTextField;
	private JLabel label4;
	private JCheckBox largeFilesCheckBox;
	private JLabel largeFilesGElabel;
	private JTextField largeFilesFilesizeTextField;
	private JComboBox<String> largeFilesFilesizeUnitsComboBox;
	private JCheckBox smallFilesCheckBox;
	private JLabel smallFilesLElabel;
	private JTextField smallFilesFilesizeTextField;
	private JComboBox<String> smallFilesFilesizeUnitsComboBox;
	private JCheckBox clumpsOfSmallFilesCheckBox;
	private JLabel clumpsOfSmallFilesGElabel;
	private JTextField clumpsOfSmallFilesClumpSizeThresholdTextField;
	private JLabel clumpsOfSmallFilesSmallFilesLabel;
	private JPanel programSettingsPanel;
	private JButton runScanButton;
	private JButton saveDefaultSettingsButton;
	private JButton helpButton;
	private JLabel rootDirectoriesLabel;
	private JButton addRootDirectoriesButton;
	private JScrollPane rootDirectoriesScrollPane;
	private JTextPane rootDirectoriesTextPanel;
	private JLabel ignoreDirectoriesLabel;
	private JButton addIgnoreDirectoriesButton1;
	private JScrollPane scrollPane1;
	private JTextPane textPane1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
