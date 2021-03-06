package com.deadlockarena.frontend.graphics;

import javafx.scene.control.Button;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class CancelButton extends Button {
	private static final long serialVersionUID = 4505212405863517256L;

	public CancelButton(MainFrame mainFrame) {
		// addMouseListener(mL1);
		// setFont(Constants.BASIC_FONT);
	}

//	private MouseListener mL1 = new MouseAdapter() {
//		public void mousePressed(MouseEvent e) {
//			mainFrame.getAAS().playSound("select");
//			if (mainFrame.getCurrent() != null) {
//				mainFrame.getCurrent().setSelected(false);
//				mainFrame.setCurrent(null);
//				for (int i = 0; i < JavaData.CHAMPION_COUNT; i++) {
//					if (!mainFrame.getSelectList() [ i ].isSelected())
//						mainFrame.getSelectList() [ i ].setEnabled(true);
//				}
//				for (int i = 0; i < JavaData.SLOT_COUNT; i++) {
//					if (mainFrame.getSlotList1() [ i ].getChampion() == null && mainFrame.getPlayer() == 1)
//						mainFrame.getSlotList1() [ i ].setEnabled(false);
//					if (mainFrame.getSlotList2() [ i ].getChampion() == null && mainFrame.getPlayer() == 2)
//						mainFrame.getSlotList2() [ i ].setEnabled(false);
//				}
//			} else {
//				if (mainFrame.getOrderList().empty())
//					return;
//				JButton [ ] buttons = mainFrame.getOrderList().pop();
//				SlotButton slotButton = (SlotButton) buttons [ 0 ];
//				slotButton.setChampion(null);
//				slotButton.setSelected(false);
//				slotButton.setBackground(JavaData.DEFAULT_BACKGROUND);
//				slotButton.setText("");
//				SelectButton selectButton = (SelectButton) buttons [ 1 ];
//				selectButton.setEnabled(true);
//				selectButton.setSelected(false);
//				mainFrame.setTotalCount(mainFrame.getTotalCount()-1);
//			}
//		}
//	};
//
//	private MouseListener mL2 = new MouseAdapter() {
//		public void mousePressed(MouseEvent e) {
//			mainFrame.getAAS().playSound("select");
//			if (mainFrame.getSlot() != null) {
//				mainFrame.clearSkillButtons(mainFrame.getPlayer()); //error prone 
//				mainFrame.clearPanelEast(mainFrame.getPlayer());
//				mainFrame.clearAllBorders();
//				mainFrame.evenAllListeners();
//				mainFrame.disableAll();
//				mainFrame.setSlot(null);
//			}
//			mainFrame.updateButtonPictures();
//		}
//	};
//
//	public void alterMouseAdapter1_2() {
//		removeMouseListener(mL1);
//		addMouseListener(mL2);
//	}

}
