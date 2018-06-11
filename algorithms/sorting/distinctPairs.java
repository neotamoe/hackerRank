// not officially a hackerrank challenge;
// internal daugherty code challenge
// code challenge written up by chris g
// corresponding tests not included below

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class SolveCountPairsAddToTarget implements BiFunction<List<Integer>, Integer, Integer> {

    /**
     * <b>Problem 1:<b/> For the given "sequence" count how many distinct number pairs add to the target value.
     *
     * <b>Example 1:<b/>
     *
     * Sequence: [1,2,3,1]
     * Target: 4
     *
     * Pairs:
     * 1,3
     * !3,1
     *
     * Number of Distinct Pairs: 1
     *
     * <b>Example 2:<b/>
     *
     * Sequence: [7,6,6,3,5,9,3]
     * Target: 12
     *
     * Pairs:
     * 7,5
     * 6,6
     * !6,6
     * 3,9
     * !9,3
     *
     * Number of Distinct Pairs: 3
     */

    //    This is my code...
    @Override
    public Integer apply(List<Integer> sequence, Integer target) {
        Integer count = 0;

        Map<Integer, Integer> distinctPairs = new HashMap<Integer, Integer>();


        for(int i=0; i<sequence.size(); i++){
            Integer sequenceI = sequence.get(i);
            for(int j=i+1; j<sequence.size(); j++){
                Integer sequenceJ = sequence.get(j);
                if(sequenceI + sequenceJ == target ){
                    if( !distinctPairs.containsKey(sequenceI) && !distinctPairs.containsValue(sequenceJ)
                            && !distinctPairs.containsKey(sequenceJ) && !distinctPairs.containsValue(sequenceI)){
                        distinctPairs.put(sequenceI, sequenceJ);
                        count++;
                    } else if ( (distinctPairs.containsKey(sequenceI) && distinctPairs.get(sequenceI)!=sequenceJ)
                        && (distinctPairs.containsKey(sequenceJ) && distinctPairs.get(sequenceJ)!=sequenceI) ) {
                        distinctPairs.put(sequenceI, sequenceJ);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
