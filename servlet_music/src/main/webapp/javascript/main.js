/**
 */
 
$(function(){
	//ul size
	var AcontentSize = $('.Acontent li').width();
	var AcontentLength = $('.Acontent li').length;
	$('.Acontent ul').css('width',AcontentSize*AcontentLength);
	var McontentSize = $('.Mcontent li').width();
	var McontentLength = $('.Mcontent li').length;
	$('.Mcontent ul').css('width',McontentSize*McontentLength);
	console.log(AcontentSize);
	console.log(AcontentLength);
    //img slide
    var aSize = $('.Acontent li').width();
    $('.artistList .leftBTN').on('click',function(e){
      $('.Acontent') .delay(0).animate({marginLeft:'-='+(aSize+40)+'px'},1000,function(){
            $('.Acontent li:first').appendTo('.Acontent')
            $('.Acontent').css('margin-left','0');
        });
    });


    $('.artistList .rightBTN').on('click',function(e){
      $('.Acontent') .delay(0).animate({marginLeft:'+='+(aSize+40)+'px'},1000,function(){
            $('.Acontent li:last').prependTo('.Acontent')
            $('.Acontent').css('margin-left','0');
        });
    });
    
    var mSize = $('.Mcontent li').width();
    $('.musicList .leftBTN').on('click',function(e){
      $('.Mcontent') .delay(0).animate({marginLeft:'-='+(mSize+40)+'px'},1000,function(){
            $('.Mcontent li:first').appendTo('.Mcontent')
            $('.Mcontent').css('margin-left','0');
        });
    });

    $('.musicList .rightBTN').on('click',function(e){
      $('.Mcontent') .delay(0).animate({marginLeft:'+='+(mSize+40)+'px'},1000,function(){
            $('.Mcontent li:last').prependTo('.Mcontent')
            $('.Mcontent').css('margin-left','0');
        });
    });


//
});