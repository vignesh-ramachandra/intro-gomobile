package demo

import (
	"testing"
	"fmt"
	"github.com/stretchr/testify/assert"
	"github.com/golang/protobuf/proto"
	"github.com/demo/go-viewmodel"
)

type TestApiCallbacks struct {
	responseString []byte
	errorString    string
}

var testAPICallback *TestApiCallbacks

func (testAPICallback *TestApiCallbacks) OnSuccessResponse(response []byte) {
	testAPICallback.responseString = response
}

func (testAPICallback *TestApiCallbacks) OnErrorResponse(err string) {
	testAPICallback.errorString = err
}

func init() {
	testAPICallback = &TestApiCallbacks{}
}

func TestGetUserViewModel(t *testing.T) {
	GetUserViewModel(testAPICallback)
	if testAPICallback.errorString != "" {
		fmt.Println(testAPICallback.errorString)
		return
	}
	userViewModel := &go_viewmodel.UserViewModel{}
	proto.Unmarshal(testAPICallback.responseString, userViewModel)
	assert.NotEmpty(t, userViewModel.Name)
	fmt.Println(userViewModel)
}
