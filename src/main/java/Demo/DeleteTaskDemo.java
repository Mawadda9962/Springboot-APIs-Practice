package Demo;

import java.util.ArrayList;


public class DeleteTaskDemo {
    public static void main(String[] args){
        //Storing Data
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");

        //printing data
        for (String task: tasks){
            System.out.println(task);
        }


        //Match
        String targetTask = "Call doctor";

        boolean itemRemoved = false;

        //Delete
        for (int i = 0; i<tasks.size(); i++){
            if (tasks.get(i).equalsIgnoreCase(targetTask)){
                tasks.remove(i);
                System.out.println("Task " + targetTask + "Deleted Successfully");
                itemRemoved =true;
                break;
            }
        }

        if (!itemRemoved){
            System.out.println("Task not found, no deletion performed");
        }


        for (String task : tasks){
            System.out.println(task);
        }

    }

}
