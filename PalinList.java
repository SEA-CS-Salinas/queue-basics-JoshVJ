package QueuesIntro2;

/*
 * PalinList class sees if a sentence is a palindrome sentence (in that the order is the same forward and backward)
 *  @author Joshua Vento-Jones
 */

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue; // Holds the queue of the sentence given
	private Stack<String> stack; // Holds the stack of the sentence given

	// No-Argument Constructor sets list to blank to ensure that methods have a stack/queue to work with.
	public PalinList()
	{
		setList("");
	}

	// Parameterized constructor sets list to the given parameter to be split by spaces
	// @param list is a String to be split by spaces to check if the sentence is a palindrome sentence
	public PalinList(String list)
	{
		setList(list);
	}

	// Sets both stack and queue variables to hold each word in the list parameter
	// @param list: String to be split by spaces to be added to the stack and queue.
	public void setList(String list)
	{
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		String[] wordList = list.split(" ");
		for(String word : wordList) {
			stack.add(word);
			queue.add(word);
		}
	}

	// Checks whether or not the sentence is a palindrome by comparing the beginning of the queue and the end of the stack
	// @return True if the sentence is a palindrome sentence (backward order matches forward order)
	public boolean isPalin()
	{
		Stack<String> stack1 = stack;
		Queue<String> queue1 = queue;
		
		while(!stack1.isEmpty() && !queue1.isEmpty()) {
			if(!stack1.pop().equals(queue1.remove())) {
				return false;
			}
		}
		return true;
	}


	// @return A String with the original sentence (separated by spaces) on whether or not the sentence is a palindrome sentence.
	
	public String toString() {
		ArrayList list = new ArrayList<String>();
		for(String word : stack) {
			list.add(word);
		}
		if(isPalin()) {
			return list + " is a palinlist.";
		}
		else {
			return list + " is not a plainlist.";
		}
	}
}
