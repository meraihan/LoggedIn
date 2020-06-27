<link rel="stylesheet" type="text/css" href="/css/style.css">
<html>
<head>
<title>uServe Login</title>
</head>
<body>
<h2 id="uServe">uServe</h2>

<h3 id="log-header">Please Log in with your windows User Id and Password</h3>
<div class="form-login">
    <form id='login-form' action="/login" method='post'>
        <input type="text" name="username" id="inp" placeholder="Username" required><br>
        <input type="password" name="password" id="inp1" placeholder="Password" required><br>
        <button type='submit'>Login</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input id="rst" type="reset" value="Reset">
    </form>

</div>

<p id="atn">Please remember that, three failed log in attempts will revoke your windows Log in too.</p>
<p id="atn1">Note: 30 minutes of inactivity will require you to log in again.</p>

</body>

</html>