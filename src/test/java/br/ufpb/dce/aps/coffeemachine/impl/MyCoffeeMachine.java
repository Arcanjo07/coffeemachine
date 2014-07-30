package br.ufpb.dce.aps.coffeemachine.impl;

import br.ufpb.dce.aps.coffeemachine.CoffeeMachine;
import br.ufpb.dce.aps.coffeemachine.ComponentsFactory;

public class MyCoffeeMachine implements CoffeeMachine {

	ComponentsFactory factory;
	
	public MyCoffeeMachine(ComponentsFactory factory) 
	{
		this.factory = factory;
		this.factory.getDisplay().info("Insert coins and select a drink!");
	}

}
