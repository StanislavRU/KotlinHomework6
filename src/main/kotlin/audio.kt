class Audio (
    id: Int? = null,
    userId: Long,
    ownerId: Long,
    val albumId: Long = 0,
    val artistId: Long = 0,
    type: String = "Audio"
) : Attachment(type, id, userId, ownerId)