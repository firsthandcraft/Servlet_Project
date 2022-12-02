//JavaScript Document 

	const userEmail = document.querySelector('#userEmail');
	const useremailCheck = document.querySelector('#useremailCheck');
	const userPwd = document.querySelector('#userPwd');
	const userName = document.querySelector('#userName');
	const userYear = document.querySelector('#userYear');
	const userMonth = document.querySelector('#userMonth');
	const userDay = document.querySelector('#userDay');
	const alertEmail= document.querySelector('.alertEmail');
	const alertEmailCheck= document.querySelector('.alertEmailCheck');
	const alertPwd= document.querySelector('.alertPwd');
	const alertName= document.querySelector('.alertName');
	const alertYear= document.querySelector('.alertYear');
	const alertMonth= document.querySelector('.alertMonth');
	const alertDay= document.querySelector('.alertDay');
	
	//아이디 중복 체크
	
	
	//공백 체크
	//생년월일
	 userYear.onblur= function(){
	 	if(userYear.value==""){
			useremailCheck.classList.add('redLine');
			alertYear.innerHTML="생년월일을 입력해야합니다.";
	 		alertYear.classList.remove('hide');
		} else if(userYear.value !="") {
			useremailCheck.classList.remove('redLine');
			alertYear.classList.add('hide');
			var flag =isNaN(userYear.value);
			if(flag){
				useremailCheck.classList.add('redLine');
	 			alertYear.classList.remove('hide');
				userYear.value="";
				userYear.focus();
				return false;
			}
			if(userYear.value.length != 6){
				useremailCheck.classList.add('redLine');
				alertYear.innerHTML="생년월일 6자리를 입력하세요.";
	 			alertYear.classList.remove('hide');
			}
		}	
	 }
		
//비번
	 userPwd.onblur= function(){
	 	if(userPwd.value==""){
			userPwd.classList.add('redLine');
			alertPwd.innerHTML="비밀번호를 입력해야 합니다.";
	 		alertPwd.classList.remove('hide');
		} else if(userPwd.value !="") {
			userPwd.classList.remove('redLine');
			alertPwd.classList.add('hide');
			if(userPwd.value.length < 6){	//비밀번호 짧을때
				userPwd.classList.add('redLine');
				alertPwd.innerHTML="비밀번호가 너무 짧습니다.";
	 			alertPwd.classList.remove('hide');
			}
		}	
	 }
		
	//버튼에 공백 체크
	function emptyCheck(r){
		
		if(userPwd.value==""){
			userPwd.classList.add('redLine');
			alertPwd.classList.remove('hide');
			return false;
		}
		if(userName.value==""){
			userName.classList.add('redLine');
			alertName.classList.remove('hide');
			return false;
		}
		r.submit();
	}
	
    
	// 비밀번호 보이기
	let SH = document.querySelector('.material-symbols-outlined');
	const clickedClass = "clicked";
	function pwdShowHide(){
		if(SH.classList.contains(clickedClass)){
			SH.innerHTML="visibility";
			userPwd.type='text';
        	SH.classList.remove(clickedClass);
		}else{
			SH.innerText="visibility_off";
			userPwd.type='password';
        	SH.classList.add(clickedClass);	
		}
	}
	SH.addEventListener('click', pwdShowHide);

	