package com.thoth;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Snapshot extends Activity  
{
	/* On Program creation; first process activity. */
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState);
		
		/* Set the basic content view below. */
		setContentView(R.layout.snap_shot); 

		final Button capture = (Button) findViewById(R.id.captureButton);
		final Button preview = (Button) findViewById(R.id.previewButton);
		final ImageView imageView = (ImageView) findViewById(R.id.imageView);
		 
		final CameraActivity image = new CameraActivity();
		 
		capture.setOnClickListener(new View.OnClickListener() 
		{
	
			public void onClick(View v) 
			{
            	
            	
         	    startActivityForResult(image.getIntent(), 1);
         	    
            }//ONCLICK - END
                 
         });
		 
		 preview.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
            	 imageView.setImageURI(image.getFileURI());
             }
                 
         });
		 
	}//onCreate - End
}
