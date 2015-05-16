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

public class SchoolChildrenFragment extends Fragment {
	
	private List<RowItem> rowItems;

    private static Integer[] images = {
    		R.drawable.children,
            R.drawable.financial_literacy,
            R.drawable.investment,
            R.drawable.banking,
            R.drawable.inflation,
            R.drawable.borrowing
    };
	
	public SchoolChildrenFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.school_children, container, false);
        
     // Intialize and set the Action Bar to Holo Blue
 		ActionBar actionBar = getActivity().getActionBar();
 		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#33b5e5" )));
 		
 		ListView lv = (ListView) rootView.findViewById(R.id.myList);
 		 rowItems = new ArrayList<RowItem>();
 		 
 	        String[] titles = {"Do we involve Children in family Budgets?","First step towards making our Children Financially Literate","INVESTMENT: Nurturing the Money Plant","Banking","Inflation Termite: Beware!","Beyond Steps: BORROWING"};
 	        String[] descriptions = {"Default","Default","Default","Default","Default","Default"};
 	        
 	        descriptions[0] = "\n\t\t As a family we sit together and talk about a lot of things. E.g. we discuss and plan holidays together- where to go, where to stay, what places to visit, what all to buy before the trip, things to shop for at the holiday destination etc. But all these things would require money, would require an elaborate financial plan/budget. But we normally do not involve our children in this budgeting exercise. Either we have this idea of keeping them 'protected' from financial concerns or we have just made the age-old assumption that finance is the father's/ mother's concern! Sometimes we might also feel that our children are too young to understand budgeting.";
 	        descriptions[1] = "\n\t\t We believe that financial literacy begins at home. Financial literacy is not rocket science, but it requires budgeting skills that don't come naturally to many people. You can help us help your child if you sit with him/her to complete these simple exercises. Let them participate in the regular budgeting activities and help them understand on what basis you allot a particular amount towards an expense.";
 	        descriptions[2] = "\n\t\t Investment helps our money to grow. It provides a cushion against inflation. It provides us a steady source of income in old age. It helps us achieve and maintain a certain standard of living. It is all the more necessary with increasing longevity. It helps us achieve almost all short term and long term financial goals.";
 	        descriptions[3] = "\n\t\t Bank is an institution where people park their surplus money (Deposit) and earn some return called interest.  At  the  same  time  people  who  need  money  can  borrow  from  bank  for  a  cost(again interest). Therefore bank is an institution involved in the business of borrowing and lending money. It charges higher  rates  of  interest  while  lending  and  pays  lesser  interest  to  depositors. The difference between lending and borrowing rate is called its Net interest margin (NIM). \n\t\t For any country banks play a vital role for the financial needs of Individuals and companies, enabling smooth economic activity. \n\t\t Types of bank Accounts \n\t\t\t Savings  Account:  It  is  useful  for  depositing  your  surplus  money  and  withdrawing  money  needed expenses. One needs to keep a minimum balance usually. Banks pay lowest interest rate on the money kept in this account. \n\t\t\t  Current Account: This account is for basically business transactions. Banks do not pay any interest on the money kept in this account. \n\t\t\t Term deposit account or fixed deposit amount: As the name suggests in this account money is deposited for a fixed and predetermined term. One deposits money which is not required immediately in this account. Interest rate is higher than savings account.";
 	        descriptions[4] = "\n\t\t At what price did you buy your school bag last time? Will you get it for the same price today? The answer is probably no. This means the price of things keep on increasing. This phenomenon of price rise is called Inflation. \n\t\t Now let us assume, the price of your school bag was Rs.200 last year and it costs Rs.210 this year, the inflation rate therefore is 5%(=10/200 *100= 5%). Now if you had saved Rs.200 last year and expected to buy the bag this year with your saving you would be short of Rs.10. Therefore, it very important that are savings are invested at a rate which is higher than inflation. \n\t\t For example, if you have invested Rs.100 at the rate of 10% and the inflation is 5%, then you have actually earned only 5%. (10%‐ 5% = 5%). This 5% is your real rate of return and 10% is called as nominal rate of return.";
 	        descriptions[5] = "\n\t\t In the present day economy borrowing is not a dirty word - at least not any more. Gone are the days when it was said that 'A banker is a fellow who lends you his umbrella in fair weather and asks for it back when it begins to rain'. There are circumstances under which borrowing is the wiser option.\n\t\t While on one hand 'plastic money' has opened up a world of convenience for consumers, it has - in its Credit Card avatar - created the lure of 'easy credit' that has the potential of creating financial ruin if not managed wisely. It has, therefore, become important for young adults and even teenagers to understand this 'double edged sword' in the right perspective.\n\t\t The aforesaid considerations, necessitated incorporation of a lesson that would look at borrowing beyond savings.";
	         
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
