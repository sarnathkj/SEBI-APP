package com.example.learnlife;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;

import com.example.learnlife.adapter.TipsLazyAdapter;

public class SebiLearnTipsFragment extends Fragment {
	
	private List<TipsRowItem> rowItems;

    public SebiLearnTipsFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.sebilearn_tips, container, false);
        
     // Intialize and set the Action Bar to Holo Blue
     		ActionBar actionBar = getActivity().getActionBar();
     		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#33b5e5" )));
     		
     		ListView lv = (ListView) rootView.findViewById(R.id.myList);
     		 rowItems = new ArrayList<TipsRowItem>();
     		 
     	        String[] titles = {"Success Wise","Income & Expense","SAVINGS","SIP","Learn Self Control","Take Control of Your Own Financial Future","Know Where Your Money Goes","A Financial Basis for Life","Guard Your Health","Guard Your Wealth"};
     	        String[] descriptions = {"Default","Default","Default","Default","Default","Default","Default","Default","Default","Default"};
     	        
     	        descriptions[0] = "To climb the ladder of success you need to have SMART Goals!";
     	        descriptions[1] = "If your income is greater than your expenses, you are planning your finances adequately. However, if your balance is negative, you need to start planning your finances right away";
     	        descriptions[2] = "IDEALLY YOUR SAVINGS SHOULD BE 20% OF YOUR TOTAL INCOME";
     	        descriptions[3] = "Systematic Investment Plans start at minimal Rs 500 a month, affordable to a beginner like you.A ONE TIME INVESTMENT CARRIES MORE RISK THAN A SIP.";
     	        descriptions[4] = "If you're lucky, your parents taught you this skill when you were a kid";
     	        descriptions[5] = "If you don't learn to manage your own money, other people will find ways to (mis)manage it for you";
     	        descriptions[6] = "Once you've gone through a few personal finance books, you'll realize how important it is to make sure your expenses aren't exceeding your income. The best way to do this is by budgeting";
     	        descriptions[7] = "Remember, you don't need any fancy degrees or special background to become an expert at managing your finances. If you use these eight financial rules for your life, you can be as personally prosperous as the guy with the hard-won MBA.";
     	        descriptions[8] = "If meeting monthly health insurance premiums seems impossible, what will you do if you have to go to the emergency room, where a single visit for a minor injury like a broken bone can cost thousands of dollars? If you're uninsured, don't wait another day to apply for health insurance; it's easier than you think to wind up in a car accident or trip down the stairs.";
     	        descriptions[9] = "If you want to make sure that all of your hard-earned money doesn't vanish, you'll need to take steps to protect it.";
     	        
     	        
     	        //Populate the List
     	        for (int i = 0; i < titles.length; i++) {
     	            TipsRowItem item = new TipsRowItem(titles[i], descriptions[i]);
     	            rowItems.add(item);
     	        }

     	        // Set the adapter on the ListView
     	        TipsLazyAdapter adapter = new TipsLazyAdapter(getActivity().getApplicationContext(), R.layout.tips_row, rowItems);
     	        lv.setAdapter(adapter);
     	        
     	        lv.setOnItemSelectedListener(new OnItemSelectedListener() {

     				@Override
     				public void onItemSelected(AdapterView<?> arg0, View arg1,
     						int arg2, long arg3) {
     					// TODO Auto-generated method stub
     					
     				}

     				@Override
     				public void onNothingSelected(AdapterView<?> arg0) {
     					// TODO Auto-generated method stub
     					
     				}
     			});
         
        return rootView;
    }
}
