class Photo(
    id: Int? = null,
    userId: Long,
    ownerId: Long,
    val albumId: Long = 0,
    type: String = "Photo"
) : Attachment(type, id, userId, ownerId)