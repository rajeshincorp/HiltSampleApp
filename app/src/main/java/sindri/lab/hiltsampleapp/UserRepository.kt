package sindri.lab.hiltsampleapp

import javax.inject.Inject

const val TAG = "UserRepo"

class UserRepository @Inject constructor(val loggerService: LoggerService){
    fun saveUser(email: String, password: String) {
          loggerService.log("User saved in DB")
    }
}