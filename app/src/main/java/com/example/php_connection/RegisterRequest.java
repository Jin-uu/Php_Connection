package com.example.php_connection;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


// URL에 POST방식으로 파라미터 전송, 회원가입정보 PHP로 전송 후 DB에 저장
public class RegisterRequest extends StringRequest {

    //서버 url 설정(php파일 연동)
    final static  private String URL="http://27.96.134.147/UserValidate.php";
    private Map<String,String>map;

    public RegisterRequest(int userNum, String userEmail, String userPassword, String userName,int userPhoto,String userStatus,Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);//위 url에 post방식으로 값을 전송

        map=new HashMap<>();
        map.put("userID",userNum+"");
        map.put("userPassword",userEmail);
        map.put("userName",userPassword);
        map.put("userAge",userName);
        map.put("userHak",userPhoto+"");
        map.put("userMajor",userStatus);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
