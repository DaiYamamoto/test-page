
@import controllers.admin.form.AdminSearchForm


// 　actionのところではclass がいらない0
//form  は上の変数のフォームの意味変数
  @helper.form(action = controllers.admin.routes.AdminAbcController.showList()) {
    @helper.inputText(form(AdminSearchForm.KEY_NAME), 'class -> "aaaa");
    

  }
