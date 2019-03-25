import java.util.ArrayList;
import java.util.List;

public interface Calculator {
    /**
     * Student 1: Julia Trummer
     * Student 2: Lea Franz
     *
     * TODO Instruction for GIT Lab for Grading GIT Part of Configuration Management
     *  - copy content of this git repository / zip file
     *
     *	- create your own remote repository, take care about Project Layout (!)
     *
     *
     *
     * (! all Students !)
     *  - implement a sum() which returns the sum of all Integer Values added by add()
     *	- implement this method with different implementations
     *	- commit your changes
     *	- if every Student has finished with commit, start to push your implementation
     *	- if every implementation has been pushed to remote, tag final implementation with "FinalVersion"
     *
     *
     * FINAL ASSIGNMENT
     *  - don't forget to push everything (!)
     *	  AND final version includes
     *		- runnable source code
     *		- with test call methods in main Class
     *		- before commit take care that you previously tested your own source code
     * - finish your assignment at elearning website with publishing repository url
     *
     *
     * REMEMBER Git commands:
     *
     *   											<- Clone (FROM REMOTE)
     *   				<- Checkout (From LOCAL)
     *   -> (add) 		-> Commit (TO LOCAL) 		-> Push (TO REMOTE)
     *   					  		(LOCAL)			<- Pull (FROM REMOTE)
     *
     *a
     */


    void addValue(int value);

    int getMaximum(List<Integer> list);

    int getMinimum(List <Integer> list);

}
