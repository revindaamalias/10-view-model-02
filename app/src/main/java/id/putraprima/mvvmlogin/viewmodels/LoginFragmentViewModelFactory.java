package id.putraprima.mvvmlogin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.mvvmlogin.models.User;

public class LoginFragmentViewModelFactory implements ViewModelProvider.Factory {
    private User user;

    public LoginFragmentViewModelFactory(User user){
        this.user = user;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(LoginFragmentViewModel.class)){
            return(T) new LoginFragmentViewModel(user);
        }
        throw new IllegalArgumentException("Unknown ViewModel Class");
    }
}
