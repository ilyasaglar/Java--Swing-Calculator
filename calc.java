import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class calc extends JFrame {

	
	private boolean zerodisp;
	private boolean decdisp;
	private boolean dgrrad;
	private boolean sh;
	private byte islem;
	private double sayi1;
	private double sayi2;
	private double cikis;

	public calc() {
		setAlwaysOnTop(true);
		setResizable(false);
		Butonlar();
	}

	private void Butonlar() {

		buttonGroup1 = new ButtonGroup();
		ekranUst = new JTextField();
		ekranUst.setVisible(false);
		ekranUst.setFont(new Font("Tahoma", Font.BOLD, 26));
		ekranAlt = new JTextField();
		ekranAlt.setFont(new Font("Tahoma", Font.BOLD, 26));
		onedivided = new JButton();
		onedivided.setFont(new Font("Tahoma", Font.BOLD, 20));
		yuzde = new JButton();
		yuzde.setFont(new Font("Tahoma", Font.BOLD, 20));
		seven = new JButton();
		seven.setFont(new Font("Tahoma", Font.BOLD, 20));
		eight = new JButton();
		eight.setFont(new Font("Tahoma", Font.BOLD, 20));
		nine = new JButton();
		nine.setFont(new Font("Tahoma", Font.BOLD, 20));
		toplama = new JButton();
		toplama.setFont(new Font("Tahoma", Font.BOLD, 20));
		kareAlma = new JButton();
		kareAlma.setFont(new Font("Tahoma", Font.BOLD, 20));
		cikarma = new JButton();
		cikarma.setFont(new Font("Tahoma", Font.BOLD, 20));
		kokAlma = new JButton();
		kokAlma.setFont(new Font("Tahoma", Font.BOLD, 20));
		carpma = new JButton();
		carpma.setFont(new Font("Tahoma", Font.BOLD, 20));
		kupAlma = new JButton();
		kupAlma.setFont(new Font("Tahoma", Font.BOLD, 20));
		bolme = new JButton();
		bolme.setFont(new Font("Tahoma", Font.BOLD, 20));
		four = new JButton();
		four.setFont(new Font("Tahoma", Font.BOLD, 20));
		five = new JButton();
		five.setFont(new Font("Tahoma", Font.BOLD, 20));
		six = new JButton();
		six.setFont(new Font("Tahoma", Font.BOLD, 20));
		one = new JButton();
		one.setFont(new Font("Tahoma", Font.BOLD, 20));
		two = new JButton();
		two.setFont(new Font("Tahoma", Font.BOLD, 20));
		three = new JButton();
		three.setFont(new Font("Tahoma", Font.BOLD, 20));
		negatif = new JButton();
		negatif.setFont(new Font("Tahoma", Font.BOLD, 20));
		decpoint = new JButton();
		decpoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		zero = new JButton();
		zero.setFont(new Font("Tahoma", Font.BOLD, 20));
		equals = new JButton();
		equals.setFont(new Font("Tahoma", Font.BOLD, 20));
		silme = new JButton();
		silme.setIcon(
				new ImageIcon("C:\\Users\\ilyas\\Desktop\\2015-2016\\bilge adam\\ClockAlgorithm\\Swing\\delete1.png"));
		silme.setFont(new Font("Tahoma", Font.BOLD, 20));
		temizle = new JButton();
		temizle.setFont(new Font("Tahoma", Font.BOLD, 20));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SWİNG İLE HESAP MAKİNESİ");

		ekranUst.setBackground(new java.awt.Color(199, 210, 200));
		ekranUst.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		ekranUst.setFocusable(false);

		ekranAlt.setBackground(new java.awt.Color(199, 210, 250));
		ekranAlt.setText("LEBLEBİ");
		ekranAlt.setAutoscrolls(false);
		ekranAlt.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		ekranAlt.setFocusable(false);

		onedivided.setText("1/x");
		onedivided.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		onedivided.setCursor(new Cursor(Cursor.HAND_CURSOR));
		onedivided.setFocusable(false);
		onedivided.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				onedividedActionPerformed(evt);
			}
		});

		yuzde.setText("%");
		yuzde.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		yuzde.setCursor(new Cursor(Cursor.HAND_CURSOR));
		yuzde.setFocusable(false);
		yuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				yuzdeActionPerformed(evt);
			}
		});

		seven.setText("7");
		seven.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
		seven.setCursor(new Cursor(Cursor.HAND_CURSOR));
		seven.setFocusable(false);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				sevenActionPerformed(evt);
			}
		});

		eight.setText("8");
		eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		eight.setFocusable(false);
		eight.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				eightActionPerformed(evt);
			}
		});

		nine.setText("9");
		nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		nine.setFocusable(false);
		nine.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nineActionPerformed(evt);
			}
		});

		toplama.setText("+");
		toplama.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		toplama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		toplama.setFocusable(false);
		toplama.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				toplamaActionPerformed(evt);
			}
		});

		kareAlma.setText("x²");
		kareAlma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		kareAlma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		kareAlma.setFocusable(false);
		kareAlma.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				kareAlmaActionPerformed(evt);
			}
		});

		cikarma.setText("-");
		cikarma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		cikarma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		cikarma.setFocusable(false);
		cikarma.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cikarmaActionPerformed(evt);
			}
		});

		kokAlma.setText("√");
		kokAlma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		kokAlma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		kokAlma.setFocusable(false);
		kokAlma.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				kokAlmaActionPerformed(evt);
			}
		});

		carpma.setText("*");
		carpma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		carpma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		carpma.setFocusable(false);
		carpma.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				carpmaActionPerformed(evt);
			}
		});

		kupAlma.setText("x³");
		kupAlma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		kupAlma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		kupAlma.setFocusable(false);
		kupAlma.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				kupAlmaActionPerformed(evt);
			}
		});

		bolme.setText("/");
		bolme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		bolme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		bolme.setFocusable(false);
		bolme.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bolmeActionPerformed(evt);
			}
		});

		four.setText("4");
		four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		four.setFocusable(false);
		four.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fourActionPerformed(evt);
			}
		});

		five.setText("5");
		five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		five.setFocusable(false);
		five.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fiveActionPerformed(evt);
			}
		});

		six.setText("6");
		six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		six.setFocusable(false);
		six.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sixActionPerformed(evt);
			}
		});

		one.setText("1");
		one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		one.setFocusable(false);
		one.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				oneActionPerformed(evt);
			}
		});

		two.setText("2");
		two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		two.setFocusable(false);
		two.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				twoActionPerformed(evt);
			}
		});

		three.setText("3");
		three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		three.setFocusable(false);
		three.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				threeActionPerformed(evt);
			}
		});

		negatif.setText("±");
		negatif.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		negatif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		negatif.setFocusable(false);
		negatif.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				negatifActionPerformed(evt);
			}
		});

		decpoint.setText(".");
		decpoint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		decpoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		decpoint.setFocusable(false);
		decpoint.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				noktatActionPerformed(evt);
			}
		});

		zero.setText("0");
		zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		zero.setFocusable(false);
		zero.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				zeroActionPerformed(evt);
			}
		});

		equals.setText("=");
		equals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		equals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		equals.setFocusable(false);
		equals.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				esittirActionPerformed(evt);
			}
		});

		silme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		silme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		silme.setFocusable(false);
		silme.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				silmeActionPerformed(evt);
			}
		});

		temizle.setText("C");
		temizle.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		temizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		temizle.setFocusable(false);
		temizle.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				temizleActionPerformed(evt);
			}
		});

		leblebi = new JButton("LEB");
		leblebi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekranAlt.setText("LEBLEBİ");
			}
		});
		leblebi.setFont(new Font("Tahoma", Font.BOLD, 17));

		ozluSoz = new JLabel("Hesap makinesi ellerden yüreklere düştü. Alın size teknolojik devrim!");
		ozluSoz.setFont(new Font("Tahoma", Font.BOLD, 12));

		label = new JLabel("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(ozluSoz, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
								.addComponent(ekranUst, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
								.addComponent(ekranAlt, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(yuzde, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
												.addComponent(onedivided, Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
												.addComponent(kupAlma, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 82,
														Short.MAX_VALUE)
												.addComponent(kokAlma, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
												.addComponent(kareAlma, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 82,
														Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(leblebi, 0, 0, Short.MAX_VALUE)
												.addComponent(four, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
												.addComponent(one, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85,
														Short.MAX_VALUE)
												.addComponent(zero, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85,
														Short.MAX_VALUE)
												.addComponent(seven, GroupLayout.PREFERRED_SIZE, 85,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(two, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
												.addComponent(five, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
												.addComponent(decpoint, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
												.addComponent(eight, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
												.addComponent(temizle, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(nine, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
												.addComponent(three, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
												.addComponent(silme, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
												.addComponent(negatif, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
												.addComponent(six, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(bolme, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
												.addComponent(carpma, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
												.addComponent(equals, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 75,
														Short.MAX_VALUE)
												.addComponent(cikarma, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														75, Short.MAX_VALUE)
												.addComponent(toplama, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 75,
														Short.MAX_VALUE))))
								.addContainerGap())
						.addGroup(layout.createSequentialGroup().addComponent(label).addGap(108)))));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap().addComponent(ekranUst, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(ekranAlt, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(silme, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(temizle, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
								.addComponent(yuzde, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addComponent(bolme, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE).addComponent(
								leblebi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addComponent(seven, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addComponent(kokAlma, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addComponent(eight, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(nine, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(carpma, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup()
								.addComponent(cikarma, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(three, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(toplama, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(kareAlma, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(six, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
								.addComponent(four, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
								.addComponent(five, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(kupAlma, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(one, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(two, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))))
				.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(onedivided, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(negatif, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(equals, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 83,
												Short.MAX_VALUE))
								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(zero, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(decpoint, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 83,
												Short.MAX_VALUE))))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(ozluSoz, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE).addGap(2)
				.addComponent(label).addContainerGap()));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void zeroActionPerformed(ActionEvent evt) {// GEN-FIRST:event_zeroActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "0");
	}// GEN-LAST:event_zeroActionPerformed

	private void oneActionPerformed(ActionEvent evt) {// GEN-FIRST:event_oneActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "1");
		zerodisp = true;
	}// GEN-LAST:event_oneActionPerformed

	private void twoActionPerformed(ActionEvent evt) {// GEN-FIRST:event_twoActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "2");
		zerodisp = true;
	}// GEN-LAST:event_twoActionPerformed

	private void threeActionPerformed(ActionEvent evt) {// GEN-FIRST:event_threeActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "3");
		zerodisp = true;
	}// GEN-LAST:event_threeActionPerformed

	private void fourActionPerformed(ActionEvent evt) {// GEN-FIRST:event_fourActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "4");
		zerodisp = true;
	}// GEN-LAST:event_fourActionPerformed

	private void fiveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fiveActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "5");
		zerodisp = true;
	}// GEN-LAST:event_fiveActionPerformed

	private void sixActionPerformed(ActionEvent evt) {// GEN-FIRST:event_sixActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "6");
		zerodisp = true;
	}// GEN-LAST:event_sixActionPerformed

	private void sevenActionPerformed(ActionEvent evt) {// GEN-FIRST:event_sevenActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "7");
		zerodisp = true;
	}// GEN-LAST:event_sevenActionPerformed

	private void eightActionPerformed(ActionEvent evt) {// GEN-FIRST:event_eightActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "8");
		zerodisp = true;
	}// GEN-LAST:event_eightActionPerformed

	private void nineActionPerformed(ActionEvent evt) {// GEN-FIRST:event_nineActionPerformed
		if (!zerodisp && !decdisp) {
			ekranAlt.setText(null);
		}
		ekranAlt.setText(ekranAlt.getText() + "9");
		zerodisp = true;
	}// GEN-LAST:event_nineActionPerformed

	private void noktatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_decpointActionPerformed
		if (!decdisp) {
			ekranAlt.setText(ekranAlt.getText() + ".");
			decdisp = true;
		}
	}// GEN-LAST:event_decpointActionPerformed

	private void negatifActionPerformed(ActionEvent evt) {// GEN-FIRST:event_negateActionPerformed
		sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		cikis = sayi2 * -1;

		if (cikis > -100000000 && cikis < 100000000) {
			if ((int) cikis == cikis) {
				// for you, StackOverflowException
				ekranAlt.setText(Integer.toString((int) cikis));
			} else {
				String.valueOf(cikis);
				ekranAlt.setText(String.valueOf(cikis));
			}
		} else {
			ekranAlt.setText("Error");
		}
		decdisp = true;
		cikis = 0;
	}// GEN-LAST:event_negateActionPerformed

	private void silmeActionPerformed(ActionEvent evt) {// GEN-FIRST:event_clearActionPerformed
		String str = ekranAlt.getText();
		str = str.substring(0, str.length() - 1);
		ekranAlt.setText(str);
		zerodisp = false;
		decdisp = false;
	}// GEN-LAST:event_clearActionPerformed

	private void temizleActionPerformed(ActionEvent evt) {// GEN-FIRST:event_resetActionPerformed
		ekranAlt.setText("0");
		ekranUst.setText(null);
		zerodisp = false;
		decdisp = false;
		sayi1 = 0;
		sayi2 = 0;
		cikis = 0;
	}// GEN-LAST:event_resetActionPerformed

	private void onedividedActionPerformed(ActionEvent evt) {// GEN-FIRST:event_onedividedbyxActionPerformed
		sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		cikis = 1 / sayi2;

		if (cikis > -100000000 && cikis < 100000000) {
			if ((int) cikis == cikis) {
				// for you, StackOverflowException
				ekranAlt.setText(Integer.toString((int) cikis));
			} else {
				
				ekranAlt.setText(String.valueOf(cikis));
			}
		} else {
			ekranAlt.setText("Error");
		}
	//	display1.setText("1/" + String.valueOf(inb));
		cikis = 0;
		islem = 0;
	}// GEN-LAST:event_onedividedbyxActionPerformed

	private void kareAlmaActionPerformed(ActionEvent evt) {// GEN-FIRST:event_squaredActionPerformed
		sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		cikis = sayi2 * sayi2;

		if (cikis > -100000000 && cikis < 100000000) {
			if ((int) cikis == cikis) {
				// for you, StackOverflowException
				ekranAlt.setText(Integer.toString((int) cikis));
			} else {
				String.valueOf(cikis);
				ekranAlt.setText(String.valueOf(cikis));
			}
		} else {
			ekranAlt.setText("Error");
		}

		// display2.setText(String.valueOf(inb) + "²");
		cikis = 0;
		islem = 0;
	}// GEN-LAST:event_squaredActionPerformed

	private void kokAlmaActionPerformed(ActionEvent evt) {// GEN-FIRST:event_squarerootActionPerformed
		sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		cikis = Math.sqrt(sayi2);
		ekranAlt.setText(String.valueOf(cikis));
		cikis = 0;
		islem = 0;
	}// GEN-LAST:event_squarerootActionPerformed

	private void kupAlmaActionPerformed(ActionEvent evt) {// GEN-FIRST:event_cubedActionPerformed
		sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		cikis = sayi2 * sayi2 * sayi2;

		if (cikis > -100000000 && cikis < 100000000) {
			if ((int) cikis == cikis) {
				// for you, StackOverflowException
				ekranAlt.setText(Integer.toString((int) cikis));
			} else {
				String.valueOf(cikis);
				ekranAlt.setText(String.valueOf(cikis));
			}
		} else {
			ekranAlt.setText("Error");
		}

		// display1.setText(String.valueOf(inb) + "³");
		cikis = 0;
		islem = 0;
	}// GEN-LAST:event_cubedActionPerformed

	private void toplamaActionPerformed(ActionEvent evt) {// GEN-FIRST:event_addActionPerformed
		if (islem == 0) {
			sayi1 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		} else {
			sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		}

		if (islem == 1) {
			sayi1 = sayi1 + sayi2;
		}

		if (islem == 2) {
			sayi1 = sayi1 - sayi2;
		}

		if (islem == 3) {
			sayi1 = sayi1 * sayi2;
		}

		if (islem == 4) {
			sayi1 = sayi1 / sayi2;
		}

		if (islem == 5) {
			sayi1 = sayi1 * sayi2 / 100;
		}

		ekranAlt.setText("0");
		ekranAlt.setText(String.valueOf(sayi1));
		ekranAlt.setText("+");

		islem = 1;

		decdisp = false;
		zerodisp = false;
	}// GEN-LAST:event_addActionPerformed

	private void cikarmaActionPerformed(ActionEvent evt) {// GEN-FIRST:event_subtractActionPerformed
		if (islem == 0) {
			sayi1 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		} else {
			sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		}

		if (islem == 1) {
			sayi1 = sayi1 + sayi2;
		}

		if (islem == 2) {
			sayi1 = sayi1 - sayi2;
		}

		if (islem == 3) {
			sayi1 = sayi1 * sayi2;
		}

		if (islem == 4) {
			sayi1 = sayi1 / sayi2;
		}

		if (islem == 5) {
			sayi1 = sayi1 * sayi2 / 100;
		}

		ekranAlt.setText("0");
		ekranAlt.setText(String.valueOf(sayi1));
		ekranAlt.setText("-");

		islem = 2;

		decdisp = false;
		zerodisp = false;
	}// GEN-LAST:event_subtractActionPerformed

	private void carpmaActionPerformed(ActionEvent evt) {// GEN-FIRST:event_multiplyActionPerformed
		if (islem == 0) {
			sayi1 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		} else {
			sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		}

		if (islem == 1) {
			sayi1 = sayi1 + sayi2;
		}

		if (islem == 2) {
			sayi1 = sayi1 - sayi2;
		}

		if (islem == 3) {
			sayi1 = sayi1 * sayi2;
		}

		if (islem == 4) {
			sayi1 = sayi1 / sayi2;
		}

		if (islem == 5) {
			sayi1 = sayi1 * sayi2 / 100;
		}

		ekranAlt.setText("0");
		ekranAlt.setText(String.valueOf(sayi1));
		ekranAlt.setText("*");

		islem = 3;

		decdisp = false;
		zerodisp = false;
	}// GEN-LAST:event_multiplyActionPerformed

	private void bolmeActionPerformed(ActionEvent evt) {// GEN-FIRST:event_divideActionPerformed
		if (islem == 0) {
			sayi1 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		} else {
			sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		}

		if (islem == 1) {
			sayi1 = sayi1 + sayi2;
		}

		if (islem == 2) {
			sayi1 = sayi1 - sayi2;
		}

		if (islem == 3) {
			sayi1 = sayi1 * sayi2;
		}

		if (islem == 4) {
			sayi1 = sayi1 / sayi2;
		}

		if (islem == 5) {
			sayi1 = sayi1 * sayi2 / 100;
		}

		ekranAlt.setText("0");
		ekranAlt.setText(String.valueOf(sayi1));
		ekranAlt.setText("/");

		islem = 4;

		decdisp = false;
		zerodisp = false;
	}// GEN-LAST:event_divideActionPerformed

	private void yuzdeActionPerformed(ActionEvent evt) {// GEN-FIRST:event_percentActionPerformed
		sayi1 = Double.parseDouble(String.valueOf(ekranAlt.getText()));
		ekranAlt.setText("0");
		ekranAlt.setText(String.valueOf(sayi1));
		ekranAlt.setText("%");

		decdisp = false;
		zerodisp = false;
		islem = 5;
	}// GEN-LAST:event_percentActionPerformed

	private void esittirActionPerformed(ActionEvent evt) {// GEN-FIRST:event_equalsActionPerformed
		sayi2 = Double.parseDouble(String.valueOf(ekranAlt.getText()));

		if (islem == 0) {
			cikis = sayi2;
			ekranAlt.setText(String.valueOf(sayi2));
		}

		if (islem == 1) {
			cikis = sayi1 + sayi2;
			ekranAlt.setText(ekranAlt.getText() + String.valueOf(sayi2));
		}

		if (islem == 2) {
			cikis = sayi1 - sayi2;
			ekranUst.setText(ekranUst.getText() + String.valueOf(sayi2));
		}

		if (islem == 3) {
			cikis = sayi1 * sayi2;
			ekranAlt.setText(ekranAlt.getText() + String.valueOf(sayi2));
		}

		if (islem == 4) {
			cikis = sayi1 / sayi2;
			ekranAlt.setText(ekranAlt.getText() + String.valueOf(sayi2));
		}

		if (islem == 5) {
			cikis = sayi1 * sayi2 / 100;
			ekranAlt.setText(ekranAlt.getText() + String.valueOf(sayi2) + ")");
		}

		if (cikis > -100000000 && cikis < 100000000) {

			if ((int) cikis == cikis) {
				// for you, StackOverflowException
				ekranAlt.setText(Integer.toString((int) cikis));
			} else {
				String.valueOf(cikis);
				ekranAlt.setText(String.valueOf(cikis));
			}

		} else

		{
			ekranAlt.setText("Error");
		}

		sayi1 = 0;
		sayi2 = 0;
		cikis = 0;

		islem = 0;
		decdisp = false;
		zerodisp = false;
	}// GEN-LAST:event_equalsActionPerformed

	public static void main(String args[]) {

		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception ex) {

		}
		// </editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new calc().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton toplama;
	private ButtonGroup buttonGroup1;
	private JButton silme;
	private JButton kupAlma;
	private JButton decpoint;
	private JTextField ekranAlt;
	private JTextField ekranUst;
	private JButton bolme;
	private JButton eight;
	private JButton equals;
	private JButton five;
	private JButton four;
	private JButton carpma;
	private JButton negatif;
	private JButton nine;
	private JButton one;
	private JButton onedivided;
	private JButton yuzde;
	private JButton temizle;
	private JButton seven;
	private JButton six;
	private JButton kareAlma;
	private JButton kokAlma;
	private JButton cikarma;
	private JButton three;
	private JButton two;
	private JButton zero;
	private JButton leblebi;
	private JLabel ozluSoz;
	private JLabel label;
}
