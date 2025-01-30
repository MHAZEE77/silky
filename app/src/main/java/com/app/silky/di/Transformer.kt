package com.app.silky.di

import com.app.silky.db.entity.*
import com.app.silky.model.*

object Transformer {

    fun convertUserModelToUserEntity(user: Users): UserEntity {
        return UserEntity(
            name = user.name,
            username = user.username,
            email = user.email,
            phone = user.phone,
            website = user.website,
            userid = user.id,
            //address = convertAddressModelToAddressEntity(),
            //company = CompanyEntity("","","")
        )
    }

    fun convertUserEntityToUserModelModel(userEntity: UserEntity): Users {
        return Users(
            id = userEntity.id,
            email = userEntity.email,
            phone = userEntity.phone,
            website = userEntity.website,
            username = userEntity.username,
            name = userEntity.name,
            address = Address("", "", "", "", Geo(0.0, 0.0)),
            company = Company("","","")
        )
    }

}