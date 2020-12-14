import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public boolean add(T e) throws IllegalArgumentException{
    if(e == null){
      throw new IllegalArgumentException("Can not add a null to a NoNullArrayList");
    }
    else
    super.add(e);
    return true;
  }
  public void add(int index, T element) throws IllegalArgumentException{
    if(element == null){
      throw new IllegalArgumentException("Can not add a null to a NoNullArrayList");
    }
    else
    super.add(index,element);
  }
  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("Can not add a null to a NoNullArrayList");
    }
    else
    super.set(index,element);
    return this.get(index);
  }
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }
}
