package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // private EditText ed_name;
    // private TextView tv_text, tv_name, tv_winner, tv_mmora, tv_cmora;
    // private RadioButton btn_scissor, btn_stone, btn_paper ;
    // private Button btn_mora;
    // @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ed_name = findViewById( R.id.ed_name) ;
        //tv_text = findViewById( R.id.tv_text) ;
        //tv_name = findViewById( R.id.tv_name) ;
        //tv_winner = findViewById(R.id.tv_winner) ;
        //tv_mmora = findViewById(R.id.tv_mmora) ;
        //tv_cmora = findViewById(R.id.tv_cmora) ;
        //btn_scissor = findViewById (R.id.btn_scissor) ;
        //btn_stone = findViewById(R.id.btn_stone) ;
        //btn_paper - findViewById(R.id.btn_paper) ;
        //btn_mora - findViewById(R.id.btn_mora) ;
        btn_mora.setOnClickListener {//new View.OnClickListener(){
            // @Override
            //public void onClick(View v){
            if (ed_name.length() < 1) {

                tv_text.text = "請輸入玩家姓名"

            }else {
                     tv_name.text = "名字\n${ed_name.text}"
                        //ed_name.getText().toString()));
                        //if(btn_scissor.isChecked())
                     tv_mmora.text = "我方出拳\n${if (btn_scissor.isChecked) "剪刀" else if (btn_stone.isChecked) "石頭" else "布"}"
                        //  else if(btn_stone.isChecked())
                        //      tv_mmora.setText("我方出拳\n石頭");
                        //  else
                        //     tv_mmora.setText("我方出拳\1布");

                val computer = (Math.random() * 3).toInt();

                //  if(computer==0)
                tv_cmora.text = "電腦出拳\n${if (computer == 0) "剪刀" else if (computer == 1) "石頭" else "布"}"
                /*else if(computer==1)
                    tv_cmora.Text("電腦出拳\n石頭")
                else
                    tv_cmora.setText("電腦出拳\n布")
*/
                when {
                        btn_scissor.isChecked && computer == 2 ||
                            btn_stone.isChecked && computer == 0 ||
                                btn_paper.isChecked && computer == 1 -> {
                                    tv_winner.text = "勝利者\n${ed_name.text}"
                                    tv_text.text = "恭喜你獲勝了!!!"
                                 }
                        btn_scissor.isChecked && computer == 1 ||
                            btn_stone.isChecked && computer == 2 ||
                                btn_paper.isChecked && computer == 0 -> {
                                     tv_winner.text = "勝利者\n電腦";
                                     tv_text.text = "可惜，電腦獲勝了!"
                                 }
                        else -> {
                                     tv_winner.text = "勝利者\n平手";
                                     tv_text.text = "平局，請在試一次!";
                                }
                    }
            }
        }
    }
}