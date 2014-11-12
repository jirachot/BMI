package app.example.testbmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends Activity {
	
	private float result1;
	private TextView txtres;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show);
		
		txtres = (TextView) findViewById(R.id.txtresult);
		
		Intent res = getIntent();
		result1 = res.getFloatExtra("result", result1);
		
		txtres.setText(""+result1);
	}
}
