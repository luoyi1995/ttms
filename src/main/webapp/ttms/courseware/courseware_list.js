$(document).ready(function () {
	findTollInfo();
	$("#queryFormId").on("click",".btn-search",doFindTotalInfo);
});

function doFindTotalInfo(){
    $("#pageId").data("pageCurrent",1);
    findTollInfo();
}


/**
 * 获得所有课件信息
 */
function findTollInfo(){
    var pageCurrent=$("#pageId").data("pageCurrent");
    var name=$("#searchNameId").val();
    var type=$("#searchValidId").val();
    if(pageCurrent==null){
    	pageCurrent=1;
	}
	var url="coursewareInfo/getTollInfo.do";
	var params={
		"pageCurrent":pageCurrent,
		"name":name,
		"type":type
	};
	$.post(url,params,function(result){
		var resultMap=result.data;
		setTableBody(resultMap.coursewareInfos);
		//设置分页信息
		setPagination(resultMap.pageObject);
		//设置课件类别下拉框(只执行一次)
		if(!$("#searchValidId").hasClass("exist")){
            setSearchValid(resultMap.coursewareTypeList);
        }

	});

}

/**
 * 课件信息列表填写
 * @param totalInfos
 */
function setTableBody(totalInfos) {
    var Thtml = "";
    for (var x in totalInfos) {
        Thtml += "<tr>" +
            "<td><input type='checkbox'></td>" +
            "<td>" + totalInfos[x].ID + "</td>" +
            "<td>" + totalInfos[x].COURSEWARE_NAME + "</td>" +
            "<td>" + totalInfos[x].typeName + "</td>" +
            "<td>" + totalInfos[x].UPLOAD_PERSON + "</td>" +
            "<td>" + totalInfos[x].UPLOAD_TIME + "</td>" +
            "<td><button type='button' >详情</button></td>" +
            "</tr>";
        $("#tbodyId").html(Thtml);
    }
}

/**
 * 设置课件类别下拉框
 * @param list
 */
function setSearchValid(list){
	var validHtml="";
	for(var i in list){
		validHtml="<option value="+list[i].id+">"+list[i].typeName+"</option>" ;
        $("#searchValidId").append(validHtml);
        $("#searchValidId").addClass("exist");
    }
}