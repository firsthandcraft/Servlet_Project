<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Index</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">

<style type="text/css">
.bblock{width:30px;height:30px;background-color:#ddd;}
</style>
</head>
<body>
	<h3>상품등록</h3>
	 <p>상품등록 이미지 토글로 만들기 </p>
     <p><a href="#">가이드</a></p>

     <form action="">

        <table border="1">
            <thead><tr>표시설정</tr></thead>
            <tbody>
                <tr>
                    <th>진열상태<span>?</span></th>
                    <td>
                        <label>진열<input type="radio" name="exposure" ></label>
                        <label>미진열<input type="radio" name="exposure" checked></label>
                    </td>
                </tr>
                <tr>
                    <th>판매상태<span>?</span></th>
                    <td>
                        <label>판매<input type="radio" name="is_display" ></label>
                        <label>미판매<input type="radio" name="is_display" checked></label>
                    </td>
                </tr>
                <tr>
                    <th>상품분류 선택<span>?</span></th>
                    <td>
                        <div>상품분류를 선택 후 상품분류 적용 버튼을 눌러주세요.</div>
                        <table border="1">
                            <caption>상품분류</caption>
                            <colgroup>
                                    <col>
                                    <col span="2">
                                    <col style="width:150px;">
                            </colgroup>
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="list">
                                            <ul>
                                                <li>
                                                    --
                                                    <span class="right"></span>
                                                </li>
                                                <li></li>
                                                <li></li>
                                                <li></li>
                                                <li></li>
                                            </ul>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="list">
                                            <ul>
                                                <li>
                                                    --
                                                    <span class="right"></span>
                                                </li>
                                                <li></li>
                                                <li></li>
                                                <li></li>
                                                <li></li>
                                            </ul>
                                        </div>    
                                    </td>
                                    <td> </td>
                                </tr>
                            </tbody>
                            
                        </table>
                    </td>
                </tr>
                <tr>
                    <th>표시제한</th>
                    <td>
                        <label><input type="radio" name="gLabel" >모두에게 표시</label>
                        <label><input type="radio" name="gLabel" checked>회원에게만 표시</label>
                    </td>
                </tr>
            </tbody>
        </table>

        <table>
            <tbody>
                <tr>
                    <th>상품명</th>
                    <td><input type="text" placeholder="예시) 원피스"></td>
                </tr>
                <tr>
                    <th>상품상태</th>
                    <td>
                        <select name="" id="">
                            <option value="">신상품</option>
                            <option value="">중고상품</option>
                            <option value="">반품상품</option>
                            <option value="">재고상품</option>
                            <option value="">전시상품</option>
                            <option value="">리퍼상품</option>
                            <option value="">스크래치상품</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>설명</th>
                    <td><textarea name="" id="" cols="30" rows="10"></textarea></td>
                </tr>
                <tr>
                    <th>가격</th>
                    <td><input type="text"></td>
                </tr>
                <tr>
                    <th>이미지 정보</th>
                    <td>
                        <div>
                            <label for="img1">대표이미지 등록<input type="radio" checked name="img" id="img1"></label>
                            <label for="img2">개별이미지 등록<input type="radio" name="img" id="img2"></label>
                        </div>
                        <div>
                            <ul class="img1">
                                <li class="bblock"><a href="#"></a></li>
                                <li class="bblock"><a href="#"></a></li>
                                <li class="bblock"><a href="#"></a></li>
                                <li class="bblock"><a href="#"></a></li>
                            </ul>
                            <ul class="img2">
                                <li class="bblock"><a href="#"></a></li>
                                <li class="bblock"><a href="#"></a></li>
                                <li class="bblock"><a href="#"></a></li>
                                <li class="bblock"><a href="#"></a></li>
                            </ul>
                            <button>등록</button>
                        </div>
                    </td>

                </tr>
            </tbody>
        </table>
        <input type="button" value="상품등록">
        <input type="reset" value="초기화">
     </form>
</body>
<script  src="${pageContext.request.contextPath}/javascript/productregister.js" charset="utf-8"></script>
</html>