package sindri.lab.hiltsampleapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    fun providesUserRepository() : UserRepository{
        return FirebaseRepository()
    }

}