<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css">
   <script src="http://code.jquery.com/jquery-1.10.2.js"></script> 
   <script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
   <!-- 스프링 시큐리티 ajax csrf설정 403에러  -->
   <meta name="_csrf" content="${_csrf.token}"/>
   <!-- default header name is X-CSRF-TOKEN -->
   <meta name="_csrf_header" content="${_csrf.headerName}"/>
   <!-- 스프링 시큐리티 ajax csrf설정 403에러  -->
<title>Insert title here</title>
</head>
<body>
	<label>하이요 마이페이지 데스.</label>
	<ul>
		<li>이름 => ${userinfo.username }</li>
		<li>닉네임 => ${userinfo.displayname }</li>
		<li>카카오아이디 => ${userinfo.kakaoid }</li>
	</ul>
	<div class="row form-group">
      <div class="col-sm-1">
         <label for="file">사진</label>
      </div>
      <div class="col-sm-11">
         <input type='file' name="file" id="file" >
         <p class="help-block">보여주고싶은 사진을 올려주세요</p>
         <input type="hidden" name="photo">
      </div>
   </div>
   <div id="imageBox"> 
       <img class=".img-circle" src="/resource/imageIcon/defaultprofile.png" /> 
   </div>
</body>
<script type="text/javascript">
$(document).ready(function(){
    $(function () {
       var token = $("meta[name='_csrf']").attr("content");
       var header = $("meta[name='_csrf_header']").attr("content");
       $(document).ajaxSend(function(e, xhr, options) {
          xhr.setRequestHeader(header, token);
       });
    });
  var check = false;
  var preUrl = "";
  
  /* 이미지 처리 부분  */
  $("#file").change(function(){
     console.log("sss");
     var formData = new FormData();
      formData.append("file", $("input[name=file]")[0].files[0]);//파일의 정보를 formData에 삽입 

     
      $.ajax({ //image 파일 폴더에 생성
          type : "post",
          url : "/imageUpload",
          dataType : "text",
          data : formData,
          processData : false,
          contentType : false,
          success : function(imgPath) {
             if (imgPath) {
                if(check){
                   imageDelete(preUrl,imgPath);
                    $("input[name=photo]").val(imgPath);
                     preUrl = imgPath;
                }else{
                   check = true;
                    preUrl = imgPath;
                   var str = "<img src='/displayFile?fileName="+imgPath+"'class='img-thumbnail'/>";
                   $("input[name=photo]").val(imgPath);
                   $("#imageBox").append(str);
                }
             } else {
                alert("Image File please");
             }
          }
       });
 });
  
  function imageDelete(preUrl,imgPath) { //이미지 삭제 
      console.log("imgPath"+imgPath);
      console.log("preUrl"+preUrl);
         $.ajax({
            url : "/deleteFile",
            type : "post",
            data : {
               fileName : preUrl
            },
            dataType : "text",
            success : function(result) {
               $("#imageBox").empty(); //imageBox 안에 태그 비우기 
                var str = "<img src='/displayFile?fileName="+imgPath+"' class='img-thumbnail' />";
                $("#imageBox").append(str);
            }
         });
      };
      
         
/* 이미지 처리 부분  */
});
</script>
</html>