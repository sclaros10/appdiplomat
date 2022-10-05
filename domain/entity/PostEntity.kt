package diplomado.unicafam.appdiplomat.domain.entity

import android.graphics.Picture

data class PostEntity(
    var fullName: String = "",
    var userName: String = "",
    var post: String = "",
    var hashtag: String = "",
    var imgProfile: String = ""
)
