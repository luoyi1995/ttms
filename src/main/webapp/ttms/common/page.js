$(document).ready(function () {
    $("#pageId").on("click",".pre,.next,.first,.last",jumpToPage);
});

function setPagination(pageObject){
    var pageCurrent=pageObject.pageCurrent;
    var pageCount=pageObject.pageCount;
    $(".pageCount").html("总页数("+pageCount+")");
    $(".pageCurrent").html("当前页("+pageCurrent+")");

    $("#pageId").data("pageCurrent",pageCurrent);
    $("#pageId").data("pageCount",pageCount);
}

function jumpToPage() {
    var pageCount=$("#pageId").data("pageCount");
    var pageCurrent=$("#pageId").data("pageCurrent")
    var clazz=$(this).attr("class");
    if(clazz=="first"){
        pageCurrent=1;
    }
    if(clazz=="pre"&&pageCurrent!=1){
        pageCurrent--;
    }
    if(clazz=="next"&&pageCurrent<pageCount){
        pageCurrent++;
    }
    if(clazz=="last"){
        pageCurrent=pageCount;
    }
    $("#pageId").data("pageCurrent",pageCurrent);
    findTollInfo();
}