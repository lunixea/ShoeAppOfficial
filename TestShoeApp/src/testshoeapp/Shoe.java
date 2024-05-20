/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testshoeapp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;


/**
 *
 * @author Robert
 */



public class Shoe {

	public static void main(String[] args) {

		Icon image = new ImageIcon("C:\\Users\\rober_dn6274j\\Downloads\\adidas-superstar-eg4959-thumb.jpg");


		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750, 750);
		frame.setLayout(new FlowLayout());
		for (int i = 0; i < 5; i++) {
			JPanel shoePanel = new JPanel(new BorderLayout());

			shoePanel.setBackground(java.awt.Color.white);
			shoePanel.setBounds(0, 0, 100, 100);

			JLabel imageLabel = new JLabel();
			imageLabel.setIcon(image);

			JLayeredPane imagePane = new PictureBox();;
//			imagePane.setImage(image);

			JLabel label = new JLabel();
			label.setText("Adidas Super Star");

			shoePanel.add(imageLabel, BorderLayout.NORTH);
			shoePanel.add(label, BorderLayout.SOUTH);

			frame.add(shoePanel);
		}
		frame.setVisible(true);
	}

}

