package ru.netology.authorid

data class Post(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    val attachment: Attachment? = null
)

data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType
)

data class Comment(
    val id: Long,
    val postId: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0
)

data class CommentWithAuthor(
    val comment: Comment,
    val commentAuthor: Author
)

data class Author(
    val id: Long,
    val name: String,
    val avatar: String
)

data class PostWithAuthorAndComments(
    val post: Post,
    val postAuthor: Author,
    val comments: List<CommentWithAuthor>
)

enum class AttachmentType {
    IMAGE
}

