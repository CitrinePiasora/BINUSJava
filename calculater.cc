#include <iostream>
using namespace std;

float addition (float a, float b) {
  return a + b;
}

float substraction (float a, float b) {
    return a - b;
}

float multiplication (float a, float b) {
    return a * b;
}

float division (float a, float b) {
    return a / b;
}


int main() {
    float a, b;
    string choice;
    bool run = true;

    cout << "Welcome to the calculator app!" << endl;

    while(run) {
        cout << "Enter First Number: ";
        cin >> a;
        cout << "Enter Second Number: ";
        cin >> b;

        cout << "What would you like to do?\n1. Addition [+]\n2. Substraction [-]\n3. Multiplication [*]\n4. Division [/]\n5. Exit [x]\n>>> ";
        cin >> choice;

        if(choice == "addition" || choice == "+" || choice == "1") {
            cout << "The sum of both numbers is: " << addition(a, b) << endl;
        }
        else if(choice == "substraction" || choice == "-+" || choice == "2") {
            cout << "The answer from the substraction is: " << substraction(a, b) << endl;
        }
        else if(choice == "multiplication" || choice == "*" || choice == "3") {
            cout << "The multiplication of both numbers is: " << multiplication(a, b) << endl;
        }
        else if(choice == "division" || choice == "/" || choice == "4") {
            cout << "The answer from the division: " << division(a, b) << endl;
        }
        else if(choice == "quit" or choice == "exit" or choice == "x") {
            run = false;
            cout << "See you again soon!";
        }
        
        cout << "Do you wish to continue? [yes/no]: ";
        cin >> choice;

        if(choice == "quit" or choice == "exit" or choice == "no" or choice == "x") {
            run = false;
            cout << "We hope to see you again soon!";
        }
    }
    }
    return 0;
}
