package sindri.lab.hiltsampleapp

import android.util.Log

const val TAG = "UserRepo"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository : UserRepository {

    override fun saveUser(email: String, password: String) {
          Log.d(TAG,"User saved in SQL DB")
    }

}

class FirebaseRepository : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in Firebase DB")
    }

}