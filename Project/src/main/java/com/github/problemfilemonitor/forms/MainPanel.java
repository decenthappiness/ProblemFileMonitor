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
		lookForLabel1 = new JLabel();
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
		programSettingsLabel = new JLabel();
		repeatScanCheckBox = new JCheckBox();
		scanPeriodComboBox = new JComboBox<>();
		atLabel = new JLabel();
		scanTimeComboBox = new JComboBox();
		minimizeToSystemTrayCheckBox = new JCheckBox();
		fileFoundPopupNotificationCheckBox = new JCheckBox();
		keepNotificationsOpenUntilCloseClickedCheckBox = new JCheckBox();
		panel1 = new JPanel();
		runScanButton = new JButton();
		saveDefaultSettingsButton = new JButton();
		helpButton = new JButton();
		rootDirectoriesLabel = new JLabel();
		addRootDirectoriesButton = new JButton();
		rootDirectoriesScrollPane = new JScrollPane();
		rootDirectoriesTextPane = new JTextPane();
		ignoreDirectoriesLabel = new JLabel();
		addIgnoreDirectoriesButton1 = new JButton();
		ignoreDirectoriesScrollPane = new JScrollPane();
		ignoreDirectoriesTextPane = new JTextPane();
		resultsPanel = new JPanel();
		resultsLabel = new JLabel();
		openParentDirectoryCheckBox1 = new JCheckBox();
		clearResultsButton1 = new JButton();
		resultsScrollPane = new JScrollPane();
		resultsTextPane = new JTextPane();

		//======== this ========
		setLayout(new FormLayout(
			"default:grow",
			"fill:default:grow"));

		//======== mainTabPane ========
		{

			//======== scanSettingsPanel ========
			{
				scanSettingsPanel.setLayout(new FormLayout(
					"$ugap, 109dlu, default, 47dlu, 26dlu, $ugap, 318dlu, 2*($ugap, ${growing-button})",
					"2*(default), $pgap, default, $rgap, fill:[60px,default]:grow, 2*(default), $rgap, fill:[60px,default]:grow, $lgap, default"));

				//======== searchParameterPanel ========
				{
					searchParameterPanel.setLayout(new FormLayout(
						"$ugap, 2*(pref), $rgap, 40dlu, $rgap, pref, $ugap",
						"5*($pgap, default), $pgap"));

					//---- lookForLabel1 ----
					lookForLabel1.setText(bundle.getString("MainForm.lookForLabel1.text"));
					searchParameterPanel.add(lookForLabel1, CC.xy(2, 2));

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
				scanSettingsPanel.add(searchParameterPanel, CC.xywh(2, 2, 4, 1));

				//======== programSettingsPanel ========
				{
					programSettingsPanel.setLayout(new FormLayout(
						"$ugap, default, $rgap, 41dlu, 2*($rgap, default), 2*($ugap)",
						"5*($pgap, default), $ugap"));

					//---- programSettingsLabel ----
					programSettingsLabel.setText(bundle.getString("MainForm.programSettingsLabel.text"));
					programSettingsPanel.add(programSettingsLabel, CC.xy(2, 2));

					//---- repeatScanCheckBox ----
					repeatScanCheckBox.setText(bundle.getString("MainForm.repeatScanCheckBox.text"));
					programSettingsPanel.add(repeatScanCheckBox, CC.xy(2, 4));

					//---- scanPeriodComboBox ----
					scanPeriodComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
						"Hourly",
						"Odd hours",
						"Daily",
						"Odd days",
						"Weekly"
					}));
					scanPeriodComboBox.setSelectedIndex(2);
					programSettingsPanel.add(scanPeriodComboBox, CC.xy(4, 4));

					//---- atLabel ----
					atLabel.setText(bundle.getString("MainForm.atLabel.text"));
					programSettingsPanel.add(atLabel, CC.xy(6, 4));
					programSettingsPanel.add(scanTimeComboBox, CC.xy(8, 4));

					//---- minimizeToSystemTrayCheckBox ----
					minimizeToSystemTrayCheckBox.setText(bundle.getString("MainForm.minimizeToSystemTrayCheckBox.text"));
					programSettingsPanel.add(minimizeToSystemTrayCheckBox, CC.xy(2, 6));

					//---- fileFoundPopupNotificationCheckBox ----
					fileFoundPopupNotificationCheckBox.setText(bundle.getString("MainForm.fileFoundPopupNotificationCheckBox.text"));
					programSettingsPanel.add(fileFoundPopupNotificationCheckBox, CC.xy(2, 8));

					//---- keepNotificationsOpenUntilCloseClickedCheckBox ----
					keepNotificationsOpenUntilCloseClickedCheckBox.setText(bundle.getString("MainForm.keepNotificationsOpenUntilCloseClickedCheckBox.text"));
					programSettingsPanel.add(keepNotificationsOpenUntilCloseClickedCheckBox, CC.xy(2, 10));
				}
				scanSettingsPanel.add(programSettingsPanel, CC.xy(7, 2));

				//======== panel1 ========
				{
					panel1.setLayout(new FormLayout(
						"3*(default)",
						"2*(default), 2*($ugap, default), default"));

					//---- runScanButton ----
					runScanButton.setText(bundle.getString("MainForm.runScanButton.text"));
					panel1.add(runScanButton, CC.xy(2, 2));

					//---- saveDefaultSettingsButton ----
					saveDefaultSettingsButton.setText(bundle.getString("MainForm.saveDefaultSettingsButton.text"));
					panel1.add(saveDefaultSettingsButton, CC.xy(2, 4));

					//---- helpButton ----
					helpButton.setText(bundle.getString("MainForm.helpButton.text"));
					panel1.add(helpButton, CC.xy(2, 6));
				}
				scanSettingsPanel.add(panel1, CC.xy(9, 2));

				//---- rootDirectoriesLabel ----
				rootDirectoriesLabel.setText(bundle.getString("MainForm.rootDirectoriesLabel.text"));
				scanSettingsPanel.add(rootDirectoriesLabel, CC.xy(2, 4));

				//---- addRootDirectoriesButton ----
				addRootDirectoriesButton.setText(bundle.getString("MainForm.addRootDirectoriesButton.text"));
				scanSettingsPanel.add(addRootDirectoriesButton, CC.xy(4, 4));

				//======== rootDirectoriesScrollPane ========
				{
					rootDirectoriesScrollPane.setViewportView(rootDirectoriesTextPane);
				}
				scanSettingsPanel.add(rootDirectoriesScrollPane, CC.xywh(2, 6, 9, 1));

				//---- ignoreDirectoriesLabel ----
				ignoreDirectoriesLabel.setText(bundle.getString("MainForm.ignoreDirectoriesLabel.text"));
				scanSettingsPanel.add(ignoreDirectoriesLabel, CC.xy(2, 8));

				//---- addIgnoreDirectoriesButton1 ----
				addIgnoreDirectoriesButton1.setText(bundle.getString("MainForm.addIgnoreDirectoriesButton1.text"));
				scanSettingsPanel.add(addIgnoreDirectoriesButton1, CC.xy(4, 8));

				//======== ignoreDirectoriesScrollPane ========
				{
					ignoreDirectoriesScrollPane.setViewportView(ignoreDirectoriesTextPane);
				}
				scanSettingsPanel.add(ignoreDirectoriesScrollPane, CC.xywh(2, 10, 9, 1));
			}
			mainTabPane.addTab(bundle.getString("MainForm.scanSettingsPanel.tab.title"), scanSettingsPanel);

			//======== resultsPanel ========
			{
				resultsPanel.setLayout(new FormLayout(
					"$ugap, default, [50dlu,default,200dlu], 6*(default)",
					"5*(default)"));

				//---- resultsLabel ----
				resultsLabel.setText(bundle.getString("MainForm.resultsLabel.text"));
				resultsPanel.add(resultsLabel, CC.xy(2, 2));

				//---- openParentDirectoryCheckBox1 ----
				openParentDirectoryCheckBox1.setText(bundle.getString("MainForm.openParentDirectoryCheckBox1.text"));
				resultsPanel.add(openParentDirectoryCheckBox1, CC.xy(4, 2));

				//---- clearResultsButton1 ----
				clearResultsButton1.setText(bundle.getString("MainForm.clearResultsButton1.text"));
				resultsPanel.add(clearResultsButton1, CC.xy(6, 2));

				//======== resultsScrollPane ========
				{
					resultsScrollPane.setViewportView(resultsTextPane);
				}
				resultsPanel.add(resultsScrollPane, CC.xywh(2, 4, 6, 1));
			}
			mainTabPane.addTab(bundle.getString("MainForm.resultsPanel.tab.title"), resultsPanel);
		}
		add(mainTabPane, CC.xy(1, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JTabbedPane mainTabPane;
	private JPanel scanSettingsPanel;
	private JPanel searchParameterPanel;
	private JLabel lookForLabel1;
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
	private JLabel programSettingsLabel;
	private JCheckBox repeatScanCheckBox;
	private JComboBox<String> scanPeriodComboBox;
	private JLabel atLabel;
	private JComboBox scanTimeComboBox;
	private JCheckBox minimizeToSystemTrayCheckBox;
	private JCheckBox fileFoundPopupNotificationCheckBox;
	private JCheckBox keepNotificationsOpenUntilCloseClickedCheckBox;
	private JPanel panel1;
	private JButton runScanButton;
	private JButton saveDefaultSettingsButton;
	private JButton helpButton;
	private JLabel rootDirectoriesLabel;
	private JButton addRootDirectoriesButton;
	private JScrollPane rootDirectoriesScrollPane;
	private JTextPane rootDirectoriesTextPane;
	private JLabel ignoreDirectoriesLabel;
	private JButton addIgnoreDirectoriesButton1;
	private JScrollPane ignoreDirectoriesScrollPane;
	private JTextPane ignoreDirectoriesTextPane;
	private JPanel resultsPanel;
	private JLabel resultsLabel;
	private JCheckBox openParentDirectoryCheckBox1;
	private JButton clearResultsButton1;
	private JScrollPane resultsScrollPane;
	private JTextPane resultsTextPane;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
