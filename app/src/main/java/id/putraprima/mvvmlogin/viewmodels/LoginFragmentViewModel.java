package id.putraprima.mvvmlogin.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.User;

public class LoginFragmentViewModel extends ViewModel {
    public String username, password;
    private User user;
    public MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();

    public LoginFragmentViewModel(User user) {
        this.user = user;
        this.userMutableLiveData.setValue(user);
    }

    public boolean login(){
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
            return true;
        } else {
            return false;
        }
    }

    public LiveData<User> userLiveData() {
        return userMutableLiveData;
    }
}
