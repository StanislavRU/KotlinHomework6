class File(
    id: Int? = null,
    userId: Long,
    ownerId: Long,
    val description: String? = null,
    type: String = "File"
) : Attachment(type, id, userId, ownerId)