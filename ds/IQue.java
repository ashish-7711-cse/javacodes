package ds;
import mypkg.iSize;
public interface IQue extends iSize
{
	void insert(int d);
	void remove();
	boolean isFull();
	boolean isEmpty();
	void qMenu();
}