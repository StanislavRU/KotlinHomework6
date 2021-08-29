abstract class Attachment (val type: String, id: Int?, val userId: Long, val ownerId: Long) {
    var id = id
        set (value) {
            if (value != null) {
                if (value < 0) {
                    return
                }
            }
            field = value
        }
    }