package rpncalculator;

public class StackPath {

    private NumberPath<Double> data = null;
    private int count = 0;
    
    public void push(Double element){
        data = new NumberPath<Double>(element, data);
        count++;
    }
    
    public Double pop(){
        if(data == null){
            return 0.0;
        }
        Double value = data.getFirst();
        data = (NumberPath<Double>) data.getRest();
        count--;
        return value;
    }
    
    public Double[] peekAll(){
        Double[] l = new Double[count];
        if(data == null){
            return null;
        }else{
            return data.peekAll(l, 0);
        }
    }
}
