$(document).ready(function () {
	findTollInfo();
});


function findTollInfo(){
	debugger;
	console.log(11111);
	var pageCurrent=1;
	var url="coursewareInfo/getTollInfo.do";
	var params={"pageCurrent":pageCurrent};
	$.ajax({
		url:url,
		data:params,
		type:"POST",
		aynsc:false,
		success:function (data) {
			var totallInfos=data.data;
        },
        error:function (data) {
			alert("错误");
        }
	});

}

function setTableBody(totalInfos) {
    var Thtml = "";
    for (var x in totalInfos) {
        Thtml += "<tr>" +
            "<td><input type='checkbox'></td>" +
            "<td>" + totalInfos[x].id + "</td>" +
            "<td>" + totalInfos[x].coursewareName + "</td>" +
            "<td>" + totalInfos[x].typeId + "</td>" +
            "<td>" + totalInfos[x].uploadPerson + "</td>" +
            "<td>" + totalInfos[x].uploadTime + "</td>" +
            "<td><button type='button' >修改</button></td>" +
            "</tr>";
        $("tbodyId").html(Thtml);
    }
}