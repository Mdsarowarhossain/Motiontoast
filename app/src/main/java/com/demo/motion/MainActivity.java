package com.demo.motion;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.lazyprogrammer.motiontoast.MotionStyle;
import com.lazyprogrammer.motiontoast.MotionToast;

public class MainActivity extends AppCompatActivity {
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = findViewById(R.id.toast);

		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				MotionToast motionToast = new MotionToast(MainActivity.this, 0, MotionStyle.LIGHT, MotionStyle.WARNING,
						MotionStyle.BOTTOM, "SUCCESS", "You got success", MotionStyle.LENGTH_SHORT).show();

			}

		});

	}
}