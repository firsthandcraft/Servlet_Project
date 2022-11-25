//JavaScript Document 
function nullCheck(r){
	let alertEmail=document.querySelector('.LoginAlertEmail');
	let alertPwd=document.querySelector('.LoginAlertPwd');
		if(r.email.value==''){
			r.email.classList.add('redLine');
			alertEmail.innerHTML="이메일을 입력해야합니다.";
			alertEmail.classList.remove('hide');
	 		return false;
		} else if(r.email.value !="") {
			if(!r.email.value.includes('@')){
				r.email.classList.add('redLine');
		 		alertEmail.classList.remove('hide');
		 		alertEmail.innerHTML=" 잘못된 이메일 주소입니다. example@email.com 형식으로 입력되었는지 확인하세요.";
			return false;
			}
		}else{
			r.email.classList.remove('redLine');
			alertEmail.classList.add('hide');
			
		}
		
		if(r.pwd.value==''){
			r.pwd.classList.add('redLine');
			alertPwd.innerHTML="비밀번호를 입력해야합니다.";
			alertPwd.classList.remove('hide');
	 		return false;
		}else{
			r.pwd.classList.remove('redLine');
			alertPwd.classList.add('hide');
		}
	r.submit();
	}