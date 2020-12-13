public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public boolean add(T element){
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
    return true;
  }

  public void add(int index, T element){
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
  }

  public T set(int index, T element){
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
