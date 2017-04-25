/********************************
 * Implementation details:
 * To enqueue items in the ArrayPriorityQueue, we add an item such that the ArrayPriorityQueue remains sorted by the priority of the elements. We do this by adding the item to the end and then walking the element to the position it should be in.
 * To dequeue items, we simply remove and return the element at the end of the ArrayPriorityQueue. Since the ArrayPriorityQueue is sorted, the highest priority items are all at the end of the ArrayPriorityQueue.
 * In the case of multiple items with the same priority, the first item of a given priority will be the first to be dequeue'd when that priority is the highest priority. That is, there is a FIFO-ness to items that are of the same priority.
 ********************************/
import java.util.ArrayList;
public class ArrayPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T>{

    private ArrayList<T> _queue;

    public ArrayPriorityQueue(){
        _queue = new ArrayList<T>();
    }

    public int size(){
        return _queue.size();
    }

    public T get( int i ){
        return _queue.get( i );
    }

    // Add item such that the ArrayPriorityQueue will remain sorted by priority
    public void add( T newInt ){
        _queue.add( newInt );
        int walk = _queue.size()-1;
        while ( walk != 0 && 
                _queue.get( walk ).compareTo( _queue.get(walk-1) ) >= 0
              ){
            _queue.set( walk, _queue.set( walk-1, _queue.get(walk) ) );
            walk--;
        }
    }

    public boolean isEmpty(){ return _queue.size() == 0; }

    // Peek/remove the highest priority items by using the last item in the ArrayPriorityQueue
    public T peekMin(){
        return _queue.get(_queue.size()-1);
    }
    public T removeMin(){
        return _queue.remove( _queue.size()-1 );
    }

    public String toString(){
        String retStr = "";
        for( int i = 0; i < _queue.size(); i++ ){
            retStr += _queue.get( i ) + " ";
        }
        return retStr;
    }

    // Main method for testing purposes
    public static void main( String[] args){
        ArrayPriorityQueue<Integer> bob = new ArrayPriorityQueue<>();
        System.out.println( "Enqueueing people..." );
        bob.add( 0 );
        bob.add( 1 );
        bob.add( 0 );
        bob.add( 2 );
        bob.add( 0 );
        bob.add( 1 );
        bob.add( 0 );
        bob.add( 3 );
        bob.add( 1 );
        System.out.println( bob );
        while( ! bob.isEmpty() ){
            System.out.println( "Queue: " + bob );
            System.out.println( "Minimum value: " + bob.peekMin() );
            System.out.println( "Removed: " + bob.removeMin() );
            System.out.println();
        }
    }//end main

}//end class ArrayPriorityQueue
