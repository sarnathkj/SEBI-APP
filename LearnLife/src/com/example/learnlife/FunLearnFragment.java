package com.example.learnlife;

import java.util.ArrayList;
import java.util.List;

import com.example.learnlife.adapter.LazyAdapter;

import android.app.ActionBar;
import android.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemSelectedListener;

public class FunLearnFragment extends Fragment {
	
	private List<RowItem> rowItems;

    private static Integer[] images = {
    		R.drawable.smart,
            R.drawable.wantvsneed,
            R.drawable.lsg,
            R.drawable.banking,
            R.drawable.inflation,
    };
	
	public FunLearnFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fun_learn, container, false);
        
     // Intialize and set the Action Bar to Holo Blue
 		ActionBar actionBar = getActivity().getActionBar();
 		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#33b5e5" )));
 		
 		ListView lv = (ListView) rootView.findViewById(R.id.myList);
 		 rowItems = new ArrayList<RowItem>();
 		 
 	        String[] titles = {"Planning: The Mantra of Success!","Want Vs Need","Three Pillars of Investment","Banking","Inflation Termite: Beware!"};
 	        String[] descriptions = {"Default","Default","Default","Default","Default"};
 	        
 	        descriptions[0] = "\n\t\t We all have Goals in life: I want to buy a cricket Bat, I want to go to picnic, I want to buy a cycle, I want to get admission in ABC College etc., Have you ever wondered why many of our goals are delayed or worse not fulfilled? Well, simply because we are wishful about our goals and we have no definite PLAN to achieve these cherished goals.The starting point to achieve any Goal is to have a plan for it. Once you have a plan, it is no more a vague goal, it becomes a SMART Goal.\n\n\t\tThe method of SMART goals (an acronym for the 5 steps of specific, measurable, attainable, relevant, and time-based goals) is one of the most effective tools used by high achievers to reach their goals — realistically and consistently. Whether you're at the helm of a 300-person organization, a small business entrepreneur, or somebody who simply wants to shed 20 pounds, learning how to set SMART goals can make the difference between failure and achievement.";
 	        descriptions[1] = "\n\t\t Needs are basic necessities one cannot wish away. For example in summer fan becomes a need.  On the other hand wants make your life comfortable .An air conditioner makes life more comfortable in summer.";
 	        descriptions[2] = "\n\t\t There are three aspects to investment you must know: \n \t\t\t Safety: If you lend 100 rupees to someone, will he give it back to you i.e. is your capital (Rs.100) safe? \n\t\t\t Liquidity: Will you get your money back if you need it immediately? \n\t\t\t Growth: What is the return you will get on your investment? It could be in the form of income or appreciation or both.";
 	        descriptions[3] = "\n\t\t Bank is an institution where people park their surplus money (Deposit) and earn some return called interest.  At  the  same  time  people  who  need  money  can  borrow  from  bank  for  a  cost(again interest). Therefore bank is an institution involved in the business of borrowing and lending money. It charges higher  rates  of  interest  while  lending  and  pays  lesser  interest  to  depositors. The difference between lending and borrowing rate is called its Net interest margin (NIM). \n\t\t For any country banks play a vital role for the financial needs of Individuals and companies, enabling smooth economic activity. \n\t\t Types of bank Accounts \n\t\t\t Savings  Account:  It  is  useful  for  depositing  your  surplus  money  and  withdrawing  money  needed expenses. One needs to keep a minimum balance usually. Banks pay lowest interest rate on the money kept in this account. \n\t\t\t  Current Account: This account is for basically business transactions. Banks do not pay any interest on the money kept in this account. \n\t\t\t Term deposit account or fixed deposit amount: As the name suggests in this account money is deposited for a fixed and predetermined term. One deposits money which is not required immediately in this account. Interest rate is higher than savings account.";
 	        descriptions[4] = "\n\t\t At what price did you buy your school bag last time? Will you get it for the same price today? The answer is probably no. This means the price of things keep on increasing. This phenomenon of price rise is called Inflation. \n\t\t Now let us assume, the price of your school bag was Rs.200 last year and it costs Rs.210 this year, the inflation rate therefore is 5%(=10/200 *100= 5%). Now if you had saved Rs.200 last year and expected to buy the bag this year with your saving you would be short of Rs.10. Therefore, it very important that are savings are invested at a rate which is higher than inflation. \n\t\t For example, if you have invested Rs.100 at the rate of 10% and the inflation is 5%, then you have actually earned only 5%. (10%‐ 5% = 5%). This 5% is your real rate of return and 10% is called as nominal rate of return.";
	         
 	        //Populate the List
 	        for (int i = 0; i < titles.length; i++) {
 	            RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
 	            rowItems.add(item);
 	        }

 	        // Set the adapter on the ListView
 	        LazyAdapter adapter = new LazyAdapter(getActivity().getApplicationContext(), R.layout.list_row, rowItems);
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
