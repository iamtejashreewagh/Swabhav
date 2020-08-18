var optionMark = false;
var currentQuestion = 1;
var correctAnswers = 0;
var count = 0;


var startButton = document.querySelector("#startButton");
startButton.addEventListener("click",start,false);

var questions = [
                {
                    id: 1,
                    text: "The World Largest desert is _________?",
                    option: ["Thar", "Kalahari", "Sahara", "Sonoran"],
                    answer: "Sahara"
                },
                {
                    id: 2,
                    text: "Mount Everest is located in _________?",
                    option: ["India", "Nepal", "Tibet", "China"],
                    answer: "Nepal"
                },
                {
                    id: 3,
                    text: "The device used for measuring altitudes is ________?",
                    option: ["altimeter", "ammeter", "audiometer", "galvanometer"],
                    answer: "altimeter"
                },
                {
                    id: 4,
                    text: "The Gate way of India is ________?",
                    option: ["Chennai", "Mumbai", "New Delhi", "Delhi"],
                    answer: "Mumbai"
                },
                {
                    id: 5,
                    text: "Which is considered as the biggest port of India?",
                    option: ["Chennai", "Mumbai", "New Delhi", "Delhi"],
                    answer: "Mumbai"
                }
            ]

function start(e){
	this.remove();
	getQuestions();    
}

 

 function getQuestions(e){
 	var questionElement = document.createElement("question");
 	questionElement.id = "question";
	var question = questions[count];
	count++;
	var questionIndex = document.createElement("h2");
	questionIndex.textContent = "Question "+currentQuestion+"/"+questions.length;
	questionElement.appendChild(questionIndex);
	var questionText = document.createElement("h2");
	questionText.textContent = question.id+"."+question.text;
    questionElement.appendChild(questionText);
   
    
    for(var i=0; i<question.option.length; i++){
	     var options = document.createElement("li");
	     var text = document.createTextNode(question.option[i]);
	     inputElement = document.createElement("input");
	     inputElement.setAttribute("type","radio");
	     inputElement.setAttribute("name",question.id);
	     inputElement.onclick = function(){
	     	checkAnswer(this.parentElement.textContent,question.answer);
	     }
	     var btn = document.createElement("Button");
	     btn.innerHTML = "Next";
	     btn.addEventListener("click",getStatus,false);


	     
	     options.appendChild(inputElement);
	     options.appendChild(text);
	     questionElement.appendChild(options);

     
     
  	}
  questionElement.appendChild(btn);  
  document.body.appendChild(questionElement);
 }




function checkAnswer(markOption,correctOption){
	if(markOption === correctOption)
		correctAnswers++;

	optionMark = true;	
}

function getStatus(){
 	
 	
 	if(optionMark == true){ 
	 	var questionElement = document.querySelector("#question");
	 	questionElement.remove();
	 	currentQuestion++
	 	if(currentQuestion <= questions.length){
	 		
	 		getQuestions();
	 	}
	 	else 
	 		getResult();
		}
	else{
		alert("Please mark the option");
	}

 	}

function getResult(e){
	var score = document.createElement("h2");
	score.textContent = "Score = " + correctAnswers;
	document.body.appendChild(score);
	var result = document.createElement("h2");
	

	if(correctAnswers<3){
		result.textContent = "Result = Failed";
	}
	else
		result.textContent="Result = Passed";

	document.body.appendChild(result);
}