package juggler.Entity

import java.io.Serializable
import javax.persistence.*

@Embeddable
class PrerequisitesId (
        var pattern: Int,
        var dependsOnPattern: Int
) : Serializable

@Entity
@Table(name = "prerequisites")
@IdClass(PrerequisitesId::class)
class PreRequisites(
        @Id
        @Column(name = "pattern_id")
        var pattern: Int,
        @ManyToOne
        @Id
        var dependsOnPattern: Pattern
)