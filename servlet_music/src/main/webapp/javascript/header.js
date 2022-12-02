/**
 * 
 */
$(function(){
	//header 계정
    $('.profile h4').on('click',function(e){
        if($('.arrow_drop').hasClass('rotate')){
            $('.arrow_drop').removeClass('rotate');
            $('.arrow_drop').addClass('rotateReverse');
            $('.profileList').addClass('hide');
        }else{
            $('.arrow_drop').removeClass('rotateReverse');
            $('.arrow_drop').addClass('rotate');
            $('.profileList').removeClass('hide');
        }
        
    });
});