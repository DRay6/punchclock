const URL = 'http://localhost:8081';

const user = (e) => {
    e.preventDefault();
    const formData = new FormData(e.target);
    const entry = {};
    role = formData.get('role');

    entry['username'] = formData.get('username');
    entry['password'] = formData.get('password');
    entry['role'] = {
        "name" : role
    };

    fetch(`${URL}/users/sign-up`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(entry)
    }).then((result) => {
        result.json().then((entry) => {
            entries.push(entry);
        });
    });
};

const indexUsers = () => {
    fetch(`${URL}/entries`, {
        method: 'GET'
    }).then((result) => {
        result.json().then((result) => {
            entries = result;
            renderEntries();
        });
    });
    renderEntries();
};

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
    createUserForm.addEventListener('submit', user);
    indexEntries();
});

