package gui_practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TicTacToeGame extends MyJFrame {
    
    JPanel jPanel;
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    int rows = 3, columns = 3;
    String currentPlayer = "X";

    public TicTacToeGame() {
        super("Tic Tac Toe");
        jPanel = new JPanel();

        jPanel.setLayout(new GridLayout(rows,columns));
        Font font = new Font(Font.SERIF, Font.BOLD, 30);

        for(int i = 0; i < rows*columns; i++) {
            JButton btn = new JButton();
            btn.addActionListener(e -> ButtonClicked(e));
            btn.setFont(font);
            buttons.add(btn);
            jPanel.add(btn);

        }

        setContentPane(jPanel);
        setVisible(true);

    }

    public void ButtonClicked(ActionEvent event) {
        JButton btnClicked = (JButton)event.getSource();
        btnClicked.setText(currentPlayer);
        btnClicked.setEnabled(false);

        if(currentPlayer == "X") {
            btnClicked.setBackground(Color.RED);
            currentPlayer = "O";
        } else {
            btnClicked.setBackground(Color.GREEN);
            currentPlayer = "X";
        }
    }

    public boolean CheckWinner() {
        if(buttons.get(0).getText().equals(currentPlayer) &&
        buttons.get(1).getText().equals(currentPlayer) &&
        buttons.get(1).getText().equals(currentPlayer)) {
            return true;
        }
        if(buttons.get(3).getText().equals(currentPlayer) &&
        buttons.get(4).getText().equals(currentPlayer) &&
        buttons.get(5).getText().equals(currentPlayer)) {
            return true;
        }
        if(buttons.get(6).getText().equals(currentPlayer) &&
        buttons.get(7).getText().equals(currentPlayer) &&
        buttons.get(8).getText().equals(currentPlayer)) {
            return true;
        }
        if(buttons.get(0).getText().equals(currentPlayer) &&
        buttons.get(3).getText().equals(currentPlayer) &&
        buttons.get(6).getText().equals(currentPlayer)) {
            return true;
        }
        if(buttons.get(1).getText().equals(currentPlayer) &&
        buttons.get(4).getText().equals(currentPlayer) &&
        buttons.get(7).getText().equals(currentPlayer)) {
            return true;
        }
        if(buttons.get(2).getText().equals(currentPlayer) &&
        buttons.get(5).getText().equals(currentPlayer) &&
        buttons.get(8).getText().equals(currentPlayer)) {
            return true;
        }
        if(buttons.get(0).getText().equals(currentPlayer) &&
        buttons.get(4).getText().equals(currentPlayer) &&
        buttons.get(8).getText().equals(currentPlayer)) {
            return true;
        }
        if(buttons.get(2).getText().equals(currentPlayer) &&
        buttons.get(4).getText().equals(currentPlayer) &&
        buttons.get(6).getText().equals(currentPlayer)) {
            return true;
        }
        return false;
    }


    
}
