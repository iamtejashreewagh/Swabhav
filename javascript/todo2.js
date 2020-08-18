var todos = [];
var completedTodos = 0;
var incompletedTodos = 0;

function addElement(){
		var li = document.createElement("li");
		var text = document.getElementById("InputBox").value;
		var temp = document.createTextNode(text);
		li.appendChild(temp);
		if(text === ''){
			alert("You must type something")
		}
		else{
		document.getElementById("IncompletedElements").appendChild(li);
		todos.push(text + " X ")
		document.getElementById("InputBox").value="";
		var btn = document.createElement("BUTTON"); 
        btn.className = "close";  
        btn.innerHTML = " X ";  
         
         btn.addEventListener("click",deleteElement);

    var element = document.createElement("INPUT");
    element.setAttribute("type", "checkbox");
    element.className = "check";
    element.id = "check";
    element.addEventListener("change",addCompletedElement);

    li.appendChild(btn);
    li.appendChild(element);  
    var elementId = document.getElementById("IncompletedElementsHeader");
	
	incompletedTodos++;
	elementId.textContent = "InCompleted Todos" + " "+incompletedTodos;
		
	}
	
}

function addCompletedElement(){
	var element = this.parentElement;
	var check = element.lastChild;
	check.removeEventListener("change",addCompletedElement);
	check.addEventListener("change",revokeCompletedElement);
	document.getElementById("CompletedElement").appendChild(element);

	var completed = document.getElementById("CompletedElementHeader");
	var notCompleted = document.getElementById("IncompletedElementsHeader");
	completedTodos++;
	incompletedTodos--;
	completed.textContent = "Completed Todos" + " "+completedTodos;
	notCompleted.textContent = "InCompleted Todos" + " "+incompletedTodos;
}

function revokeCompletedElement(){
	var element = this.parentElement;
	var check = element.lastChild;
	check.removeEventListener("change",revokeCompletedElement);
	check.addEventListener("change",addCompletedElement);
	document.getElementById("IncompletedElements").appendChild(element);

	var notCompleted = document.getElementById("IncompletedElementsHeader");
	var completed = document.getElementById("CompletedElementHeader");
	incompletedTodos++;
	completedTodos--;
	notCompleted.textContent = "InCompleted Todos" + " "+incompletedTodos;
	completed.textContent = "Completed Todos" + " "+completedTodos;
}


function deleteElement(){
	var li = this.parentElement;
	var text = li.textContent;
	li.remove();
	for(var i =0;i<todos.length;i++){
		
	
		if(todos[i]===text){
			todos.splice(i,1);
				
		}
	}
   
}
