package br.ufpb.dce.aps.coffeemachine;

import br.ufpb.dce.aps.coffeemachine.impl.MyCoffeeMachine;

public class MyCoffeeMachineTest extends CoffeeMachineTest{

	MyCoffeeMachine factory;
	
	@Override
	protected CoffeeMachine createFacade(ComponentsFactory factory) 
	{
		return  new MyCoffeeMachine(factory);
	}

}
