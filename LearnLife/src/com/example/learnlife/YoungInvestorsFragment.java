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

public class YoungInvestorsFragment extends Fragment {
	
	private List<RowItem> rowItems;

    private static Integer[] images = {
    		R.drawable.young_investors,
    		R.drawable.financialplanning,
    		R.drawable.importance_financial_planning,
    		R.drawable.achieve_goal,
    		R.drawable.risk_return,
    		R.drawable.compounding,
    		R.drawable.investment_inflation,
    		R.drawable.savings_investments,
    		R.drawable.investment_loans,
    		R.drawable.investment_vehicles,
    		R.drawable.investment_strategy,
    		R.drawable.lose_money,
    		R.drawable.begin_investing,
    		R.drawable.ref
    };
	
	public YoungInvestorsFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_young_investors, container, false);
        
     // Intialize and set the Action Bar to Holo Blue
 		ActionBar actionBar = getActivity().getActionBar();
 		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#33b5e5" )));
 		
 		ListView lv = (ListView) rootView.findViewById(R.id.myList);
 		 rowItems = new ArrayList<RowItem>();
 		 
 	        String[] titles = {"Introduction","Financial Planning","Importance of Financial Planning","How to achieve your goals?","Risk Vs Return","The Power of Compounding","Inflation Effects on Investments","Savings Vs Investments","Loans Vs Investments","Investment Vehicles","Investment Strategies","How not to lose money?","How to begin Investing?","References"};
 	        String[] descriptions = {"Default","Default","Default","Default","Default","Default","Default","Default","Default","Default","Default","Default","Default","Default"};
 	        
 	        descriptions[0] = "\n\t\t Planning of finances is essential for each and every one, be it a school-going kid or a retired citizen. The more early you begin to manage your money the better it is. Let’s suppose you choose not to plan and keep spending as and when you like and one day you wish to purchase a house but then you cannot as you hardly have any savings left. This is what happens when you don’t plan and end up overspending. \n\t\t We tend to overspend when we do not understand what we really need. We keep on spending to fulfill all our requirements and we lose count of how much we spent. One should understand the difference between your needs and wants. Things like daily lunch, dinner and house rent payments are our needs which we will have to incur. But things like play stations, videogames and movies are always an option and can be done without. If even we do want to splurge on our wants we can set aside some of our savings over a time period and can buy important needs like vehicles, house, higher education etc. when we have accumulated savings. This is what planning is all about, to plan, save and help us achieve our financial goals. \n\t\t When you start early you can always plan for your future financial goals and have the benefit of meeting them when you want to. This is because you have a longer time horizon to spread out your investments and manage your portfolio across time. Every school-going kid is taught from his childhood to count and save money for his future so that he can use them appropriately to finance his financial goals. \n\t\t This tutorial on financial planning presents various aspects of financial planning for college students. Financial planning is very important for every individual. If people understand its significance at a younger age, achieving your future financial goals becomes more convenient as you can invest in different products to meet your needs.";
 	        descriptions[1] = "\n\t\t Financial Planning is important as it helps us meet our future goals. Every individual needs to understand the need to manage his or her finances. Let us look at an example to understand why. \n\t\t The following excerpt is a conversation between a college student, Shantanu (17), who is pursuing his graduation in Finance, and his elder brother, Nikhil (35), who is working as a financial planner. The conversation gives an insight into planning and introduces the concept of financial planning. \n\n\t\t SHANTANU: It is my best friend’s birthday after a week. I wish to host a surprise party for   him. I would like to invite our classmates for snacks. Could you please guide me? \n\n\t\t NIKHIL: First of all, you need to plan the event and accordingly make the necessary arrangements. \n\n\t\t SHANTANU: But why should I plan? \n\n\t\t NIKHIL: A plan will give you a detailed picture of your needs, resources and goals you wish to achieve. Without making a plan you would be unsure of completing the task at hand and could end up wasting the available resources. Suppose we don’t plan for the birthday, then it is possible that all of your classmates may not be invited; the snacks may not be delivered in time and the birthday party  may not turn out as good as you wanted it to be. But if we plan, we can make sure not to make any errors and we will be better equipped to handle any unusual situations. \n\n\t\t SHANTANU: Oh! I had never thought of this before. Our Professor for Investments in the first session of financial planning was telling us about why we need to plan. What does financial planning mean? \n\n\t\t NIKHIL: Financial Planning means to plan your finances. For this, it is important that one understands his financial needs or objectives and then plan how he can achieve these objectives or goals by making investments or by borrowing funds. \n\n\t\t SHANTANU: Is this what your profession is all about? \n\n\t\t NIKHIL: Yes, as a financial planner I assist investors to help plan their finances and manage their investments. We assist investors in choosing the right asset classes to park their funds so that they can achieve their personal financial needs in future. \n\n\t\t SHANTANU: So how do I plan for the birthday party? \n\n\t\t NIKHIL: Let’s note down the things we have and things we need for the party. \n\n\t\t NIKHIL: To start with, how many people would you be inviting for the party? \n\n\t\t SHANTANU: I am planning to invite our entire class of 30 students. \n\n\t\t NIKHIL: That’s a big group of people. Have you collected any funds to arrange for the party? \n\n\t\t SHANTANU: I have managed to collect Rs 6090 from my classmates. \n\n\t\t NIKHIL: Now that we have an idea of how many guests are invited and the available funds we can plan the event accordingly. First of all, we should allocate our funds to the snacks and the birthday cake so that the funds are utilized well.  Do you know the charges for the snacks? \n\n\t\t SHANTANU: I have found out that party orders at the nearest fast food corner for 30 people would cost us close to Rs 3000. \n\n\t\t NIKHIL: So this would cost us 50% of the funds collected. Do you wish to buy your friend a gift and give away souvenirs to the guests? \n\n\t\t SHANTANU: Yes, but is it possible? I want to buy a play station for my friend on behalf of all of my classmates. \n\n\t\t NIKHIL: It is possible provided you select gifts that are reasonable enough to fit in our budget. It is important to always make sure that you always have an idea of the funds available before making plans. A play station sounds good but it might cost us more than what we can spend right now. We might instead buy a gift that is more reasonable. You might gift some branded clothes that he might like. \n\n\t\t SHANTANU: That would be a good idea. The nearest gift items store has all kinds of gifts at attractive prices from where we can get the souvenirs too. It might cost us around Rs 2500. \n\n\t\t NIKHIL: This would leave us with Rs 590. Do you wish to have any extras like games? \n\n\t\t SHANTANU: I think we should have games. We might use the rest of the funds for it and I can buy chocolates for all of us. \n\n\t\t NIKHIL: Then I think we have made a plan for the party. Now all you need to do is place the snack order well in advance and buy the gifts a day before to avoid last minute hassles. \n\n\t\t SHANTANU:  Thank you so much. Now I am sure I will be able to arrange for the event. \n\n\t\t NIKHIL: Always remember that whenever you need to carry out a task you always need to plan for it before.";
 	        descriptions[2] = "\n\t\t SHANTANU: I have been assigned a project on ‘Financial Planning’ and I am facing a few difficulties. Could you help me solve them? \n\n\t\t  NIKHIL: Sure. Do tell me your queries. \n\n\t\t SHANTANU: My project has six segments. In the first segment, we need to introduce the concept of financial planning. Could you tell me what financial planning means? \n\n\t\t NIKHIL: Financial planning means to plan your finances which help you identify your financial needs and objectives and then make investments accordingly to meet your requirements. Let me show you how financial planning takes place and the various steps of the process. \n\n\t\t Steps Involved in the Financial Planning Process \n\n\t\t STEP 1: GATHERING YOUR FINANCIAL DATA\n\n\t\t NIKHIL: Financial planning constitutes 5 basic steps. At the first step, you will need to list down your various sources of income. If you are an earning individual, your source of income could be your monthly pay, and if you are running a part-time business, then the income generated from that business would also add to your income. The source of income will vary across people. For you, it could be your pocket money, for an earning individual it will be his monthly pay, for a retired individual it could be his pension income or retirement plan returns. Once you know how much you get each month, you will know what you can afford to spend and how much you can invest. In other words, unless you know how much you have in your pocket, you can’t venture out for shopping. \n\n\t\t SHANTANU: Why is it important to manage our finances? \n\n\t\t NIKHIL:  If you manage your finances, you would be able to use your money better. If you don’t, you would not be able to meet your needs. Let’s say today is the first of the month. You have got your salary and you spend all the funds in your money bag on clothes and other accessories, then you would not have any money left to pay off your monthly bills and other payments through the month. Learning to save is essential or else you cannot meet your basic needs even though you earn a handsome pay. \n\n\t\t SHANTANU: I really need to keep this in mind. What is the next step? \n\n\t\t STEP 2: IDENTIFY YOUR FINANCIAL GOALS\n\n\t\t SHANTANU: It is said that one needs to identify his or her investment objective before he starts planning his finances. Is it true?\n\n\t\t NIKHIL:  Defining one’s investment objective is vital before planning for finances. Your goals will tell you how you should manage your finances so that when you wish to meet your goals you have enough funds with you. You can then plan accordingly how much you need to save today for the future plans and how much returns you will receive on your investments to fulfill your future needs. \n\n\t\t Your goals may be either short term, medium term or long term. Your short term goals could be say to pursue an MBA after a year, to purchase a two-wheeler etc. Short terms goals are defined to be met in up to three years. Medium term goals could be financing your marriage expenditure, to gift your parents a vacation package etc. These goals are defined as those needs which have to be met up to 5 years. Your long term goals could be to purchase a new house and these would have to be met after tenure of 5 years. You could further define the target date for each of these goals along with an approximate amount of funds you would require to meet these needs. \n\n\t\t STEP 3: IDENTIFYING ANY FINANCIAL ISSUES\n\n\t\t NIKHIL: At this step you should also find out if you have any loans to be repaid. Someone might have monthly insurance premiums to be paid, retirement plan premiums, or a home loan. Determining your liabilities is extremely essential so that you do not overspend and end up defaulting on your EMI (equated monthly installments) payment. You should also know how much is your monthly expenditure; i.e., the money spent on food items, clothes, water, electricity and other amenities used so  that you can allocate some of your funds to pay for it. \n\n\t\t SHANTANU: So not only is the source of income important, but we should also know our liabilities too. Am I right? \n\n\t\t NIKHIL: Absolutely. Let me make this simpler. Imagine you have a money bag and on the 1st of every month you get your monthly pay and the money bag gets filled. This money bag is your asset now and the monthly expenses like food bills, loan repayments, etc. become your liabilities. Money flowing into the bag will be your income and money flowing out of your bag will be your payments to others for the services you use.  With time your liabilities would increase as you grow old. You would have to support your spouse, your kids and so on.  \n\n\t\t STEP 4: PREPARATION OF FINANCIAL PLAN\n\n\t\t NIKHIL: One should prepare their financial plan depending upon various factors like his income, risk taking ability, age group and investment objective. \n\n\t\t SHANTANU: Oh! So this means that financial planning would differ for me and you as well? \n\n\t\t NIKHIL: Yes. This is because the income for two individuals may not necessarily be the  same and his personal needs could also be different and so on. A financial planner needs to note such differences and then accordingly suggest investment avenues for the investors. If he considers all the investors to be the same then an investor might not be able to meet his financial needs or objectives and the basic purpose of financial planning would not be met with. Suppose you approach me to help you manage your finances. I would first take a look at your income, which would be your pocket money. Since your income is much less than an earning individual the investment avenues that I would suggest you would be different from what I would suggest an individual who is currently working. You must understand that since your needs are different from others you need to make investments that would suit your profile. Many investors fail to understand this. Many individuals in the hope of making big profits invest most of their funds into below investment grade investments which offer high returns. One may profit if they perform well or else they may lose money. Every individual has a different risk appetite and needs to keep this in mind before he chooses which product to invest in. \n\n\t\t SHANTANU: Could you please tell me about risk appetite? \n\n\t\t Nikhil: Good question!  Risk appetite is the risk taking ability of an investor. This varies from person to person. If I am a rich businessman and my monthly income ranges to lakhs of rupees, I might feel that losing a few thousand rupees would not be a matter of concern if I can make high returns. People who are rich or who have a high net worth are willing to invest aggressively unlike others. But if I am a middle class worker, then I might not be able to accept such huge losses.  As a rich man, I can afford taking losses or in other words I am willing to take high risks. But as a middle class worker, I can’t afford to take high risks. I might be able to take up losses in a few hundred rupees only. If I am a retired individual, my risk appetite would be different as I would need a regular income to support my  personal needs like medical bills, health supplements, etc., which means that I would not be willing to take risks. Risk appetite is allotted to individuals on a scale from low to high. For a retired individual, the risk appetite would be low whereas for the businessman the risk appetite would be high. But for a middle class worker it would be moderate. There are various investment avenues like equity, debt, commodities, Forex, etc., each of which is termed as an asset class. You can choose to invest in any of these asset classes provided you understand that each of these asset classes differ from one another in terms of risks and returns. You should make investments depending upon your risk taking ability. \n\n\t\t STEP 5: IMPLEMENTING YOUR FINANCIAL PLAN\n\n\t\t NIKHIL: After preparing your financial plan you need to review and revise your plan to stay up-to-date and relevant to the economic climate and your changing lifestyle. \n\n\t\t SHANTANU: Is this what is meant by portfolio management? \n\n\t\t NIKHIL: Yes. The entire collection of investments you make is termed as the portfolio. Suppose you have Rs 1000 and you invest 50% in equity and the rest in debt securities. Your entire investment would be your portfolio which has a value of Rs 1000 currently. This value might increase or decrease depending upon the market movements, which will bring a change in the value of the securities you hold. Nowadays investors use various portfolio management services to help them manage their investments. Every asset is different from the other in terms of risk and returns. \n\n\t\t Every step in the process of financial planning is equally important. Most of the investors declare their income, risk tolerance levels and also make investments but neglect monitoring their investments. If you do not watch over your investments, even if it had been making gains it may become a loss making investment. Thus there is a need to periodically review your portfolio and make changes in the portfolio as the situation demands. Suppose the equity investments have not performed well for the last quarter and you hold up to 70% of your portfolio in the shares of these companies, then you cannot continue holding the same portfolio. You might have to shift your funds to other asset classes that are less risky like bonds till the markets recover.";
 	        descriptions[3] = "\n\t\t NIKHIL: Now that you know the different aspects of financial planning let us chalk out few goals of yours and how you can go about achieving them. Tell me what are your goals for the future?\n\n\t\tSHANTANU: Yes. I would first like to finance my education and then a two wheeler.\n\n\t\tNIKHIL: You should write your goals depending upon when you want to achieve them this will help you categorize them.\n\n\t\tOnce you do this you should action plan your investments accordingly.";
 	        descriptions[4] = "\n\t\t Every individual has their own risk taking capacity. Your risk-return profile is your level of risk tolerance. If you invest in a high risk business like a startup firm your risk would be high. There are three types of risk return profiles which you can fall under depending upon your source of funds and the investments you choose to make. They are:\n\n\t\t\t(i) Conservative i.e. you take minimal risks ensuring your funds are secure. You prefer   investing in post office deposit schemes, bank fixed deposits, government bonds \n\n\t\t\t(ii) Moderate i.e. you are willing to take some risks and prefer investing in mutual fund   schemes \n\n\t\t\t(iii) Aggressive i.e. you are willing to take high risks and prefer investing in equity,   commodities markets and you may even be speculating for returns.\n\n\t\tThere is an important investment principle which says the level of your returns depends on the level of risk you take. While you stay invested it is crucial you take necessary measures to manage your risk. Once you invest in any asset class you should monitor your investments and keep yourself updated about various market happenings to avoid any pitfalls. Always check the potential risks when quoted returns are unusually high.";
 	        descriptions[5] = "\n\t\t Time is an influential factor when it comes to investments. Your returns depend upon the time you enter and exit. Compounding is a concept which when followed with dedication gives great rewards. However, it rewards better when savings are compounded over longer horizons. Compounding, in short, basically means earning interest on previously earned interest. Let us look at an example:\n\n\t\tIf you set aside a sum of say Rs 5,000 every month from the age of 25, at a return interest rate of 10%, in 60 years you will have with you funds worth about Rs 1 crore (Rs 10 million) and more. However, if you start at 40 with the same amount and return rate of interest, the retirement fund will amount to only around Rs 33 lakh (Rs 3.3 million). Consider you invest Rs 100 for a period of 5 years. \n\n\t\tNotice here that the Rs 100 that you had invested will fetch you Rs 161.05 in 5 years in terms of fixed interest rate and similar results in terms of floating rate as well. Thus in 5 years you stand a chance of making around 60% return!!! \n\n\t\tThus compounding is a tool that helps you make phenomenal growth in your investments over a period of time. Thus the more time you have, the more money you are capable of making and this is exactly why financial planning is so very important.\n\n\t\tRecurring deposits and SIPs can help you on this front, ease in payment of this regular investment amount through a direct debit facility or post-dated cheque can help you execute your compounding strategy.";
	        descriptions[6] = "\n\t\t Inflation is rise in prices for goods and services. As the prices rise, lesser number of people can buy them. Let’s say the rate of petrol changes from Rs 40 to Rs 45, with no change in quality. Then the price difference indicates inflation.\n\n\t\tIf you are earning returns of 10% over your investment of Rs 5000 which is Rs. 500 after a year and the inflation rate is 11% then you will end up giving your returns due to high inflation rates. Hence always ensure your returns are above the inflation rates. You should also understand the time value of money.\n\n\t\tTIME VALUE OF MONEY\n\n\t\tSHANTANU: Yes. I know about the time value of money. I remember our Investment Professor telling us about this. He gave us an assignment to help us understand this. He asked us to find out the value of things in our house, which we use the most, and to list down their price or value today and their value 5 years back. We found out that when we compared their values, their value today was much higher.\n\n\t\tNIKHIL: This is because of the time value of money. As time passes you will realize that if 10 years back you could afford to purchase a full lunch for Rs 10, today you might afford to get few pieces of vegetables only. This means that the value of a thousand rupee note would be higher today than after five years. If you invest Rs 1000 today, at 5% per annum, then after a year you would receive Rs 1050. Thus Rs 1000 received today is equivalent to Rs 1050 received after a year. In order to protect one’s money from losing its value people invest their money. Now I guess you understand your rationale for investing in stock markets was wrong. What you also need to know is that borrowing and spending is not that easy. When you borrow you take up a liability that is you agree to repay and the amount you repay is the original amount you had borrowed along with an interest payment, which is levied upon the amount you borrow.";
	        descriptions[7] = "\n\t\t Savings mean the funds you keep aside in safe custody like bank saving accounts. While investing on the other hand means to purchase various financial instruments which will pay you a return on some future date. The difference between savings and investment is that savings is simply idle cash while investments help your funds to grow over a period of time. We can meet our short term needs with our savings but to meet our long term goals we need to make investments. Savings help to protect our principal while investments help us earn returns over our investments";
	        descriptions[8] = "\n\t\t People always are confused whether they should avail a loan or build investments to achieve their financial goal. Both of the options are different and should be availed appropriately. The following points are worth remembering: \n\n\t\t\t(i) It purely depends on your financial strength and other factors.\n\t\t\t(ii) Credit card debts and personal loans are very costly\n\t\t\t(iii) If you have a loan with a low interest rate and tax benefits as in the case of home loans, it is advantageous to go for a loan. If you have an investment plan where you can make good return, and then you may opt for investment.\n\t\t\t(iv) You have to be sure that the investment is not risky and will not affect your family if you lose the money. For example, you are investing huge sums in share market, instead of closing the existing debts, that is too much risk.\n\nBASICS & DANGERS OF CREDIT CARDS\n\n\t\tSHANTANU: I was thinking of getting a credit card? Should I?\n\n\t\tNIKHIL: People of your age fancy credit cards, they feel that having a credit card is like a status symbol because it gives them the ease of payment at any time but what they forget is the bill they need to pay later.\n\nDISADVANTAGES\n\n\t\t(i) Credit cards come with a lot of additional charges like interest rates, service charges etc. in exchange for the credit offered by them. People forget to read these terms before purchasing a credit card.\n\n\t\t(ii) Credit cards often tempt people to spend more even if they do not have money today as  they have the comfort of paying back later.\n\n\t\t(iii) People tend to purchase more credit cards so as to extend their income and later end up  piling huge sums of debt.\n\nADVANTAGES\n\n\t\t(i) Credit cards offer a number of gifts like cash back, holiday vouchers and other coupons on  making purchases through using credit cards.\n\n\t\t(ii) Credit cards offer the benefit of traveling without cash.\n\n\t\t(iii) Credit cards offer cash in advance and hence are easier to use.\n\n\t\tIt is advised that one should learn to save and manage their funds wisely. Always try to cut back on your spending and rethink before you buy any items other than your basic needs. People at your age are very keen on electronic gadgets and wish to spend on the latest in town. But what you do not realize is these gadgets cost quite a lot on your pockets, squeezing your bank accounts to an extent that you would not be able to pay up for your education.\n\n\t\tSHANTANU: I remember even I need to pay back my educational loan after I complete my graduation. I had completely forgotten about this.\n\n\t\tNIKHIL: I am glad you told me about your loan before you registered for a credit card. If you already have debt to repay why should you go for more debt? It will not help your financial position. You should instead make investments that will help you repay the loan and also support your needs for the future.";
	        descriptions[9] = "\n\n\t Indian markets offer a number of financial instruments like equities, debt, mutual funds, currencies and commodities in addition to other structured products. However their choice should be appropriate for the investor depending upon his or her risk profile and other investment horizon.\n\n\t\tFor younger age group individuals since the investment horizon is long one can invest in products which offer capital appreciation or growth on investments. One should always check that he or she has allocated funds to spend on his or her immediate needs before investing. \n\n\t\tEquity Products: These are company sponsored instruments like shares or stocks of the company’s capital. These instruments offer the investor with shareholder rights where in investors can participate in the annual general meeting and have the right to vote. These products earn returns depending upon the profits made by the company from its operations. The returns may thus fluctuate depending upon the profitability of the company business. These products offer a number of benefits like Investors should understand the company business very well before investing. One can choose to invest in these instruments when they have a longer investment horizon.\n\n\t\tMutual Funds: A mutual fund is generally a professionally managed pool of money from a group of Investors. These products may range from asset class specific portfolio or a mixed group of asset classes. But the choice of scheme or plan should depend upon your investment objective. Investing in mutual funds helps in diversifying your portfolio and thus reduces the risk in your portfolio. These products are considered to be ideal for beginners who lack the necessary expertise to manage their funds.\n\n\t\tStructure wise there are two types of mutual funds – Open ended and closed ended.\n\n\t\tOPEN ENDED SCHEME sells and repurchases units at all times. When fund sells, investor buys and when the investor redeems, the fund repurchases the units. Buying or redeeming is at a price based on the NAV (Net Asset Value).\n\n\t\tCLOSED ENDED SCHEME, after the offer closes, investors are not allowed to buy or redeem units from the fund. Closed end funds are listed on stock exchanges to enable investors to buy or sell units.\n\n\t\tInsurance products: Insurance is more a safety option than an option to invest. We buy insurance to protect ourselves from unforeseen events like death, accidents, theft of valuables etc. Some of the common insurance plans are:\n\n\t\t\t(i) Unit Linked Insurance Plans\n\n\t\t\t(ii) Term / Term with Return of Premium Plans\n\n\t\t\t(iii) Health Insurance\n\n\t\t\t(iv) Personal Accident\n\n\t\t\t(v) Insurance\n\n\t\t\t(vi)Insurance cover for your Home / Car\n\n\t\t\t(vii)Insurance cover to protect your family from liabilities\n\n\t\t\t(viii)Travel insurance\n\n\t\tThe value of the cover that you opt for should depend on your need for protection. Life insurance helps your dependent family members to cover daily expenditure in case of any sad demise. Medical insurance covers your hospitalization expenses in case of any critical illnesses. Within this category, products may have different payout structures and limits for various heads of expenditure. The hospitalization coverage may be reimbursement based plans or fixed benefit plans. These plans aim to cover the more frequent medical expenses.";
	        descriptions[10] = "\n\nSYSTEMATIC INVESTMENT PLANS:\n\n\t\tStarting early is the key to financial planning; today you don’t necessarily need to inherit wealth from family to get wealthy. SIP or systematic investment plans are an excellent means by which you can start investing small, fixed sums of money at regular intervals, (commonly 1 month) most\n\nADVANTAGES OF SIP\n\n\t\t(i) Affordable\n\n\t\t(ii) Easy and Disciplined Transfer\n\n\t\t(iii) Dividend-Growth Option\n\n\t\t(iv) Systematic and User Friendly";
	        descriptions[11] = "\n\n\t\t Updating oneself with the current happenings is a must for every investor as he will then be aware of various events in the financial markets. In addition to this, there are various matters that need to be looked into to keep a check on your portfolio. If you do not then you will end up losing all your returns\n\n\t\tYou should make a habit of analyzing your investments, valuing your investments and rebalancing your portfolio.\n\n\t\tIf you are investing in mutual funds, you can keep a watch on the daily NAV (Net asset value) of the particular fund just like you watch the daily stock prices. You should also be aware of various financial ratios like profit margins, solvency ratios and liquidity ratios, which give you an idea of how the said company is in terms of profitability of its projects, share value and other factors. If you are investing in bonds you should be aware of the bond’s maturity, the rate of interest and other elements of the bond. If you are aware that the company has earlier defaulted on its interest payments on its borrowings, then it is better not to invest in securities of that firm. It is always safer to have a good know-how on valuation techniques like ratio analysis and investment pay-off.\n\n\t\tYou should keep an eye on how the value of your investments changes depending upon fluctuations in the markets, economic issues and other factors.\n\n\t\tYou can analyze your investments by looking at financial statements of the companies, see how they have performed in the past and if you expect that the company will perform well in future, then you can think of investing in that company. You should try to familiarize yourself with the financial statements of the company to understand how the company utilizes its finances. You should be wary of the publicity gimmicks that a company would put up to impress the masses. You should develop a knack to read through what the company writes up on its performance as a part of the results declared. Every investment you make is crucial hence you should monitor it from the time you invest into the investment product till the time you receive your proceeds from the investment. The time period from the beginning of the investment, that is when you pay out from your funds to buy an asset, till the time you receive your proceeds from the sale of the asset is termed as the Investment Life Cycle. Every investor should monitor his investments from the time of entry till the time of exit. Throughout the time horizon you stay invested you should maintain a check on your investments. The time horizon varies across investors. Some may enter and exit trades within few minutes, hours or within a day while some stay invested for years. But it is always advised that investors should remain invested for a longer time horizon to benefit from an investment. The longer you stay invested you attract less taxes also. But many do not do that in the hope of making quick profits.\n\nTAX PLANNING\n\n\t\tEvery individual should know about the tax implications on his or her investments. Every individual is charged income tax but the charges vary depending upon under which tax bracket he falls.\n\n\t\tHowever when it comes to investments you can get a tax rebate. Section 80C of the Income Tax Act allows you to get a rebate up to a limit of Rs. 1, 00, 000 which is irrespective of under which tax bracket you are. This covers investments like – \n\n\t\t\t(i) Provident Fund\n\n\t\t\t(ii) Public Provident Fund\n\n\t\t\t(iii) Life insurance premium\n\n\t\t\t(iv)	Pension plans\n\n\t\t\t(v) Equity Linked Saving Schemes of mutual funds\n\n\t\t\t(vi) Infrastructure bonds\n\n\t\t\t(vii) National Savings Certificate\n\n\t\tSection 80D of the Income Tax Act also allows you to get a rebate over premium payments of medical insurance plans. This is over and out of the Rs 1 lakh limit offered by Section 80C. 80D provides a deduction up to Rs 30,000. For senior citizens, the deduction up to Rs. 20,000 is allowable. This deduction is available for premium paid on medical insurance for oneself, spouse, parents and children. It is also applicable to the cheque paid by proprietor firms. This act also exempts home loan payments. For self-occupied properties, interest paid on a housing loan up to Rs 150,000 per year is exempt from tax. However, this is only applicable for a residence constructed within three financial years after the loan is taken and also the loan if taken after April 1, 1999.";
	        descriptions[12] = "\n\n\t\t One can begin investing by fulfilling the following steps:-\n\n\t\t1. Investor must have the following documents \n\n\t\t\t(i) Personal Identification Proof – PAN Card, Passport Copy, Driving License copy\n\n\t\t\t(ii) Address proof – Utility bills – Telephone bills, Electricity bills\n\n\t\t2. Investor should approach an intermediary which may be a broker, relationship manager etc.\n\n\t\t3. Investor is then required to fill up the KYC (Know your client) form and should furnish the necessary details. In addition, he would have to fill the broker-client agreement.\n\n\t\t4. Investors then need to open a demat account and a clearing bank account. For this, he or she would have to furnish his or her bank account details.\n\n\t\tOnce these steps are completed an investor can begin trading in financial markets.In case of any disputes, investors can approach the following authorities\n\n\t\t\t(i)Forex\n\n\t\t\t(ii)Insurance\n\n\t\t\t(iii)Mutual Funds\n\n\t\t\t(iv)Commodities\n\n\t\t\t(v)Corporate Dept.\n\n\t\t\t(vi)Shares/Securities";
	        descriptions[13] = "\n\n\t\t1. www.sebi.gov.in/\n\n\t\t2. www.rbi.org.in/\n\n\t\t3. www.amfiindia.com/\n\n\t\t4. www.mcx-sx.com\n\n\t\t5. www.ftkmc.com\n\n\t\t6. www.fmc.gov.in \n\n\t\t7. www.fimmda.org.in  \n\n\t\t8. www.fsa.gov.uk\n\n\t\t9. www.nseindia.com\n\n\t\t10. www.federalreserve.gov";
 	        
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