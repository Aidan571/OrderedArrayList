public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public boolean add(T element) throws IllegalArgumentException{
    if(element == null){
      throw new IllegalArgumentException("Can not add a null to a NoNullArrayList");
    }
    else if(this.size() == 0){
      super.add(element);
    }
    else if(element.compareTo(this.get(this.size()-1)) > 0){
      super.add(element);
    }
    else
    for(int i = 0; i < this.size(); i++){
      if(element.compareTo(this.get(i)) < 0){
        super.add(i,element);
        return true;
      }
    }
    return true;
  }

  public void add(int index, T element) throws IllegalArgumentException{
    int holder  = this.index(element);
    if(element == null){
      throw new IllegalArgumentException("Can not add a null to a NoNullArrayList");
    }
    else if(this.size() == 0){
      super.add(element);
    }
    else
    super.add(holder,element);
  }

  public int index(T element) throws IllegalArgumentException{
    if(element == null){
      throw new IllegalArgumentException("Can not add a null to a NoNullArrayList");
    }
    if(this.size() == 0){
      return 0;
    }
    if(element.compareTo(this.get(0)) < 0){
      return 0;
    }
    else if(element.compareTo(this.get(this.size() - 1)) > 0){
      return this.size() - 1;
    }
    else
    for(int i = 1; i < this.size() - 1; i++){
      if(element.compareTo(this.get(i - 1)) > 0 && element.compareTo(this.get(i)) < 0){
        return i;
      }
    }
    return 0;
  }

  public T set(int index, T element) throws IllegalArgumentException{
    if(element == null){
      throw new IllegalArgumentException("Can not add a null to a NoNullArrayList");
    }
    this.remove(index);
    if(this.size() == 0){
      super.add(element);
    }
    else if(element.compareTo(this.get(this.size()-1)) > 0){
      super.add(element);
    }
    else
    for(int i = 0; i < this.size(); i++){
      if(element.compareTo(this.get(i)) < 0){
        super.add(i,element);
      }
    }
    return element;
  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
}
