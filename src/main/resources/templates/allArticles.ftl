<#import "basic/basic-blog-structure.ftl" as b>
<@b.basicpage>
<div>
    <div class="bootstrap_datatables">
        <div class="container py-5">
            <header class="text-center text-black">
                <h1 class="display-4">All Articles</h1>
            </header>
            <div class="row py-5">
                <div class="col-lg-10 mx-auto">
                    <div class="card rounded shadow border-0">
                        <div class="card-body p-5 bg-white rounded">
                            <div class="table-responsive">
                                <table id="example" style="width:100%" class="table table-striped table-bordered">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Title</th>
                                        <th>Date</th>
                                        <th>Action</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <#list allArticles as article>
                                        <tr>
                                            <td>${article.id}</td>
                                            <td><#if article.name??>${article.name}<#else>Не указан</#if></td>
                                            <td><#if article.dateOfCreate??>${article.dateOfCreate}<#else>Не указан</#if></td>
                                            <td>
                                                <form action="/article/${article.id}" method="get">
                                                    <button class="btn btn-danger" type="submit"
                                                            style="border: none;width: 50px;height: 30px;margin-left: 14px;background-color: #4bc4e0;font-size: 12px;opacity: 1;filter: brightness(98%) grayscale(64%);border-radius: 5px;text-align: center;font-family: Bungee, cursive;">
                                                        READ MORE »
                                                    </button>
                                                </form>
                                            </td>
                                        </tr>
                                    </#list>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</@b.basicpage>