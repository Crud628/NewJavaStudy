package Day7Test;

public class Gongsongli extends Hero implements Blend{

	@Override
	public void m_buff(Hero h, double d, int i) {
		// TODO Auto-generated method stub
		
		if(h.getBlood()<0) {
		
		}
		h.setBlood(h.getBlood()+(i*d));
	}

	@Override
	public void m_debuff(Hero h, double d, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void p_buff(Hero h, double d, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void p_debuff(Hero h, double d, int i) {
		// TODO Auto-generated method stub
		
	}
}
