package demo

import (
	"fmt"
	"github.com/golang/protobuf/proto"
	"github.com/demo/go-viewmodel"
	"encoding/json"
)

type APIResponse interface {
	OnSuccessResponse(response []byte)
	OnErrorResponse(err string)
}

func GetUserViewModel(mobileCallback APIResponse) {
	user, err := getUserApiModel()
	if err != nil {
		fmt.Println(err)
		mobileCallback.OnErrorResponse(err.Error())
		return
	}
	userViewModel := &go_viewmodel.UserViewModel{
		Name: fmt.Sprintf("%s %s %s", user.FirstName, user.MiddleName, user.LastName),
	}
	json.Marshal(userViewModel)
	data, err := proto.Marshal(userViewModel)
	if err != nil {
		mobileCallback.OnErrorResponse(err.Error())
	}
	mobileCallback.OnSuccessResponse(data)
}
