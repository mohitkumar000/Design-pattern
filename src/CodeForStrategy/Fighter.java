package CodeForStrategy;

import CodeForStrategy.Kicks.IKickingBehaviour;
import CodeForStrategy.Kicks.RoundHouseKick;
import CodeForStrategy.Punches.HookPunch;
import CodeForStrategy.Punches.IPunchingBehaviour;
import CodeForStrategy.Wrestle.ChokeMove;
import CodeForStrategy.Wrestle.IWrestlingBehaviour;

public class Fighter {
	IKickingBehaviour kb;
	IPunchingBehaviour pb;
	IWrestlingBehaviour wb;
	
	Fighter(){
		this.kb = new RoundHouseKick();
		this.wb = new ChokeMove();
		this.pb = new HookPunch();
	}
	
	void fight() {
		pb.punch();
		kb.kick();
		wb.wrestle();
	}
}
