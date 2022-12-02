/**
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
});