package edu.oakland.grizzfit.grizzfit;

/**
 * Created by Zach on 3/1/2018.
 */

public class Log {

    public int calories;
    public String date;
    public String foodName;

    //constructors
    public Log(int calories, String date, String foodName) {
        this.calories = calories;
        this.date = date;
        this.foodName = foodName;
    }

    //empty constructor
    public Log() {}


    //Setters and getters
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
