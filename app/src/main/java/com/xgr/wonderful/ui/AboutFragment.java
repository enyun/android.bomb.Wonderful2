package com.xgr.wonderful.ui;

import com.xgr.wonderful.R;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xgr.wonderful.ui.base.BaseHomeFragment;
import com.xgr.wonderful.utils.ActivityUtil;

public class AboutFragment extends BaseHomeFragment{
	private TextView versionName;
	public static AboutFragment newInstance(){
		AboutFragment fragment = new AboutFragment();
		return fragment;
	}
	
	@Override
	protected int getLayoutId() {
		// TODO Auto-generated method stub
//        R.layout.fr
		return R.layout.fragment_main;
	}

	@Override
	protected void findViews(View view) {
		// TODO Auto-generated method stub
//        versionName = (TextView)view.findViewById(R.id.version_name);
//        versionName = (TextView)view.findViewById(R.id);

	}

	@Override
	protected void setupViews(Bundle bundle) {
		// TODO Auto-generated method stub
		versionName.setText(ActivityUtil.getVersionName(mContext));
	}

	@Override
	protected void setListener() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void fetchData() {
		// TODO Auto-generated method stub
		
	}


}
