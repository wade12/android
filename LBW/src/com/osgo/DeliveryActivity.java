package com.osgo;
	 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
	 
public class DeliveryActivity extends Activity
{
	private RadioGroup radioDeliveryGroup;
	private RadioButton radioDeliveryButton;
	private Button buttonDisplay;
	 
	
    protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_delivery);
        
        addListenerOnButton();
        
	} // end method onCreate
	 
	 
	public void addListenerOnButton()
	{
		radioDeliveryGroup = (RadioGroup) findViewById(R.id.radioDelivery);
		buttonDisplay = (Button) findViewById(R.id.btnDisplay);
	 
		buttonDisplay.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				// get selected radio button from radioGroup
				int selectedId = radioDeliveryGroup.getCheckedRadioButtonId();
	 
				// find the radiobutton by returned id
				radioDeliveryButton = (RadioButton) findViewById(selectedId);
	 
				Toast.makeText(DeliveryActivity.this, radioDeliveryButton.getText(), Toast.LENGTH_SHORT).show();
	 
			} // end method onClick
	 
		}); // end setOnClickListener
	 
	} // end method addListenerOnButton
	
} // end Class DeliveryActivity
