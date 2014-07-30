package br.ufpb.dce.aps.coffeemachine.impl;

import java.util.ArrayList;
import java.util.List;

import br.ufpb.dce.aps.coffeemachine.CoffeeMachine;
import br.ufpb.dce.aps.coffeemachine.Coin;
import br.ufpb.dce.aps.coffeemachine.ComponentsFactory;

public class MyCoffeeMachine implements CoffeeMachine {

	List<Coin> coins = new ArrayList<Coin>();
	ComponentsFactory factory;
	private int total, indice;
	private Coin coin;
	
	public MyCoffeeMachine(ComponentsFactory factory) 
	{
		this.factory = factory;
		this.factory.getDisplay().info("Insert coins and select a drink!");
	}

	public void insertCoin(Coin coin) 
	{
		total += coin.getValue();
		coins.add(coin);
		indice ++;
		this.factory.getDisplay().info(
				"Total: US$ " + this.total / 100 + "." + this.total % 100);
	}

}
