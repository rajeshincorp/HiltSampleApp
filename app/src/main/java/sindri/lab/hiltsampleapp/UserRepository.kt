package sindri.lab.hiltsampleapp

import android.util.Log
import javax.inject.Inject

const val TAG = "UserRepo"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
          Log.d(TAG,"User saved in SQL DB")
    }

}

class FirebaseRepository : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in Firebase DB")
    }

}