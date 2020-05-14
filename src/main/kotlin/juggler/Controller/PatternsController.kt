package juggler.Controller

import juggler.Entity.Pattern
import juggler.Repositories.PatternsRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PatternsController(val patternsRepository: PatternsRepository) {

    @GetMapping("/patterns")
    fun getPatterns(): List<Any> {
        return patternsRepository.findAll().toList();
    }

    @GetMapping("/pattern/{name}")
    fun getPatternByName(@PathVariable name: String): Pattern? {
        return patternsRepository.findByName(name);
    }

}