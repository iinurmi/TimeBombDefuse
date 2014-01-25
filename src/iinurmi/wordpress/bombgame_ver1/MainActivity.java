package iinurmi.wordpress.bombgame_ver1;

import org.apache.cordova.*;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
		super.appView.setOnLongClickListener(new View.OnLongClickListener() {

			public boolean onLongClick(View v) {
				return true;
			}
		});
	}

}
