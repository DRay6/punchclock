const createUser = (e) => {
    e.preventDefault();
    const formData = new FormData(e.target);
    const user = {};

    user.username = formData.get('username');
    user.password= formData.get('password');
    user.userRole = {
        id: +formData.get('role')
    }
    console.log(user);

    fetch(`${URL}/users/sign-up`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    }).then(resp => {
        console.log(resp)
        window.location.assign("./html/login.html");
    })
};



document.addEventListener('DOMContentLoaded', function(){
    const createUserForm = document.querySelector('#createUserForm');
    createUserForm.addEventListener('submit', createUser);
});

