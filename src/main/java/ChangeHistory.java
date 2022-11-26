
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
public class ChangeHistory {
    private ArrayList<Double> hist;

    public ChangeHistory() {
        this.hist = new ArrayList<>();
    }
    
    public void add(double status){
        this.hist.add(status);
    }
    
    public void clear() {
        this.hist.clear();
    }
    
    public String toString(){
        return this.hist.toString();
    }
    
    public double maxValue() {
        if (!this.hist.isEmpty()){
            return Collections.max(this.hist);
        }
        return 0.0;
    }
    
    public double minValue(){
        if(this.hist.isEmpty()){
            return 0.0;
        }
        return Collections.min(this.hist);
    }
    
    public double average(){
        if(this.hist.isEmpty()){
            return 0.0;
        }
        double sum = 0;
        for(Double i:this.hist){
            sum += i;
        }
        return 1.0 * sum / this.hist.size();
    }
}
