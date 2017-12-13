
function login(){
	var username = $("#username").val();
	var password = $("#password").val();

	if(("root"==username)&&("root"==password)){
		layer.alert('登录成功', {
			icon: 1,
			skin: 'layer-ext-moon'
		})
	}
	else{
		layer.alert('登录失败', {
			icon: 2,
			skin: 'layer-ext-moon'
		})
	}
}