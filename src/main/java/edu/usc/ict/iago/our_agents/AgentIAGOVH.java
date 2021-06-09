package edu.usc.ict.iago.our_agents;

import javax.websocket.Session;

import edu.usc.ict.iago.utils.GameSpec;


/**
 * @author mell
 * 
 */
public class AgentIAGOVH extends IAGOCoreVH {

	/**
	 * @author mell
	 * Instantiates a new  VH.
	 *
	 * @param name: agent's name
	 * @param game: gamespec value
	 * @param session: the session
	 */
	public AgentIAGOVH(String name, GameSpec game, Session session)
	{
		super("Agent101", game, session, new AgentRepeatedFavorBehavior(AgentRepeatedFavorBehavior.LedgerBehavior.FAIR), new AgentRepeatedFavorExpression(), 
				new AgentRepeatedFavorMessage(true, true, AgentRepeatedFavorBehavior.LedgerBehavior.FAIR, game));	
		
		super.safeForMultiAgent = true;
	}

	@Override
	public String getArtName() {
		return "Agent";
	}

	@Override
	public String agentDescription() {
			return "<h1>Opponent</h1><p>They are excited to begin negotiating!</p>";
	}
}