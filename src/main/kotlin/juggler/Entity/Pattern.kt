package juggler.Entity

import jdk.nashorn.internal.ir.annotations.Ignore
import javax.persistence.*

@Entity
@Table(name = "patterns")
class Pattern(
        var name: String,
        var url: String,
        @OneToMany(targetEntity = PreRequisites::class, mappedBy = "pattern")
        var preRequisites: List<PreRequisites>?,
        @Id @GeneratedValue var id: Int)