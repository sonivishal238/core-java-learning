package problemSolving.interviewQuestions.miscQuestions.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/*
You are given a sequence of queries to process on an initially empty container of integers.

The container must support the following operations:

ADD <value>
Add the specified integer value to the container.

REMOVE <value>
Remove a single occurrence of the specified integer value from the container if it exists.
Return "true" if a value was removed, otherwise return "false".

EXISTS <value>
Check whether the specified integer value exists in the container.
Return "true" if it exists, otherwise return "false".

GET_NEXT <value>
Return the smallest integer in the container that is strictly greater than the given value.
If no such integer exists, return an empty string.

The container may store duplicate values. All operations must preserve the behavior of previous operations.

Given the list of queries, return an array of strings representing the result of each operation in the order they were executed.

The container is empty at the start.
 */
public class CRUDOperationApplication {
    public String[] solution(String[][] queries) {
        TreeMap<Integer, Integer> counts = new TreeMap<>();
        List<String> result = new ArrayList<>();

        for (String[] query : queries) {
            String operation = query[0];
            int value = Integer.parseInt(query[1]);

            switch (operation) {
                case "ADD":
                    counts.put(value, counts.getOrDefault(value, 0) + 1);
                    result.add("");
                    break;

                case "REMOVE":
                    if (counts.containsKey(value)) {
                        int current = counts.get(value);
                        if (current == 1) {
                            counts.remove(value);
                        } else {
                            counts.put(value, current - 1);
                        }
                        result.add("true");
                    } else {
                        result.add("false");
                    }
                    break;

                case "EXISTS":
                    result.add(counts.containsKey(value) ? "true" : "false");
                    break;

                case "GET_NEXT":
                    Integer next = counts.higherKey(value);
                    result.add(next == null ? "" : String.valueOf(next));
                    break;
            }
        }

        return result.toArray(new String[0]);
    }
}
