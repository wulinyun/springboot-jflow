package BP.GPM;

import java.util.ArrayList;

import BP.En.EntitiesNoName;
import BP.En.Entity;

/** 
 岗位类型
 
*/
public class StationTypes extends EntitiesNoName
{
	/** 
	 岗位类型s
	 
	*/
	public StationTypes()
	{
	}
	/** 
	 得到它的 Entity 
	*/
	@Override
	public Entity getGetNewEntity()
	{
		return new StationType();
	}

	/** 
	 转化成 java list,C#不能调用.
	 @return List
	*/
	public static ArrayList<StationType> convertStationTypes(Object obj)
	{
		return (ArrayList<StationType>) obj;
	}
	public final java.util.List<StationType> ToJavaList()
	{
		return (java.util.List<StationType>)(Object)this;
	}
	/** 
	 转化成list
	 @return List
	*/
	public final ArrayList<StationType> Tolist()
	{
		ArrayList<StationType> list = new ArrayList<StationType>();
		for (int i = 0; i < this.size(); i++)
		{
			list.add((StationType)this.get(i));
		}
		return list;
	}
}