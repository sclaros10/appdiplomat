package diplomado.unicafam.appdiplomat.data

import diplomado.unicafam.appdiplomat.domain.entity.PostEntity

class LocalDataSource{
    private var listPostResponse = ArrayList<PostEntity>()

    fun getListPosts():List<PostEntity> {
        listPostResponse.add(
            PostEntity(
                "Rex",
                "7 años",
                "Amigable, cariñoso, esterilizado y vacunado",
                "Macho",
                "https://conexioncapital.co/wp-content/uploads/2018/10/perros.jpg"
            )
        )

        listPostResponse.add(
            PostEntity(
                "Boris",
                "1 año",
                "Cachorro criollo entre labrador y puddle",
                "Macho",
                "https://www.elpais.com.co/files/article_graphic_small_inset/uploads/2019/07/07/5d22ae9b675ec.jpeg"
            )
        )

        listPostResponse.add(
            PostEntity(
                "Rayo",
                "6 meses",
                "Cachorro pastor australiano, vacunado, se entrega con compromiso de esterilización",
                "Macho",
                "https://img.lalr.co/cms/2018/11/21175131/Perro.jpg?size=xl"
            )
        )

        listPostResponse.add(
            PostEntity(
                "Tomodachi",
                "3 años",
                "De ascendencia japonesa, esterilizado, crece un poco más",
                "Macho",
                "https://images.unsplash.com/photo-1580064755419-883acc42900b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YWtpdGF8ZW58MHx8MHx8&auto=format&fit=crop&w=600&q=60"
            )
        )

        listPostResponse.add(
            PostEntity(
                "Vecchia",
                "7 meses",
                "Esta lobita tiene un ojo azul y otro marrón, es muy territorial",
                "Hembra",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNXWVyakOry2tXSFemiMgwxjSV6aWW8FoiGA&usqp=CAU"
            )
        )

        return listPostResponse
    }
}