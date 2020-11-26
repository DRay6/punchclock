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

        if (resp.status === 200){
            window.location = "";
        }
    })
};

// const indexUsers = () => {
//     fetch(`${URL}/entries`, {
//         method: 'GET'
//     }).then((result) => {
//         result.json().then((result) => {
//             entries = result;
//             renderEntries();
//         });
//     });
//     renderEntries();
// };

// const renderEntries = () => {
//     const display = document.querySelector('#entryDisplay');
//     display.innerHTML = '';
//     entries.forEach((entry) => {
//         const row = document.createElement('tr');
//         row.appendChild(createCell(entry.id));
//         row.appendChild(createCell(new Date(entry.checkIn).toLocaleString()));
//         row.appendChild(createCell(new Date(entry.checkOut).toLocaleString()));
//         row.appendChild(createCell('<button type="submit" onclick="deleteEntry('+entry.id+')">Delete</button>'));
//         display.appendChild(row);
//     });
// };

document.addEventListener('DOMContentLoaded', function(){
    const createUserForm = document.querySelector('#createUserForm');
    createUserForm.addEventListener('submit', createUser);
});

