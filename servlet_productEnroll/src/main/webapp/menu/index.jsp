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
	<h3>��ǰ���</h3>
	 <p>��ǰ��� �̹��� ��۷� ����� </p>
     <p><a href="#">���̵�</a></p>

     <form action="">

        <table border="1">
            <thead><tr>ǥ�ü���</tr></thead>
            <tbody>
                <tr>
                    <th>��������<span>?</span></th>
                    <td>
                        <label>����<input type="radio" name="exposure" ></label>
                        <label>������<input type="radio" name="exposure" checked></label>
                    </td>
                </tr>
                <tr>
                    <th>�ǸŻ���<span>?</span></th>
                    <td>
                        <label>�Ǹ�<input type="radio" name="is_display" ></label>
                        <label>���Ǹ�<input type="radio" name="is_display" checked></label>
                    </td>
                </tr>
                <tr>
                    <th>��ǰ�з� ����<span>?</span></th>
                    <td>
                        <div>��ǰ�з��� ���� �� ��ǰ�з� ���� ��ư�� �����ּ���.</div>
                        <table border="1">
                            <caption>��ǰ�з�</caption>
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
                    <th>ǥ������</th>
                    <td>
                        <label><input type="radio" name="gLabel" >��ο��� ǥ��</label>
                        <label><input type="radio" name="gLabel" checked>ȸ�����Ը� ǥ��</label>
                    </td>
                </tr>
            </tbody>
        </table>

        <table>
            <tbody>
                <tr>
                    <th>��ǰ��</th>
                    <td><input type="text" placeholder="����) ���ǽ�"></td>
                </tr>
                <tr>
                    <th>��ǰ����</th>
                    <td>
                        <select name="" id="">
                            <option value="">�Ż�ǰ</option>
                            <option value="">�߰��ǰ</option>
                            <option value="">��ǰ��ǰ</option>
                            <option value="">����ǰ</option>
                            <option value="">���û�ǰ</option>
                            <option value="">���ۻ�ǰ</option>
                            <option value="">��ũ��ġ��ǰ</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>����</th>
                    <td><textarea name="" id="" cols="30" rows="10"></textarea></td>
                </tr>
                <tr>
                    <th>����</th>
                    <td><input type="text"></td>
                </tr>
                <tr>
                    <th>�̹��� ����</th>
                    <td>
                        <div>
                            <label for="img1">��ǥ�̹��� ���<input type="radio" checked name="img" id="img1"></label>
                            <label for="img2">�����̹��� ���<input type="radio" name="img" id="img2"></label>
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
                            <button>���</button>
                        </div>
                    </td>

                </tr>
            </tbody>
        </table>
        <input type="button" value="��ǰ���">
        <input type="reset" value="�ʱ�ȭ">
     </form>
</body>
<script  src="${pageContext.request.contextPath}/javascript/productregister.js" charset="utf-8"></script>
</html>