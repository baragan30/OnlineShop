const usernameInput = document.getElementsByName("uname")[0];
const paswordInput = document.getElementsByName("psw")[0];
const loginButton = document.getElementById("loginButton");
const cancelButton = document.getElementById("cancelButton");
const checkBox = document.getElementsByName('remember')[0];
const errorLabel = document.getElementById('errorLabel');

loginButton.addEventListener("click",onpressedLoginButton);
cancelButton.addEventListener("click",onpressedCancelButton);

usernameInput.addEventListener("input" ,(e) => {
    onTypeInput("Username",usernameInput.value);
});
paswordInput.addEventListener("input" ,(e) => {
    onTypeInput("Password",paswordInput.value);
});

function onTypeInput(sourceInput,input){
    errorLabel.innerHTML = "";
    if (input === ""){
        errorLabel.innerHTML = sourceInput + " input is empty"
    }
}


function onpressedLoginButton(e){
    if(!(usernameInput.value === "") && !(paswordInput.value=== "") && checkBox.checked ){
        console.log('Sent data');
    }
}
function onpressedCancelButton(e){
    usernameInput.value = "";
    paswordInput.value = "";
}
