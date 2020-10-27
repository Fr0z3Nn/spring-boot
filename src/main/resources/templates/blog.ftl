<#import "basic/basic-blog-structure.ftl" as b>
<@b.basicpage>
    <div class="container">
        <div class="row features">
            <#list articleList as article>
                <div class="col-sm-6 col-md-4 item">
                    <div class="box">
                        <div class="image-box"></div>
                        <div class="info-box">
                            <h3 class="name">${article.name}</h3>
                            <p class="description">${article.shortText}</p>
                            <form action="/article/${article.id}" method="get">
                                <button class="btn btn-danger" type="submit"
                                        style="border: none;width: 50px;height: 30px;margin-left: 14px;background-color: #4bc4e0;font-size: 12px;opacity: 1;filter: brightness(98%) grayscale(64%);border-radius: 5px;text-align: center;font-family: Bungee, cursive;">
                                    READ MORE »
                                </button>
                            </form>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</@b.basicpage>
