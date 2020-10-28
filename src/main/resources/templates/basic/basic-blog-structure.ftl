<#macro basicpage>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>FIRE-BLOG</title>
        <link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Bungee">
        <link rel="stylesheet" href="/assets/css/Kalmansk-Regular.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Ubuntu+Mono">
        <link rel="stylesheet" href="/assets/css/Animated-Typing-With-Blinking.css">
        <link rel="stylesheet" href="/assets/css/CoolFont---Text-Container.css">
        <link rel="stylesheet" href="/assets/css/dh-row-titile-text-image-right-1.css">
        <link rel="stylesheet" href="/assets/css/Features-Boxed-Remixed-1.css">
        <link rel="stylesheet" href="/assets/css/Features-Boxed-Remixed-2.css">
        <link rel="stylesheet" href="/assets/css/Features-Boxed-Remixed-3.css">
        <link rel="stylesheet" href="/assets/css/Features-Boxed-Remixed.css">
        <link rel="stylesheet" href="/assets/css/Footer-Basic.css">
        <link rel="stylesheet" href="/assets/css/some-message.css">
        <link rel="stylesheet" href="/assets/css/styles.css">
    </head>

    <body>
    <div id="navigation-block">
        <nav class="navbar navbar-light navbar-expand-md">
            <div class="container-fluid">
                <form action="/blog" method="get">
                    <button class="navbar-brand" style="border: none;width: 160px;height: 40px;margin-left: 14px;font-size: 20px;opacity: 1;filter: brightness(98%) grayscale(64%);border-radius: 5px;text-align: center;font-family: Bungee, cursive;background: #ffffff;color: rgb(0,0,0);">
                        FIRE BLOG
                    </button>
                </form>
                <button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span
                            class="navbar-toggler-icon"></span></button>
                <div
                        class="collapse navbar-collapse" id="navcol-1">
                    <form action="/article" method="get">
                        <button class="btn btn-danger" type="submit"
                                style="border: none;width: 50px;height: 30px;margin-left: 14px;background-color: #4bc4e0;font-size: 14px;opacity: 1;filter: brightness(98%) grayscale(64%);border-radius: 5px;text-align: center;font-family: Bungee, cursive;">
                            ARTICLES
                        </button>
                    </form>
                    <form action="/statistics" method="get">
                        <button class="btn btn-danger" type="submit"
                                style="border: none;width: 50px;height: 30px;margin-left: 14px;background-color: #4bc4e0;font-size: 14px;opacity: 1;filter: brightness(98%) grayscale(64%);border-radius: 5px;text-align: center;font-family: Bungee, cursive;">
                            STATISTIC
                        </button>
                    </form>
                    <ul class="nav navbar-nav ml-auto">
                        <li class="nav-item"><a class="nav-link active" href="#">Регистрация</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Вход</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <div class="features-boxed">
        <div class="caption v-middle text-center">
            <h1 class="cd-headline clip">
                <span class="blc">I'm | </span>
                <span class="cd-words-wrapper">
			              <b class="is-visible">Designer.</b>
			              <b>Developer.</b>
			              <b>Creative.</b>
			            </span>
            </h1>
        </div>

        <#nested>

    </div>
    <div class="footer-basic">
        <footer>
            <p class="copyright">Blog by Sergey Ivanov © 2020</p>
        </footer>
    </div>
    <script src="/assets/js/jquery.min.js"></script>
    <script src="/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="/assets/js/Animated-Type-Heading.js"></script>
    <script src="/assets/js/Animated-Typing-With-Blinking.js"></script>
    </body>
    </html>
</#macro>