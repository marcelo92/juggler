package juggler.Repositories

import juggler.Entity.Pattern
import org.springframework.data.repository.CrudRepository

interface PatternsRepository : CrudRepository<Pattern, Long> {
    fun findByName(name: String): Pattern?
}