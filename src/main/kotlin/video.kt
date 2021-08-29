class Video(
    id: Int? = null,
    userId: Long,
    ownerId: Long,
    val albumId: Long = 0,
    val categoryId: Int = 0,
    type: String = "Video"
) : Attachment(type, id, userId, ownerId)