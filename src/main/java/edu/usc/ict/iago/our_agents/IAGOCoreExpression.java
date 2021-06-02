package edu.usc.ict.iago.our_agents;

import edu.usc.ict.iago.utils.ExpressionPolicy;

public abstract class IAGOCoreExpression implements ExpressionPolicy
{
	protected abstract String getSemiFairEmotion();
	
	protected abstract String getFairEmotion();
	
	protected abstract String getUnfairEmotion();
}
