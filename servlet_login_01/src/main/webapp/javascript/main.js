/**
 * 
 */
 
$(function(){
    //img slide
    var bigSize = $('.Acontent li').width();
    $('.leftBTN').on('click',function(e){
      $('.Acontent') .delay(0).animate({marginLeft:'-='+(bigSize+40)+'px'},1000,function(){
            $('.Acontent li:first').appendTo('.Acontent')
            $('.Acontent').css('margin-left','0');
        });
    });


    $('.rightBTN').on('click',function(e){
      $('.Acontent') .delay(0).animate({marginLeft:'+='+(bigSize+40)+'px'},1000,function(){
            $('.Acontent li:last').prependTo('.Acontent')
            $('.Acontent').css('margin-left','0');
        });
    });

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