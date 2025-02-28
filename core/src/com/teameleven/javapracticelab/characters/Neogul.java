package com.teameleven.javapracticelab.characters;

import com.badlogic.gdx.graphics.Texture;
import com.teameleven.javapracticelab.items.Mango;
import com.teameleven.javapracticelab.utils.Gender;


public class Neogul extends Villager {
    public Neogul(String name, Gender gender) {
    	super(name, gender);
        this.setTexture(new Texture("villager_" + name + ".png"));
        this.name = name;
        this.gender = gender;
		positionX = (float)500;
        positionY = (float)500;
    }

    @Override
    public void talk(Player player) {

		int talkCase = random.nextInt(5);

		if (firstTalk) {
			talkMsg.showMessageDialog(null, "이 섬에온걸 환영하구리 " + player.getName() + "!");
			firstTalk = false;
			return;
		}
		if (talkCase == 0) {
			talkMsg.showMessageDialog(null, "혹시 고민이 있어구리? \n 언제나 말해줘도 괜찮구리!");
			return;
		}
		if (talkCase == 1) {
			talkMsg.showMessageDialog(null, "" + player.getName() + ", 섬 생활은 좀 어떠구리? \n 여러 주민들에게도 말을 걸어보면 좋은 일이 있을수도 있구리!");
			return;
		}
		if (talkCase == 2) {
			talkMsg.showMessageDialog(null, "미안하구리 " + player.getName() + "... 집은 아직 공사 중이여서 들어갈수 없구리...");
			return;
		}
		if (talkCase == 3) {
			talkMsg.showMessageDialog(null, "내 선물이구리! 아무한테도 말하지 말어!");
			player.getInventory().addItem(new Mango());
			player.getInventory().addItem(new Mango());
			talkMsg.showMessageDialog(null, "망고 2개 획득!");
			return;
		}
		if (talkCase == 4) {
			talkMsg.showMessageDialog(null, player.getName() + ", 시간이 되면 다른 사람들의 섬으로도 놀러가 보구리!");
			return;
		}
	}
}
