package diplomado.unicafam.appdiplomat.presentation.viewModel

import diplomado.unicafam.appdiplomat.domain.entity.PostEntity
import diplomado.unicafam.appdiplomat.domain.usecase.PostUseCase

class PostViewModel {
    var useCase : PostUseCase = PostUseCase()

    fun getListPostFromViewModel():List<PostEntity>{
        return useCase.getListPostFromUseCase()
    }
}