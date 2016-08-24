package com.tiy.practice;

/**
 * Created by jessicatracy on 8/16/16.
 */
public class JavaNamer {

    public String makeVariableName(String myString) {
        String[] arrayTakeOutSpaces = myString.split(" ");
        for (int stringCounter = 0; stringCounter < arrayTakeOutSpaces.length; stringCounter++) {
            arrayTakeOutSpaces[stringCounter] = arrayTakeOutSpaces[stringCounter].toLowerCase();
            if ((stringCounter > 0) && (arrayTakeOutSpaces.length > 1)) {
                arrayTakeOutSpaces[stringCounter] = arrayTakeOutSpaces[stringCounter].substring(0, 1).toUpperCase() + arrayTakeOutSpaces[stringCounter].substring(1);
            }
        }
        String answer = "";
        for (String loopString : arrayTakeOutSpaces) {
            answer += loopString;
        }
        return answer;
    }

    public String makeMethodName(String myString) {
        String varName = makeVariableName(myString);
        String answer = varName + "()";
        return answer;
    }

    public String makeClassName(String myString) {
        String[] arrayTakeOutSpaces = myString.split(" ");
        for (int stringCounter = 0; stringCounter < arrayTakeOutSpaces.length; stringCounter++) {
            arrayTakeOutSpaces[stringCounter] = arrayTakeOutSpaces[stringCounter].toLowerCase();
            arrayTakeOutSpaces[stringCounter] = arrayTakeOutSpaces[stringCounter].substring(0, 1).toUpperCase() + arrayTakeOutSpaces[stringCounter].substring(1);
        }
        String answer = "";
        for (String loopString : arrayTakeOutSpaces) {
            answer += loopString;
        }
        answer += "{}";
        return answer;
    }
}
