//JavaScript Document 
const close = document.querySelector('.close');
const search = document.querySelector('.Sinput');

const searchForm=document.querySelector('#searchForm');
const searchLength=search.value.length;
	 if(search.value!=""|| search.value!=null){
		close.classList.remove('hide');
		search.focus();
		search.setSelectionRange(searchLength,searchLength);
	} else{
		close.classList.add('hide');
	}
console.log(searchForm);
function showBtn(){
	 if(search.value!=""|| search.value!=null){
		close.classList.remove('hide');
		searchForm.submit();
	} else{
		close.classList.add('hide');
	}
}
 


