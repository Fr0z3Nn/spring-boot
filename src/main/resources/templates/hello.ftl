<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>BLOG</title>
</head>
<style>
    .form-group,table{
        margin:0 25% 0 25%;
        width:50%;
    }

</style>
<body>
<h1 align="center">ТУПА БЛОГ</h1>

<form action="/hello" method="post">
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Почта</label>
        <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        <div id="emailHelp" class="form-text">Твоя почта сразу попадет в список</div>
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Пароль</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword1">
    </div>
    <button type="submit" class="btn btn-primary" >Submit</button>
</form>

<form>
    <div class="form-group">
        <label id="lbForInputMessageField" for="InputMessageField">Поле для всякого бреда</label>
        <textarea class="form-control" id="InputMessageField" rows="3"></textarea>
        <button type="button" class="btn btn-primary btn-lg btn-block">Отправить свою дичь</button>
    </div>
</form>


<table class="table">
    <thead>
    <tr>
        <th scope="col">Последние зарегистрированные пользователи</th>
    </tr>
    </thead>
    <tbody>
    <#list usersList as x>
    <tr>
        <td>${x}</td>
    </tr>
    </#list>
    </tbody>
</table>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>