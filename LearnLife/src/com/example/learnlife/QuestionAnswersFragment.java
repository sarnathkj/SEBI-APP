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

public class QuestionAnswersFragment extends Fragment {
	
	private List<TipsRowItem> rowItems;

    public QuestionAnswersFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.sebilearn_tips, container, false);
        
     // Intialize and set the Action Bar to Holo Blue
     		ActionBar actionBar = getActivity().getActionBar();
     		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#33b5e5" )));
     		
     		ListView lv = (ListView) rootView.findViewById(R.id.myList);
     		 rowItems = new ArrayList<TipsRowItem>();
     		 
     	        String[] question = {"Success Wise","Default","Default","Default","Default","Default","Default","Default","Default","Default","Default"};
     	        String[] answer = {"Default","Default","Default","Default","Default","Default","Default","Default","Default","Default","Default"};
     	        
     	        question[0] = "What is Cash Flow Statement?";
     	        answer[0] = "\t\t Its a record of your income and expenses.";
     	        
     	        question[1] = "What is Budget Income?";
    	        answer[1] = "\t\t A plan for balancing of income and expenditures or a projection of one’s income and expenditure.";
    	        
    	        question[2] = "What is the necessity of Budget?";
     	        answer[2] = "\t\t (i) Optimize savings. \n\t\t (ii) Save accurately for a particular short/long term goal. \n\t\t (iii) Effectively allot funds to various areas of expenditure in advance.";
     	        
     	        question[3] = "Why is knowledge of budgeting important?";
    	        answer[3] = "\t\t Its an advantage for children. Its an art of budgeting which helps a person to develop economic way of thinking and problem solving.";
    	        
    	        question[4] = "What is Opportunity Cost?";
     	        answer[4] = "\t\t At a point of time, when you give up something to achieve something else, the forgone opportunity is known as ‘Opportunity Cost’. Ex. You have an option to either buy a video game or a bicycle and you opt for the bicycle, then the video game is the opportunity cost for purchasing bicycle.";
     	        
     	        question[5] = "What is a Stock Exchange?";
     	        answer[5] = "\t\t A Stock Exchange is an organization constituted for the purpose of assisting and carrying out buying, selling or otherwise dealing in securities.";
     	        
     	        question[6] = "What are Securities?";
     	        answer[6] = "\t\t Securities are financial instruments and include instruments such as shares, bonds, debentures of a company or body corporate or a government. Thus, a stock exchange provides a trading platform, where buyers and sellers can meet to transact in securities. A stock exchange could be a regional stock exchange whose area of operation or jurisdiction is limited to a region or a national exchange permitted to have nationwide trading.";
    	        
     	        question[7] = "Why can't my son/daughter learn about budgeting in school?";
    	        answer[7] = "\t\t Most children learn about managing money at home, from their families. We found out that 60% of school children learnt personal finance at home. Parents make a difference when they think of themselves as their child's financial fitness personal trainers!";
   	        
     	        question[8] = "Why does my child need to learn about budgeting so early in life?";
     	        answer[8] = "Knowing the art of budgeting helps a person develop economic way of thinking and problem solving. They can use this knowledge in their lives as consumers, savers, responsible members of the family and in future as investors, responsible professionals, citizens and well-equipped participants in the global economy.";
     	        
     	        question[9] = "How can we participate as a family? How will it help?";
    	        answer[9] = "You can involve your children in financial decision-making. Let them know how you draw a budget and how do you decide how much money do you allot towards a particular area of expenditure. This will result in the child not only understanding and participating in the family budget but also in becoming more sensitive to the position of the parents when they deny a particular demand of the child. Children will also be able to empathize with their parents in a better way and appreciate the value of hard-work and money.";
    	        
     	        question[10] = "How can I/we help?";
     	        answer[10] = "You can encourage your child to participate in the family budget and explain to him/her the allocation of funds. When your child asks for something expensive, rather than giving it away instantly, encourage him to draw up a budget and try to save at least a part of the amount. This inculcates a financial discipline that is desirable in a responsible family member.";
     	        
    	        //Populate the List
     	        for (int i = 0; i < question.length; i++) {
     	            TipsRowItem item = new TipsRowItem((i+1)+". "+question[i], answer[i]);
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
