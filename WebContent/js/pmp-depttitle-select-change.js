function changChild(deptId){
	var hvtsVal = $(".hasValueTitleSelect").val();
	
	var url = "deptTitleSelectChange/titleSelectByDeptId/"+deptId;
    $.post(url,null,function(json){
        $(".titleSelect").html("");//清空职位下拉框
        $(".hasValueTitleSelect").html("");
        
        for(var i=0;i<json.titlesInDept.length;i++){  
            //添加一个职位  
            $(".titleSelect").append("<option value='"+json.titlesInDept[i].id+"'>"+json.titlesInDept[i].name+"</option>");  
            $(".hasValueTitleSelect").append("<option value='"+json.titlesInDept[i].id+"'>"+json.titlesInDept[i].name+"</option>");
        }
        $(".hasValueTitleSelect").val(hvtsVal);
    },'json');  
}  
$(function(){  
    //初始化部门下拉框  
    $.post("deptTitleSelectChange/deptAll",null,function(json){
    	var hvdsVal = $(".hasValueDeptSelect").val();

    	$(".hasValueDeptSelect").html("");
    	
        for(var i=0;i<json.deptAll.length;i++){  
            //添加一个部门  
            $(".deptSelect").append("<option value='"+json.deptAll[i].id+"'>"+json.deptAll[i].name+"</option>");
            $(".hasValueDeptSelect").append("<option value='"+json.deptAll[i].id+"'>"+json.deptAll[i].name+"</option>");
        }  
        changChild($(".deptSelect").val());
        
        $(".hasValueDeptSelect").val(hvdsVal);
        changChild( hvdsVal );
        
    },'json');  
    //注册部门下拉框事件  
    $(".deptSelect").change(function(){  
        changChild($(this).val());  
    });  
    $(".hasValueDeptSelect").change(function(){  
        changChild($(this).val());  
    });
});  
