class Document(
    id: Int? = null,
    userId: Long,
    ownerId: Long,
    val size: Long = 0,
    val title: Int = 0,
    val ext: String? = null,
    type: String = "Document"
) : Attachment(type, id, userId, ownerId)