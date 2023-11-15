package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button[] buttons = new Button[9];
    Button button1;
    String playerTurn = "X";
    TextView player;
    final Boolean[] draw = {false};
    Boolean checkEmpty = true;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = findViewById(R.id.player1);
        button1 = findViewById(R.id.buttun1);


        System.out.println("test");
        for (int i = 2; i < buttons.length + 2; i++) {
            String buttonId = "buttun" + i;
            int resID = getResources().getIdentifier("buttun" + i, "id", getPackageName());

            buttons[i - 2] = findViewById(resID);

            int finalI = i;
            buttons[i - 2].setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    if (playerTurn.equals("O")) {
                        //buttons[finalI - 2].setBackgroundColor(Color.GREEN);

                        buttons[finalI - 2].setEnabled(false);
                        buttons[finalI - 2].setText("O");
                        playerTurn = "X";
                    } else if (playerTurn.equals("X")) {

                        buttons[finalI - 2].setEnabled(false);
                        buttons[finalI - 2].setText("X");
                        playerTurn = "O";
                    }
                    player.setText("Player Turn : " + playerTurn);
                    ///OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
                    if (buttons[0].getText().toString().equals("O") && buttons[1].getText().toString().equals("O") && buttons[2].getText().toString().equals("O")){
                        player.setText("Player O Wins!");

                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[3].getText().toString().equals("O") && buttons[4].getText().toString().equals("O") && buttons[5].getText().toString().equals("O")){
                        player.setText("Player O Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[6].getText().toString().equals("O") && buttons[7].getText().toString().equals("O") && buttons[8].getText().toString().equals("O")){
                        player.setText("Player O Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    ///OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
                    if (buttons[0].getText().toString().equals("O") && buttons[3].getText().toString().equals("O") && buttons[6].getText().toString().equals("O")){
                        player.setText("Player O Wins!");

                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[1].getText().toString().equals("O") && buttons[4].getText().toString().equals("O") && buttons[7].getText().toString().equals("O")){
                        player.setText("Player O Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[2].getText().toString().equals("O") && buttons[5].getText().toString().equals("O") && buttons[8].getText().toString().equals("O")){
                        player.setText("Player O Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    ///XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    if (buttons[0].getText().toString().equals("X") && buttons[1].getText().toString().equals("X") && buttons[2].getText().toString().equals("X")){
                        player.setText("Player X Wins!");

                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[3].getText().toString().equals("X") && buttons[4].getText().toString().equals("X") && buttons[5].getText().toString().equals("X")){
                        player.setText("Player X Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[6].getText().toString().equals("X") && buttons[7].getText().toString().equals("X") && buttons[8].getText().toString().equals("X")){
                        player.setText("Player X Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    ///XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    if (buttons[0].getText().toString().equals("X") && buttons[3].getText().toString().equals("X") && buttons[6].getText().toString().equals("X")){
                        player.setText("Player X Wins!");

                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[1].getText().toString().equals("X") && buttons[4].getText().toString().equals("X") && buttons[7].getText().toString().equals("X")){
                        player.setText("Player X Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[2].getText().toString().equals("X") && buttons[5].getText().toString().equals("X") && buttons[8].getText().toString().equals("X")){
                        player.setText("Player X Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    ///OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
                    if (buttons[0].getText().toString().equals("O") && buttons[4].getText().toString().equals("O") && buttons[8].getText().toString().equals("O")){
                        player.setText("Player O Wins!");

                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[2].getText().toString().equals("O") && buttons[4].getText().toString().equals("O") && buttons[6].getText().toString().equals("O")){
                        player.setText("Player O Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    ///XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    if (buttons[0].getText().toString().equals("X") && buttons[4].getText().toString().equals("X") && buttons[8].getText().toString().equals("X")){
                        player.setText("Player X Wins!");

                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    if (buttons[2].getText().toString().equals("X") && buttons[4].getText().toString().equals("X") && buttons[6].getText().toString().equals("X")){
                        player.setText("Player X Wins!");
                        for (int i = 2; i < buttons.length + 2; i++) {
                            buttons[i - 2].setEnabled(false);;
                        }
                        draw[0] = true;
                    }
                    for (int j = 2; j < buttons.length + 2; j++) {

                        if (!buttons[j - 2].getText().toString().equals("")){
                            counter++;
                            //checkEmpty = true;
                        }

                    }
                    System.out.println(counter);
                    System.out.println(draw[0]);
                    if (!draw[0] && counter == 9){
                        player.setText(" DRAW ! ");
                    }
                    draw[0] = false;
                    counter = 0;
                }
            });

        }



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 2; i < buttons.length + 2; i++) {
                    buttons[i - 2].setText("");
                }
                for (int i = 2; i < buttons.length + 2; i++) {
                    buttons[i - 2].setEnabled(true);;
                }

            }
        });


    }
}