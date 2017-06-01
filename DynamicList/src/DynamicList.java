
public class DynamicList<T> {
    
    private Object [] data;
    
    public DynamicList() {
        data = new Object[0];
    }

    public int getSize() {
        return data.length;
    }

    public T getElement(int x) {
        return (T)data[x];
    }
    
    public void setElement(int x, T p) {
        data[x] = p;
    }

    public void addElement(T a) {
        // New array with an extra space
        Object [] tmp = new Object[data.length+1];
        
        // Copy old array to new
        for(int x=0;x<data.length;++x) {
            tmp[x] = data[x];
        }
        
        // Add new element to end
        tmp[data.length] = a;
        
        // Old array is now garbage
        data = tmp;        
    }

    public void insertElement(Point c, int i) {
        // New array with an extra space
        Object [] tmp = new Object[data.length+1];
        
        // Copy entries before the new element
        System.arraycopy(data, 0, tmp, 0, i);
        
        // Copy entries after the new element
        System.arraycopy(data, i, tmp, i+1, data.length-i);
        
        // Add the new element
        tmp[i] = c;
        
        // Old array is now garbage
        data = tmp;
        
    }
    
    public void removeElement(int x) {
        
    }

}
