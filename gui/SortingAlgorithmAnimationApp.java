package gui;

import javax.swing.SwingUtilities;

import gui.AppGUI;

/**

* This is The Main Builder File for project......
 * @author Daniel
 * 
 * The driver class.
 */

public class SortingAlgorithmAnimationApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppGUI::new);
    }
}
