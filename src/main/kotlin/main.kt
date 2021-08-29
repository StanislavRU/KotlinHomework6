fun main() {
}

class WallService {
    var posts = emptyArray<Post>()
    private var counter: Int = 0

    fun add(post: Post): Post {
        counter++
        val postId = post.copy(id = counter)
        posts += postId
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (post.id == postInArray.id) {
                posts[index] = post.copy(ownerId = postInArray.ownerId, date = postInArray.date)
                return true
            }
        }
        return false
    }
}

class AttachmentService {
    var attachments = emptyArray<Attachment>()
    private var counter: Long = 0

    fun addVideo(attachment: VideoAttachment): Attachment {
        counter++
        attachment.video.id = counter++
        attachments += attachment
        return attachments.last()
    }

    fun addAudio(attachment: AudioAttachment): Attachment {
        counter++
        attachment.audio.id = counter++
        attachments += attachment
        return attachments.last()
    }

    fun addPhoto(attachment: PhotoAttachment): Attachment {
        counter++
        attachment.photo.id = counter++
        attachments += attachment
        return attachments.last()
    }

    fun addDocument(attachment: DocumentAttachment): Attachment {
        counter++
        attachment.document.id = counter++
        attachments += attachment
        return attachments.last()
    }

    fun addWikiPage(attachment: WikiPageAttachment): Attachment {
        counter++
        attachment.wikiPage.id = counter++
        attachments += attachment
        return attachments.last()
    }
}
