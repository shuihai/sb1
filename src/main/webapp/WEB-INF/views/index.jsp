<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Spring Boot Sample</title>


    <script type="text/javascript" src="/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#b01").click(function(){

                $.ajax({
                    type: "GET",
                    url: "/ajaxtest/test?gogo=hehehe",
                    data: '{"data":"ggg"}',
                    contentType : 'application/json',
                    dataType:"json",
                    success: function(msg){
                        alert(msg)
                        alert( "Data Saved: " + msg['data'] );
                    }
                });
            });
        });
    </script>
</head>

<body>



<button id="b01" type="button">改变内容</button>


</body>
</html>