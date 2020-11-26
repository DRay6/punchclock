let userRoles = [];
const indexUserRoles = () => {
    fetch(`${URL}/userRoles`)
        .then(resp => resp.json()
            .then((result) => {
                userRoles = result
                renderRoles();
            }))
        .then(data => console.log(data))
};
// .then((result) => {
//     result.json().
// });
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



