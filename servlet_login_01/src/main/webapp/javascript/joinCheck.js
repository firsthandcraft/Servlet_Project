//JavaScript Document 
	//공백 체크
	
	//버튼에 공백 체크
	function emptyCheck(r){
		const userEmail = document.querySelector('#userEmail');
	const useremailCheck = document.querySelector('#useremailCheck');
	const userPwd = document.querySelector('#userPwd');
	const userName = document.querySelector('#userName');
	const userYear = document.querySelector('#userYear');
	const userMonth = document.querySelector('#userMonth');
	const userDay = document.querySelector('#userDay');
	const alertEmail= document.querySelector('.alertEmail');
	const alertPwd= document.querySelector('.alertPwd');
	const alertName= document.querySelector('.alertName');
	const alertYear= document.querySelector('.alertYear');
	const alertMonth= document.querySelector('.alertMonth');
	const alertDay= document.querySelector('.alertDay');
		if(r.email.value==""){
			userEmail.classList.add('redLine');
			alertEmail.classList.remove('hide');
			return false;
		} else if(userPwd.value==""){
			userPwd.classList.add('redLine');
			alertPwd.classList.remove('hide');
			return false;
		}else if(userName.value==""){
			userName.classList.add('redLine');
			alertName.classList.remove('hide');
			return false;
		}/*else if(userYear.value==""){
			userYear.classList.add('redLine');
			alertYear.classList.remove('hide');
			return false;
		}else if(userMonth.value==""){
			userMonth.classList.add('redLine');
			alertMonth.classList.remove('hide');
			return false;
		}else if(userDay.value==""){
			userDay.classList.add('redLine');
			alertDay.classList.remove('hide');
			return false;
		}*/
		r.submit();
	}