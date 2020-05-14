package juggler.Entity

import javax.persistence.*

@Entity
@Table(name = "prerequisites")
class PreRequisites(
        @Id var id: Long?,
        @ManyToOne
        var patternId: Pattern,
        @ManyToOne
        var depends_on_pattern_id: Pattern
)