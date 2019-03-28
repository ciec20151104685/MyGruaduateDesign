<%--
  Created by IntelliJ IDEA.
  User: yd
  Date: 2019/3/26
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=8">
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <script>
        var wechatUA = "MicroMessenger";
        if (navigator.userAgent.indexOf(wechatUA) >= 0) {
            window.location.href = "http://eip.imnu.edu.cn:80/EIP//login-focus.html";
        }
    </script>
    <title></title>
    <link href="http://eip.imnu.edu.cn:80/EIP/style/css/allPageStyles.css" rel="stylesheet"
          type="text/css" />
    <link href="http://eip.imnu.edu.cn:80/EIP/style/css/login-page.css" rel="stylesheet"
          type="text/css" />
    <script type="text/javascript" src="http://eip.imnu.edu.cn:80/EIP/core/boot.js"></script>
    <script type="text/javascript">
        var _IS_VALID_CAPTCHA = false;
        if (window != top) {
            top.location = window.location;
        }

        $(function() {
            var theUA = window.navigator.userAgent.toLowerCase();
            if ((theUA.match(/msie\s\d+/) && theUA.match(/msie\s\d+/)[0]) || (theUA.match(/trident\s?\d+/) && theUA.match(/trident\s?\d+/)[0])) {
                var ieVersion = theUA.match(/msie\s\d+/)[0].match(/\d+/)[0] || theUA.match(/trident\s?\d+/)[0];
                if (ieVersion < 8) {
                    $("#noshow").css("display","block");
                    $(".login-box").css("display","none");
                };
            }else{
                mini.parse();
                var userName = getCNAME();
                $('#username').val(userName);
                isValidCaptcha();
            }
        });

        //判断是否需要显示验证码
        function isValidCaptcha(){
            var url = 'http://eip.imnu.edu.cn:80/EIP/syt/login/captcha/isvalid.htm';
            $.post(url, function(valid){
                if (valid) {
                    _IS_VALID_CAPTCHA = true;
                    $('.img-boxes').show();
                    changeimg();
                } else {
                    $('.img-boxes').hide();
                }
            });
        }

        //回车事件
        $(document).keydown(function(event) {
            if (event.keyCode == 13) {
                login();
            }
        });

        //重置方法
        function resetForm() {
            if (loginPending) {
                return;
            }
            var loginForm = document.getElementById("loginForm");
            loginForm.reset();
        }

        //更换验证码
        function changeimg() {
            var myimg = document.getElementById("code");
            now = new Date();
            myimg.src = "http://eip.imnu.edu.cn:80/EIP/syt/login/captcha.htm?code="+now.getTime();
        }
        var loginPending = false;
        function login() {
            if (loginPending) {
                return;
            }

            var username = $("#username").val();
            var password = $("#password").val();
            var verification = $("#verification").val();
            if (!username) {
                alert("请输入用户名");
                $("#username").focus();
                return;
            }
            if (!password) {
                alert("请输入密码");
                $("#password").focus();
                return;
            }
            if (_IS_VALID_CAPTCHA &&!verification) {
                alert("请输入验证码");
                $("#verification").focus();
                return;
            }
            $("#loading").show();
            loginPending = true;
            $
                .ajax({
                    url : "http://eip.imnu.edu.cn:80/EIP/syt/login/Login.htm",//"http://eip.imnu.edu.cn:80/EIP/login/Login.htm",
                    data : {
                        username : username,
                        password : password,
                        verification : verification
                    },
                    cache : false,
                    type : "post",
                    dataType : 'html',
                    success : function(text) {
                        loginPending = false;
                        if (text != "") {
                            if(text=="err_wgz"){
                                mini.alert("您未绑定学校微信平台，请点击“确定”按钮，按引导完成微信平台绑定。","学校微信平台",function(action){
                                    if (action == "ok"){
                                        window.location.href = 'http://eip.imnu.edu.cn:80/EIP//wxbd.jsp';
                                    }
                                });
                            }else{
                                alert(text);
                                var url = 'http://eip.imnu.edu.cn:80/EIP/syt/login/captcha/isvalid.htm';
                                $.post(url, function(valid){
                                    console.log(valid);
                                    if (valid) {
                                        _IS_VALID_CAPTCHA = true;
                                        $('.img-boxes').show();
                                        changeimg();
                                    } else {
                                        $('.img-boxes').hide();
                                    }
                                });
                            }
                            $("#loading").hide();
                        } else {
                            $
                                .post(
                                    'http://eip.imnu.edu.cn:80/EIP/syt/login/isAuthUkey.htm',
                                    function(isAuth) {
                                        if (isAuth) {
                                            mini
                                                .prompt(
                                                    "请输入令牌口令：",
                                                    "请输入",
                                                    function(
                                                        action,
                                                        value) {
                                                        if (action == 'ok') {
                                                            $
                                                                .post(
                                                                    'http://eip.imnu.edu.cn:80/EIP/syt/login/ukeyLogin.htm',
                                                                    {
                                                                        opt : value
                                                                    },
                                                                    function(
                                                                        message) {
                                                                        if (message != "") {
                                                                            alert('动态令牌口令错误。');
                                                                            changeimg();
                                                                        } else {
                                                                            setCookie(
                                                                                "username",
                                                                                username);
                                                                            window.location = "http://eip.imnu.edu.cn:80/EIP/user/index.htm";
                                                                        }
                                                                    });
                                                            $(
                                                                "#loading")
                                                                .hide();
                                                        } else {
                                                            changeimg();
                                                        }
                                                    });
                                            $("#loading").hide();
                                        } else {
                                            setCookie("username",
                                                username);
                                            window.location = "http://eip.imnu.edu.cn:80/EIP/user/index.htm";
                                        }
                                    });
                        }
                    },
                    error : function(jqXHR, textStatus, errorThrown) {
                        $("#loading").hide();
                        loginPending = false;
                        alert(jqXHR.responseText);
                    }
                });
        }

        //写cookies
        function setCookie(name, value, path) {
            var Days = 30;
            var exp = new Date();
            exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
            var cookie = name + "=" + escape(value) + ";expires="
                + exp.toGMTString();
            if (path) {
                cookie += ";path=" + path;
            }
            document.cookie = cookie;
        }

        //计算网页正文高度
        var winHt;
        var halfHt;
        var clientHt;
        function winHeight() {
            winHt = $(window).height();
            clientHt = $(document.body).height();
            halfHt = (winHt - clientHt) / 4;
        }

        function webShow() {
            winHeight();
            $("body").css("padding-top", halfHt);
        }

        $(window).resize(function() {
            winHeight();
            webShow();
        });

        var waitInterval = 0;
        function longConnect() {
            $.ajax({
                url : "http://eip.imnu.edu.cn:80/EIP/syt/login/connect.htm",
                cache : false,
                type : "get",
                dataType : "text",
                success : function(status) {
                    if ("scan" == status) {
                        $(".login-ewm-ts").css("display", "none");
                        $(".login-ewm-ok").css("display", "block");
                        $(".login-ewm-no").css("display", "none");
                    } else if ("cancel" == status) {
                        $(".login-ewm-ts").css("display", "none");
                        $(".login-ewm-ok").css("display", "none");
                        $(".login-ewm-no").css("display", "block");
                    } else if ("login" == status) {
                        window.location = "http://eip.imnu.edu.cn:80/EIP/user/index.htm";
                    }

                    if ("" == status || "fail" == status) {
                        setTimeout(longConnect, waitInterval);
                        waitInterval += 1000;
                    } else {
                        longConnect();
                    }
                },
                error : function(jqXHR, textStatus, errorThrown) {
                    setTimeout(longConnect, waitInterval);
                    waitInterval += 1000;
                }
            });
        }
    </script>
</head>
<body onload="changeimg();webShow();">
<div id="noshow" style="display:none;text-align:center; margin-top:120px;">
    <h2><img src="http://eip.imnu.edu.cn:80/EIP//style/sanyth/img/llqbk.png" width="100" height="105" /></h2>
    <h3 style=" color:#323232;">您的浏览器版本太低了</h3>
    <h3 style=" color:#323232;">推荐使用:<a href='https://www.baidu.com/s?ie=UTF-8&wd=IE' target='_blank' style='color:#323232'>IE8+（非兼容模式）</a>,<a href='https://www.baidu.com/s?ie=UTF-8&wd=%E8%B0%B7%E6%AD%8C%E6%B5%8F%E8%A7%88%E5%99%A8' target='_blank' style='color:#323232'>谷歌</a>,<a href='https://www.baidu.com/s?ie=UTF-8&wd=%E7%81%AB%E7%8B%90%E6%B5%8F%E8%A7%88%E5%99%A8' target='_blank' style='color:#323232'>火狐</a></h2>
        <h3 style=" color:#323232;">如果您使用的是360浏览器,请切换到极速模式访问</h3>
</div>
<div class="login-box">
    <!-- header -->
    <div class="login-header">
        <div class="login-header-box">
            <span class="login-logo"><img src="http://eip.imnu.edu.cn:80/EIP/style/sanyth/img/syt-logo-login.png" alt="" /></span> <span class="login-logo-text">数字校园平台</span>
        </div>
    </div>
    <!-- content -->
    <div class="login-content" style="background: url(http://eip.imnu.edu.cn:80/EIP/style/sanyth/img/syt-login.png) no-repeat;">
        <div class="login-content-box" >
            <!-- 左图 -->
            <div class="login-content-box-img">
                <img src="http://eip.imnu.edu.cn:80/EIP/style/images/login-pic.png">
            </div>
            <!-- 右登录 -->
            <div class="login-content-box-boxes">
                <!--切换登录 -->
                <ul class="login-Switch">
                    <li id="loginZ" class="login-Switch-focus">账号登录</li>
                    <li id="loginE">二维码登录</li>
                </ul>
                <!--账号登录 -->
                <div class="login-form">
                    <form id="loginForm">
                        <ul class="login-infor">
                            <li><label>用户名：</label> <input id="username"
                                                           name="username" /></li>
                            <li><label>密<span class="nbsp"></span>码：
                            </label> <input type="password" id="password" name="password" /></li>
                            <li class="img-boxes"style="display: none;"><label>验证码：</label> <input
                                    id="verification" name="verification" class="yzm-Type" /> <span
                                    class="validate-type"> <img border=0 id="code"
                                                                style="cursor: pointer; font-size: 0px; padding: 10px 0px 9px;"
                                                                onclick="javascript:changeimg()" src="http://eip.imnu.edu.cn:80/EIP/nonlogin/login/captcha.htm"
                                                                title="点击更换验证码" />
								</span></li>
                        </ul>
                        <div class="submit-box">
                            <a href="javascript: void(0);" class="loginbt" onclick="login()">
                            </a> <a href="javascript: void(0);" class="reset"
                                    onclick="resetForm()"></a>
                            <img id="loading"
                                 src="http://eip.imnu.edu.cn:80/EIP/style/images/loading.gif"
                                 style="margin: 8px 0px 0px 4px; float: left; display: none;" />
                        </div>
                    </form>
                </div>
                <!-- 二维码登陆 -->
                <div class="login-ewm">
                    <img class="login-ewm-img"
                         src="http://eip.imnu.edu.cn:80/EIP/nonlogin/qrlogin/code.htm" /> <span
                        class="login-ewm-ts">请使用微信企业号中的“扫二维码”<br />进入数字校园
						</span>
                    <!-- 扫描成功 -->
                    <div class="login-ewm-ok">
                        <img src="http://eip.imnu.edu.cn:80/EIP/style/loginpage/login-check_alt.png" /> <span>扫描成功。请在微信中点击确认登录</span>
                    </div>
                    <!-- 取消登录 -->
                    <div class="login-ewm-no">
                        <img src="http://eip.imnu.edu.cn:80/EIP/style/loginpage/login-check_c.png" /> <span>您已取消此次登录。您可再次扫描登录，或关闭窗口</span>
                    </div>
                </div>
                <div id="loading" class="login-load-bg" style="display: none;">
                    <div class="login-load-box">
                        <span class="login-text">登录中，请稍候......</span> <img
                            class="login-load"
                            src="http://eip.imnu.edu.cn:80/EIP/style/images/login-loading.gif" />
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="zxBtn">
        <img id="getImg1" style="position:fixed;right:0;top:200px;" src="http://eip.imnu.edu.cn:80/EIP/style/images/opendiv.png" alt="#">
        <img id="getImg2" style="position:fixed;right:42px;top:200px;width:140px;height:140px;border:1px solid #ccc; display:none;" src="http://eip.imnu.edu.cn:80/EIP/style/images/zx.jpg" alt="#">
    </div>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#getImg1").mouseenter(function(){
                $("#getImg2").css("display","block");
            });
            $("#getImg1").mouseleave(function(){
                $("#getImg2").css("display","none");
            });
        });


    </script>
    <!-- footer  -->
    <div class="login-footer" style="position: relative;top:0;left: 0;">
        <span style="display: block; color: #888; font-size: 12px; line-height: 30px;"><p>版权所有 ? 2015-2016 内蒙古师范大学 蒙ICP备05006581号 地址：内蒙古呼和浩特市赛罕区昭乌达路81号</p></span>
        <div style="width:325px;margin:0 auto;">
            <div class="login-footer-box" id="loginPic" style="float:left;">
                <span class="login-footer-text">关注企业号</span>
                <div class="login-focus-box">
                    <img class="login-focus-box-img"src="http://eip.imnu.edu.cn:80/EIP/style/images/quickcode.png" />
                    <img id="login-focus-img-max" class="login-focus-img-max" src="http://eip.imnu.edu.cn:80/EIP/style/images/weixinEnterprise.jpg" />
                </div>
            </div>


        </div>

    </div>
</div>
<script>
    webShow();
    //var timeID;
    $(document).ready(function() {
        $(".login-Switch li").click(function() {
            $(".login-Switch li").removeClass();
            $(this).addClass("login-Switch-focus");
        });
        $("#loginZ").click(function() {
            $(".login-ewm").css("display", "none");
            $(".login-form").css("display", "block");
            //window.clearInterval(timeID);
        });
        $("#loginE").click(function() {
            $(".login-form").css("display", "none");
            $(".login-ewm").css("display", "block");
            //longConnect(); // 创建二维码登录的长连接
            //timeID=window.setInterval("longConnect()", 1000);
        });

        longConnect(); // 创建二维码登录的长连接


    });

    var qrcodeDisplay = false;
    $("#loginPic").hover(function() {
        $("#login-focus-img-max").show();
        qrcodeDisplay = true;
    }, function() {
        $("#login-focus-img-max").hide();
        qrcodeDisplay = false;
    });
    $("#loginPic").click(function() {
        if (qrcodeDisplay) {
            $("#login-focus-img-max").hide();

            qrcodeDisplay = false;
        } else {
            $("#login-focus-img-max").show();
            qrcodeDisplay = true;
        }
    });
</script>
</body>
</html>

