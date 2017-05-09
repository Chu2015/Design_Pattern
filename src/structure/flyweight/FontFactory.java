package structure.flyweight;

import java.util.Hashtable;

public class FontFactory {
	private Hashtable Fonds = new Hashtable();//----------------------------1  
	public FontFactory(){}  
	public Font getFont(Object obj){  
		Font font = (Font) Fonds.get(obj);//----------------2  
		if(font == null){//---------------------------------------------------3  
			//产生新的ConcreteFlyweight  
			font = new Font((String)obj);  
			Fonds.put(obj, font);//--------------------------------------5  
	    }  
		return font;//---------------------------------------------------------6  
	}  
	public int getFontsSize(){  
		return Fonds.size();  
	}  
}
