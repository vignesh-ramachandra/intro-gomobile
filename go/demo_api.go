package demo

import (
	"io/ioutil"
	"fmt"
	"encoding/json"
)

type UserResponse struct {
	User *User `json:"user"`
}

// Gets the json from the file user.json instead of api
func getUserApiModel() (*User, error) {
	data, err := ioutil.ReadFile("user.json")
	if err != nil {
		fmt.Println("File error", err)
		return nil, err
	}
	userResponse := &UserResponse{}
	err = json.Unmarshal(data, userResponse)
	if err != nil {
		fmt.Println("Json error", err)
		return nil, err
	}
	return userResponse.User, nil
}