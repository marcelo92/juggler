package juggler.Entity

import javax.persistence.*

@Entity
@Table(name = "patterns")
class Pattern(
        var name: String,
        var url: String,
        @OneToMany(targetEntity = PreRequisites::class, mappedBy = "patternId")
        var preRequisites: List<PreRequisites>?,
        @Id @GeneratedValue var id: Int) {
}