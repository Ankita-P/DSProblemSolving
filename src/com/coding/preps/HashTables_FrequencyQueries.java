package com.coding.preps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashTables_FrequencyQueries {
	
	public static void main(String[] args)
	{
		List<int[]> queries = new ArrayList<int[]>();
		
		int[] op = {3,4};
		int[] op1 = {2,1003};
		int[] op2 = {1,16};
		int[] op3 = {3,1};
		
		queries.add(op);
		queries.add(op1);
		queries.add(op2);
		queries.add(op3);
		
		List<Integer> output = new ArrayList<Integer>();
		HashMap<Integer, Integer> operationsArray = new HashMap<Integer, Integer>();
		
		for(int i=0; i<queries.size(); i++)
		{
			int operationType = queries.get(i)[0];
			int opValue = queries.get(i)[1];
			
			switch(operationType)
			{
				case 1:
				{
					if(operationsArray.containsKey(opValue))
					{
						int currentFrequency = operationsArray.get(opValue);
						operationsArray.replace(opValue, currentFrequency+1);
					}
					else
					{
						operationsArray.put(opValue, 1);
					}
					break;
				}
				case 2:
				{
					if(operationsArray.containsKey(opValue))
					{
						int currentFrequency = operationsArray.get(opValue);
						if(currentFrequency > 1)
						{
							operationsArray.replace(opValue, currentFrequency-1);
						}
						else
						{
							operationsArray.remove(opValue);
						}
					}
					break;
				}
				case 3:
				{
					if(operationsArray.containsValue(opValue)) {
						output.add(1);
					}
					else
					{
						output.add(0);
					}
					break;
				}
			}
		}
		
		int[] arr = new int[output.size()]; 
		  
        // ArrayList to Array Conversion 
        for (int i =0; i < output.size(); i++) 
            arr[i] = output.get(i); 
  
        for (int x : arr) 
            System.out.print(x + " "); 
        
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<List<Integer>> queries = new ArrayList<>();
//
//            IntStream.range(0, q).forEach(i -> {
//                try {
//                    queries.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                            .map(Integer::parseInt)
//                            .collect(toList())
//                    );
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            });
//
//            List<Integer> ans = freqQuery(queries);
//
//            bufferedWriter.write(
//                ans.stream()
//                    .map(Object::toString)
//                    .collect(joining("\n"))
//                + "\n"
//            );
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
	}
}
	
