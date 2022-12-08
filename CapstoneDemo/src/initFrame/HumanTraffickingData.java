package initFrame;

import java.util.Vector;

public class HumanTraffickingData {
	
	
	private Vector<EntryData> entryVec = new Vector<EntryData>();
	
	public HumanTraffickingData()
	{
		
	}
	
	public void addEntry(EntryData entry) {
		entryVec.addElement(entry);
		
	}
	
	public void displayData()
	{
		System.out.println("Number of entries total: " + entryVec.size() + "\n");
		
		for(int i = 0; i < entryVec.size(); i++)
		{
			System.out.println("Entry Number: " + i + "\n");
			System.out.println(" Name: " + entryVec.get(i).getFirstName() + entryVec.get(i).getLastName() + "\n" + 
					"Age: " + entryVec.get(i).getAge() + "\n" + 
					"Needs Help: " + entryVec.get(i).getNeedHelp() + "\n" + 
					"Location : " + entryVec.get(i).getLocationData() + "\n" + 
					"Additional Information: " + entryVec.get(i).getAdditionalInfoData()+"\n\n");
		}
	}

}
