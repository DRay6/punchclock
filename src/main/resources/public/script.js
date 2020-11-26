const URL = 'http://localhost:8081';

const createCell = (text) => {
    const cell = document.createElement('td');
    cell.innerHTML = text;
    return cell;
};

const createOption = (text) => {
    const  option = document.createElement('option');
    option.innerHTML = text;
    return option;
}

