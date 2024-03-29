package edu.usc.ict.iago.our_agents;

import javax.websocket.Session;

import edu.usc.ict.iago.utils.GameSpec;


/**
 * @author mell
 * 
 */
public class IAGOGastonFavorVH extends IAGOCoreVH {

	/**
	 * @author mell
	 * Instantiates a new  VH.
	 *
	 * @param name: agent's name
	 * @param game: gamespec value
	 * @param session: the session
	 */
	public IAGOGastonFavorVH(String name, GameSpec game, Session session)
	{
		super("GastonFavor", game, session, new RepeatedFavorBehavior(RepeatedFavorBehavior.LedgerBehavior.NONE), new RepeatedFavorExpression(), 
				new RepeatedFavorMessage(false, false, RepeatedFavorBehavior.LedgerBehavior.NONE, game));	
		
		super.safeForMultiAgent = true;
	}

	@Override
	public String getArtName() {
		return "Rens";
	}

	@Override
	public String agentDescription() {
			return "<h1>Opponent</h1><p>They are excited to begin negotiating!</p>";
	}
}