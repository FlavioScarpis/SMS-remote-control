package com.gruppo3.sms_remote_control;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;
import android.net.Uri;
import android.provider.Telephony.Sms.Intents;

// TODO add class SMSHandling description
public class SMSHandling {
	
	// TODO add method getMessageBody description
	public String[] getMessageBody(Intent intent) {
		// TODO check if the intent type is correct
		SmsMessage[] messages = Intents.getMessagesFromIntent(intent);
		String[] messagesBodies = new String[messages.length]; // create a new array to contain the body of every message of the array "messages"
		// fulfill the messagesBodies array
		for (int i = 0; i < messages.length; i++)
			messagesBodies[i] = messages[i].getMessageBody();
		return messagesBodies;
	}
	
}
