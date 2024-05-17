package sindri.lab.hiltsampleapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(SingletonComponent::class)
@Module
class UserModule {

    @Named("Sql")
    @Provides
    fun providesSQLRepository(sqlRepository: SQLRepository) : UserRepository{
        return sqlRepository
    }

    @FirebaseQualifier
    @Provides
    fun providesUserRepository() : UserRepository{
        return FirebaseRepository()
    }

}