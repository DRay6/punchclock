let userRoles = [];
const indexUserRoles = () => {
    fetch(`${URL}/userRoles`)
        .then(resp => resp.json()
            .then((result) => {
                console.log({result})
                userRoles = result
                console.log({userRoles})
                renderRoles();
            }))
        .then(data => console.log(data))
};

const renderRoles = () => {
    const select = document.querySelector('#role');
    userRoles.forEach((role) => {
        var option = document.createElement('option');
        option.value = role.id;
        option.innerText = role.name;
        select.appendChild(option);
        console.log(select);
    });
};

document.addEventListener('DOMContentLoaded', function () {

    indexUserRoles();
});



