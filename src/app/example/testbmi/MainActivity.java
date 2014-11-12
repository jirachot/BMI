package app.example.testbmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button btnok, btncal;
	private EditText edtw, edth;
	private Float weight, height, result;
	private TextView txtresult, txt1, txt2, txtshow;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bmi);
		
		edtw = (EditText) findViewById(R.id.edtweight);
		edth = (EditText) findViewById(R.id.edtheight);
		btnok = (Button) findViewById(R.id.btnok);
		
		
		btnok.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
					
				txt1 = (TextView) findViewById(R.id.txtshow);
				txt2 = (TextView) findViewById(R.id.txtshow2);
				txtresult = (TextView) findViewById(R.id.txtresult);
				weight = Float.valueOf(edtw.getText().toString());
				height = Float.valueOf(edth.getText().toString());
				
				result =  (float) calculate(weight, height);
				
				//txtresult.setText(""+result);
				//txt1.setText(""+weight);
				//txt2.setText(""+height);
				
				
					Intent add = new Intent(MainActivity.this, ShowActivity.class);
					add.putExtra("result", result);
					startActivity(add);
				
			
			}
		});
	}
	
	private Float calculate(Float w1, Float w2){
		return (Float) (w1/ ((w2/100) * (w2/100)));
	}

}
