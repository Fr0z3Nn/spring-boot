<#import "basic/basic-blog-structure.ftl" as b>
<@b.basicpage>
    <div>
        <div class="bootstrap_datatables">
            <div class="container py-5">
                <header class="text-center text-black">
                    <h1 class="display-4">${articleOnly.name}</h1>
                </header>
                <div class="row py-5">
                    <div class="col-lg-10 mx-auto">
                        <div class="card rounded shadow border-0">
                            <div class="card-body p-5 bg-white rounded">
                                <div class="table-responsive">
                                    ${articleOnly.text}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</@b.basicpage>