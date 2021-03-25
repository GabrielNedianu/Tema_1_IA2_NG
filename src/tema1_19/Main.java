package tema1_19;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
}
		
//	static int CalculateQueueSize(int allMessages[])
//	{
//		int queueRemaining = 0;
//		for (int i : allMessages) {
//			if(i>0) {
//				queueRemaining ++;
//			}
//			else {
//				queueRemaining --;
//			}
//		}
//		return queueRemaining;
//	}
//	
//	static int CalculateQueueSize2(int[] allMessages)
//	{
//		ArrayList<Integer> queueRemaining = null;
//		for (int i : allMessages) {
//			if(i>0) {
//				queueRemaining.add(i);
//			}
//			else {
//				queueRemaining.remove(queueRemaining.get(-i));
//				queueRemaining.remove(-i);
//			}
//		}
//		return queueRemaining.size();
//	}
//	
//	static int CalculateTravelTime(int[] path)
//	{
//		double BatteryLvl = 100.0;
//		int time = 0;
//		
//		for (int rank : path) {
//			if(rank < 0) {
//				BatteryLvl = BatteryLvl - rank;
//				if(BatteryLvl > 100)
//					BatteryLvl = 100;
//				time = time + rank +11;
//			}
//			else {
//				double BatteryLvltemp = BatteryLvl - (rank + 2)*5;
//				if (BatteryLvltemp <= 0) {
//					time = time + 20 + rank + 11;
//					BatteryLvl = 100 + BatteryLvl - (rank + 2)*5;
//					continue;
//				}
//				BatteryLvl = BatteryLvltemp;
//				time = time + rank +11;
//			}
//		}
		

