let userRoles = [];
const indexUserRoles = () => {
    fetch(`${URL}/userRoles`, {
        method: 'GET'
    }).then((result) => {
        result.json().then((result) => {
            entries = result
            renderRoles();
        });
    });
    console.log("Hey"+indexUserRoles());
    renderRoles();

};

const renderRoles = () => {
    const select = document.querySelector('#role');
    userRoles.forEach((role) => {
        const option = document.createElement();
        option.appendChild('<option value="'+role.name+'">'+role.name+'</option>');
        select.appendChild(select);
        console.log(select);
    });
};

document.addEventListener('DOMContentLoaded', function(){

    indexUserRoles();
});



