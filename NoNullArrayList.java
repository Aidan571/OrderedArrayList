import java.util.NoSuchElementException;
import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public boolean add(T e) throws IllegalArgumentException{
    if(e == null){
      throw new NoSuchElementException("Can not add a null to a NoNullArrayList");
    }
    else
    super.add(e);
    return true;
  }
}
