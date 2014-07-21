package com.example.thirdtask;

import com.example.thirdtask.decoder.Decoder;
import com.example.thirdtask.generator.Generator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DecodeActivity extends Activity {
	EditText editCode;
	EditText outputEdit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_decode);
		editCode = (EditText) findViewById(R.id.edit_code);
		outputEdit = (EditText) findViewById(R.id.edit_decode);

	}

	public void generateCode(View v) {
		Generator generator = new Generator();
		generator.generateCode();
		editCode.setText(generator.getCode());
	}

	public void decode(View v) {
		String result = Decoder.decode(editCode.getText().toString());
		outputEdit.setText(result);
	}
}
