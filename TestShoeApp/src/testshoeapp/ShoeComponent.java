/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testshoeapp;
import java.awt.Color;
import javax.swing.*;


/**
 *
 * @author Robert
 */



public class ShoeComponent(String imgSrc) {

	public static void main(String[] args) {
		JPanel redPanel = new JPanel();
		redPanel.setBackground(java.awt.Color.red);
		redPanel.setBounds(0, 0, 250, 250);

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		frame.add(redPanel);


	}

}

