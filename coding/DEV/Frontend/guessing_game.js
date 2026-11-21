let max = prompt("enter the max number");

const random = Math.floor(Math.random() * max) + 1;

let guess = prompt("guess the number");

while(true){
    if(guess == "quit"){
        console.log("quitting the game");
        break;
    }

    if(guess == random){
        console.log("CONGRATTS!! You guessed it right.");
        break;
    } else if(guess < random){
        guess = prompt("Hint: Your number was small. Please try again.");
    } else{
        guess = prompt("Hint: Your number was large. Please try again.");
    }
}