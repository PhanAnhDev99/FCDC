const getTag = selector => document.querySelector(selector);
const getTagList = selector => document.querySelectorAll(selector);

const radioList = getTagList('.roles__item input');
const controlChangeOneDiv = getTag('.control__change-one');
const controlChangeTwoDiv = getTag('.control__change-two');
const createForm = getTag('.form-create');

function radioEvent() {

    const removeAllChild = (parent) => {
        while (parent.firstChild) {
            parent.removeChild(parent.firstChild);
        }
    }

    const addNewChild = (parent, newChilds) => parent.innerHTML = newChilds;

    const addtionalFormControl = () => {
        const element = document.createElement('div');
        const attribute = document.createAttribute('class')
        attribute.value = 'form-create__control last-control';
        element.setAttributeNode(attribute);
        const child = `<div class="side name" style="margin-left: 0"> 
                             <label for="sub-district">Phường/Xã</label>
                             <input type="text" name="sub-district" id="sub-district">
                             </div>`
        element.innerHTML = child;
        createForm.appendChild(element);
    }

    const getNewChild = (radio) => {
        const newChildList = [];
        let newChildOne, newChildTwo = '';
        switch (radio.value) {
            case 'doctor':
                newChildOne = `<label for="hospital">Bệnh viện</label>
                <input type="text" name="hospital" id="hospital">`;
                newChildTwo = `<label for="hospital-address">Địa chỉ bệnh viện</label>
                <input type="text" name="hospital-address" id="hospital-address">`;
                newChildList.push(newChildOne, newChildTwo);
                return newChildList;
            case 'staff':
                newChildOne = `<label for="clinic">Trạm y tế</label>
                <input type="text" name="clinic" id="clinic">`;
                newChildTwo = `<div class="side name col">
                                <label for="province">Thành phố/ Tỉnh</label>
                                <input type="text" name="province" id="province">
                            </div>
                            <div class="side name col">
                                <label for="last-name" class="last-name town">Huyện</label>
                                <input type="text" name="town" id="town">
                            </div>`;
                newChildList.push(newChildOne, newChildTwo);
                addtionalFormControl();
                return newChildList;
            default:
                newChildOne = `<div class="side name col">
                                <label for="province">Thành phố/ Tỉnh</label>
                                <input type="text" name="province" id="province">
                            </div>
                            <div class="side name col">
                                <label for="last-name" class="last-name town">Huyện</label>
                                <input type="text" name="town" id="town">
                            </div>`;
                newChildTwo = `<div class="side name" style="margin-left: 0">
                                    <label for="sub-district">Phường/Xã</label>
                                    <input type="text" name="sub-district" id="sub-district">
                                </div>`;
                newChildList.push(newChildOne, newChildTwo);
                return newChildList;
        }

    }

    function changeControlContent(radio) {
        radio.addEventListener('click', (evt) => {
            const lastControl = getTag('.last-control');
            if (lastControl) createForm.removeChild(lastControl);
            const newChildList = getNewChild(radio);
            removeAllChild(controlChangeOneDiv);
            removeAllChild(controlChangeTwoDiv);
            addNewChild(controlChangeOneDiv, newChildList[0]);
            addNewChild(controlChangeTwoDiv, newChildList[1]);
        })
    }

    for (const radio of radioList) {
        if (radio instanceof HTMLInputElement) {
            changeControlContent(radio);
        }
    }
}

function initEvent() {
    radioEvent();

}

function main() {
    initEvent();
}

document.addEventListener('DOMContentLoaded', function () {
    main();
})
