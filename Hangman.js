var wordToSolve = prompt("Please give a word to solve.");
var NumberOfWrongs = 5;

var guess = function()
{
    var yourguess = prompt("Guess a letter A - Z");
    if(yourguess.length != 1)
	{
		console.log("Input should be 1 letter! Guess again.");
		yourguess = guess();
	}

	return yourguess;
};

var solver = function(wordToSolve, NumberOfWrongs)
{ 

	var wincounter = 0;
	var losscounter = 0;
	var checker = 0;

	var Extremelength = '**********************************';
	var HiddenString = Extremelength.substring(0, wordToSolve.length);

	while(wincounter < wordToSolve.length || losscounter < NumberOfWrongs)
	{
		var letter = guess();
		for(var i = 0; i <wordToSolve.length; i++)
		{
			if(letter === wordToSolve[i])
			{
				//checker variable is used to see if you hit this condition
				HiddenString = HiddenString.substring(0, i) + letter
                + HiddenString.substring(i+1,wordToSolve.length);				
				console.log(HiddenString);
				wincounter++;
                checker = true;
			}
		}
        if(checker === false)
        {
            losscounter++;
            console.log(losscounter);
		}
        checker = false;            
        if(losscounter === NumberOfWrongs)
        {
            console.log("You Lose!");
            
        }
        else if(wincounter === wordToSolve.length)
        {
            console.log("You Win!");
            console.log("The Word was " + wordToSolve);    
        }
	}
};


var PlayBall = solver(wordToSolve, NumberOfWrongs);