package edu.usc.ict.iago.our_agents;

import edu.usc.ict.iago.utils.ExpressionPolicy;
import edu.usc.ict.iago.utils.History;
/**
 * This Expression policy is a non-policy, that never returns expressions.
 * @author jmell
 *
 */
public class IAGODefaultExpression extends IAGOCoreExpression implements ExpressionPolicy {

	private int gameCount = 0;
	
	@Override
	public String getExpression(History history) 
	{
		return null;
	}

	@Override
	protected String getSemiFairEmotion() {
		return null;
	}

	@Override
	protected String getFairEmotion() {
		return null;
	}

	@Override
	protected String getUnfairEmotion() {
		return null;
	}
	
	@Override
	protected void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}
}
