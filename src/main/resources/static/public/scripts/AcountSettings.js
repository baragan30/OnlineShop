const defaultScene = `                            <div class="myYellowRoundButtonDiv">
<button id="changeUsernameButton" class="myButton myRoundButton myYellow" type="button">Change Username</button>
<button id="changePasswordButton" class="myButton myRoundButton myYellow" type="button">Change Password</button>
</div>`;
const usernameScene = ` <label><b>NewUsername</b></label>
<input id="newusername" class="myInputField" type="text" name="username">
<label><b>Password</b></label>
<input id="password" class="myInputField" type="password" name="password">
    
<div class="myContainer mySaveCancelContainer">
    <button id="saveButton" class="myButton myGreen" type="button">Save Changes</button>
    <button id="cancelButton" class="myButton right" type="button">Cancel</button>
</div>`;
const passwordScene = `                            <label><b>Password</b></label>
<input id="password" class="myInputField" type="password" name="password">
<label><b>New password</b></label>
<input id="newpassword1" class="myInputField" type="password" name="username">
<label><b>Confirm new password</b></label>
<input id="newpassword2" class="myInputField" type="password" name="username">
    
<div class="myContainer mySaveCancelContainer">
    <button id="saveButton" class="myButton myGreen" type="button">Save Changes</button>
    <button id="cancelButton" class="myButton right" type="button">Cancel</button>
</div>`;

const mainDiv = document.getElementById('mainDiv');
let changePasswordButton = null;
let changeUsernameButton = null;
let cancelButton = null;
uploadDefaultScene();

function initialize(state){
    switch(state){
        case 0 :
            changePasswordButton = document.getElementById('changePasswordButton');
            changeUsernameButton = document.getElementById("changeUsernameButton")
            changeUsernameButton.addEventListener('click',uploadChangeUsernameScene);
            changePasswordButton.addEventListener('click',uploadChangePasswordScene);
            break;
        case 1 :
            // let saveButton = document.getElementById("saveButton");
            cancelButton = document.getElementById("cancelButton");
            cancelButton.addEventListener('click',uploadDefaultScene);
            break;
        case 2 :
            // let saveButton = document.getElementById("saveButton");
            cancelButton = document.getElementById("cancelButton");
            cancelButton.addEventListener('click',uploadDefaultScene);
            break;
    }
}

function uploadDefaultScene(){
    console.log('wtf');
    mainDiv.innerHTML = defaultScene;
    initialize(0);
}
function uploadChangeUsernameScene(){
    mainDiv.innerHTML = usernameScene;
    initialize(1);
}
function uploadChangePasswordScene(){
    mainDiv.innerHTML = passwordScene;
    initialize(2);
}