<#import "basic/blog.ftl" as b>
<@b.basicpage>
    <div class="container">
        <div class="row features">
            <#list articleMap?keys as key>
                <div class="col-sm-6 col-md-4 item">
                    <div class="box">
                        <div class="image-box"></div>
                        <div class="info-box">
                            <h3 class="name">${key}</h3>
                            <p class="description">${articleMap[key]}</p><a class="learn-more" href="#">Читать далее »</a>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</@b.basicpage>
