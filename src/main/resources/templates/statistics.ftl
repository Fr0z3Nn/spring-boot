<#import "basic/basic-blog-structure.ftl" as b>
<@b.basicpage>
<div>
    <div class="bootstrap_datatables">
        <div class="container py-5">
            <header class="text-center text-black">
                <h1 class="display-4">Users Statistics</h1>
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
                                        <th>Nickname</th>
                                        <th>Registration DATE</th>
                                        <th>Number of Articles</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <#list userList as user>
                                        <tr>
                                            <td>${user.id}</td>
                                            <td><#if user.nickname??>${user.nickname}<#else>Не указан</#if></td>
                                            <td><#if user.dateOfRegistration??>${user.dateOfRegistration}<#else>Не указан</#if></td>
                                            <td><#if user.articleList?size??>${user.articleList?size}<#else>0</#if></td>
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