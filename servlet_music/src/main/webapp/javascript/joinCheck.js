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
			

	//공백 체크
	userEmail.onblur= function(){
	 	if(userEmail.value==""){
			userEmail.classList.add('redLine');
			alertEmail.innerHTML="이메일을 입력해야합니다.";
	 		alertEmail.classList.remove('hide');
		} 	 else if(userEmail.value !="") {
			userEmail.classList.remove('redLine');
			alertEmail.classList.add('hide');
			if(userEmail.value.includes('@')){
				$(function(){
						var email =$("#userEmail").val();
						var data="email="+email;
						//alert(data);
						$.ajax({
						type:"POST",
						url:"/servlet_music/EmailDoubleCheckController",
						data:data,
						success:function(data){
							let a=$.parseJSON(data);
							if(a.flag!="false"){
								$(".alertEmail").text("이미 있는 계정입니다.");
								$(".alertEmail").removeClass('hide');
							}						
						},
						error:function(){
							console.log("이메일 중복체크 error");
						}
						});
					
					});
				
				//
			} else{
				userEmail.classList.add('redLine');
		 		alertEmail.classList.remove('hide');
		 		alertEmail.innerHTML=" 잘못된 이메일 주소입니다. example@email.com 형식으로 입력되었는지 확인하세요.";
				//
			}
		
		}
			
	 }
	//이메일 일치 여부
	useremailCheck.onblur= function(){
	 	if(useremailCheck.value==""){
			useremailCheck.classList.add('redLine');
	 		alertEmailCheck.classList.remove('hide');
		} 	 else if(useremailCheck.value !="") {
			useremailCheck.classList.remove('redLine');
			alertEmailCheck.classList.add('hide');
			//이메일 일치체크
			if(userEmail.value != useremailCheck.value){
			useremailCheck.classList.add('redLine');
	 		alertEmailCheck.classList.remove('hide');
			} 
		}	
	 }
	
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
		if(r.email.value==""){
			userEmail.classList.add('redLine');
			alertEmail.classList.remove('hide');
			return false;
		} 
		if(userPwd.value==""){
			userPwd.classList.add('redLine');
			alertPwd.classList.remove('hide');
			return false;
		}
		if(userName.value==""){
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
		 if(userEmail.value != useremailCheck.value){
			useremailCheck.classList.add('redLine');
	 		alertEmailCheck.classList.remove('hide');
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

	