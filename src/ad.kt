fun main() {
    val likes: Int = 23

    val likesMessage = when {
        likes % 10 == 1 && likes % 100 != 11 -> "$likes лайк"
        (likes % 10 in 2..4) && (likes % 100 !in 12..14) -> "$likes лайка"
        else -> "$likes лайков"
    }

    println(likesMessage)
}