package dev.dworks.apps.anexplorer.setting;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import dev.dworks.apps.anexplorer.R;

public class GeneralPreferenceFragment extends PreferenceFragment{
	
	public GeneralPreferenceFragment() {
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.pref_general);
	}
}