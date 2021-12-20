<<<<<<< HEAD
const usernameInput = document.getElementsByName("uname")[0];
const paswordInput = document.getElementsByName("psw")[0];
const loginButton = document.getElementById("loginButton");
const cancelButton = document.getElementById("cancelButton");
const checkBox = document.getElementsByName('remember')[0];
const errorLabel = document.getElementById('errorLabel');

loginButton.addEventListener("click",onpressedLoginButton);
=======
const usernameInput = document.getElementById("username");
const paswordInput = document.getElementById("password");
const cancelButton = document.getElementById("cancelButton");
const errorLabel = document.getElementById('errorLabel');

>>>>>>> 39ee00163e731d5c4ea3769f669edd61b192ebd8
cancelButton.addEventListener("click",onpressedCancelButton);

usernameInput.addEventListener("input" ,(e) => {
    onTypeInput("Username",usernameInput.value);
});
paswordInput.addEventListener("input" ,(e) => {
    onTypeInput("Password",paswordInput.value);
});

function onTypeInput(sourceInput,input){
<<<<<<< HEAD
=======

>>>>>>> 39ee00163e731d5c4ea3769f669edd61b192ebd8
    errorLabel.innerHTML = "";
    if (input === ""){
        errorLabel.innerHTML = sourceInput + " input is empty"
    }
}


<<<<<<< HEAD
function onpressedLoginButton(e){
    if(!(usernameInput.value === "") && !(paswordInput.value=== "") && checkBox.checked ){
        console.log('Sent data');
    }
}
=======
// function onpressedLoginButton(e){
//     if(!(usernameInput.value === "") && !(paswordInput.value=== "") ) {
//         $.ajax({
//             type: "GET",
//             url: "/loginCheck/" + usernameInput.value + "," + paswordInput.value,
//             timeout: 100000,
//             success: function (response) {
//                 console.log("SUCCESS: ");
//                 console.log(response);
//             },
//             error: function (e) {
//                 console.log("ERROR: ", e);
//             },
//             done: function (e) {
//                 console.log("DONE");
//             }
//         });
//     }
// }
>>>>>>> 39ee00163e731d5c4ea3769f669edd61b192ebd8
function onpressedCancelButton(e){
    usernameInput.value = "";
    paswordInput.value = "";
}
