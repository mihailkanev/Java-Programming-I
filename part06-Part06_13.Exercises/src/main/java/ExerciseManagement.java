import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
        
    }

    public ArrayList<Exercise> exerciseList(){
        ArrayList<Exercise> list =  new ArrayList<>();
        for (Exercise string : list) {
            list.add(string);
        }
        return list;
    }
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise){
        for (Exercise e : exercises) {
            if(e.getName().equals(exercise)){
                e.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise){
        for (Exercise ex : exercises) {
            if(ex.getName().equals(exercise)){
                return ex.isCompleted();
            }
        }
        return false;
    }
}
