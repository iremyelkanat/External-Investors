package model;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * A class that holds a list of TradeAction objects.
 *
 * @author Duygu Nur Yaldiz,Arda G�kto�an
 * @version 10.12.2018
 */
public class TradingHistory {

	/** The trades. */
	//properties
	ArrayList<TradeAction> trades;
	
	/** The DB connector. */
	//db connectors
	UserTradeHistoryDBConnector DBConnector = new UserTradeHistoryDBConnector();
	
	//Constructor
	/**
	 * Constructs a new trading history object by initializing trades property.
	 *
	 * @param userID the user ID
	 */
	public TradingHistory( int userID ) {
		
		trades = DBConnector.getUserTradeHistory( userID );
		
	}
	
	/**
	 * returns trading history as array list.
	 *
	 * @return trading history
	 */
	public ArrayList<TradeAction> getTrades(){
		
		return trades;
		
	}
	
	//Methods
	/**
	 * Adds a new TradeAction object to the trading action list.
	 *
	 * @param trade the object to be added to the list
	 */
	public void add( TradeAction trade ) {
		trades.add(trade);
	}
	
	/**
	 * Returns string representation of Trading History.
	 *
	 * @return string representation of Trading History
	 */
	public String toString()
	{
		return trades.toString();
	}
}
