package rpncalculator;

import interfaces.PathInterface;

class NumberPath<Double> implements PathInterface {

    private Double first;
    private NumberPath<Double> rest;
    
    public NumberPath(Double first, NumberPath rest){
        this.first = first;
        this.rest = rest;
    }
    
    @Override
    public Double getFirst() {
        return first;
    }

    @Override
    public PathInterface getRest() {
        return rest;
    }
    
    public Double[] peekAll(Double[] l, int i){
        l[i] = first;
        if(rest == null){
            return l;
        }else{
            i++;
            rest.peekAll(l, i);
        }
        return l;
    }
    
}
