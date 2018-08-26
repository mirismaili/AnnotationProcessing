package ir.openside.annotationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.annotationsample.Navigator;

/**
 * Created by S. Mahdi Mir-Ismaili on 1397/6/4 (26/08/2018).
 * <p><a href="mailto:s.m.mirismaili@gmail.com">s.m.mirismaili@gmail.com</a>
 */
public class SplashActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Navigator.startMainActivity(this); //generated class, method
	}
}
