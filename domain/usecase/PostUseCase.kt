package diplomado.unicafam.appdiplomat.domain.usecase

import diplomado.unicafam.appdiplomat.data.LocalDataSource
import diplomado.unicafam.appdiplomat.domain.entity.PostEntity

class PostUseCase{
    var localDataSource:LocalDataSource = LocalDataSource()
    fun getListPostFromUseCase():List<PostEntity>{
        return localDataSource.getListPosts()
    }

    fun likePost() {
        println("You've liked this post")
    }
}
