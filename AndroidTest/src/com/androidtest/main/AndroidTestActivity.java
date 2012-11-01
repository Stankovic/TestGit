package com.androidtest.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AndroidTestActivity extends Activity {
	TextView textResultat = null;
	EditText editPoid = null;
	EditText editTaille = null;
	Button btnCalcul = null;
	Button btnRAZ = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		editPoid = (EditText) findViewById(R.id.editPoid);
		editTaille = (EditText) findViewById(R.id.editTaille);
		textResultat = (TextView) findViewById(R.id.textViewResultat);

		btnCalcul = (Button) findViewById(R.id.buttonCalcul);
		btnCalcul.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				textResultat.setText(editPoid.getText().toString() + editTaille.getText().toString());
			}
		});

		btnRAZ = (Button) findViewById(R.id.buttonRAZ);
		btnRAZ.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				editPoid.setText("");
				editTaille.setText("");
				textResultat.setText("RŽsultat : ");
			}
		});
	}
}