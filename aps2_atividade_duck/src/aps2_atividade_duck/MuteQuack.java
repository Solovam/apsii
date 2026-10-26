package aps2_atividade_duck;

public class MuteQuack implements QuackBehavior{
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
